/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
/**
 * Code fragments from EMFStore Version 1.1.0
 */

package net.bhl.cdt.trace.ui.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.internal.client.common.UnknownEMFStoreWorkloadCommand;
import org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.connectionmanager.ServerCall;
import org.eclipse.emf.emfstore.internal.client.model.exceptions.UnkownProjectException;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESLocalProjectImpl;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.emf.emfstore.internal.client.ui.controller.AbstractEMFStoreUIController;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.internal.server.model.impl.api.ESHistoryInfoImpl;
import org.eclipse.emf.emfstore.internal.server.model.versioning.ChangePackage;
import org.eclipse.emf.emfstore.internal.server.model.versioning.HistoryInfo;
import org.eclipse.emf.emfstore.internal.server.model.versioning.ModelElementQuery;
import org.eclipse.emf.emfstore.internal.server.model.versioning.PrimaryVersionSpec;
import org.eclipse.emf.emfstore.internal.server.model.versioning.RangeQuery;
import org.eclipse.emf.emfstore.internal.server.model.versioning.VersioningFactory;
import org.eclipse.emf.emfstore.internal.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.internal.server.model.versioning.util.HistoryQueryBuilder;
import org.eclipse.emf.emfstore.server.exceptions.ESException;
import org.eclipse.emf.emfstore.server.model.ESHistoryInfo;
import org.eclipse.emf.emfstore.server.model.query.ESHistoryQuery;
import org.eclipse.emf.emfstore.server.model.query.ESModelElementQuery;
import org.eclipse.emf.emfstore.server.model.query.ESRangeQuery;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * This Command retrieves all contributing users of a given ModelElement.
 * 
 * @author martin.glas
 */
@SuppressWarnings("restriction")
public class GetContributingUsersCommand {
	private final EObject input;
	private final Shell shell;
	private EObject modelElement;
	private ProjectSpace projectSpace;
	private List<HistoryInfo> infos;
	private static final int UPPER_LIMIT = 10;
	private static final int LOWER_LIMIT = 20;
	private PrimaryVersionSpec centerVersion;
	private boolean showAllVersions = true;

	/**
	 * Constructor.
	 * 
	 * @param shell the parent {@link Shell}
	 * @param modelElement the model element whose history should be displayed
	 */
	public GetContributingUsersCommand(Shell shell, EObject modelElement) {
		this.shell = shell;
		input = modelElement;
	}

	/**
	 * Constructor.
	 * 
	 * @param shell the parent {@link Shell}
	 * @param localProject the {@link ESLocalProject} whose history should be displayed
	 */
	public GetContributingUsersCommand(Shell shell, ESLocalProject localProject) {
		this.shell = shell;
		input = ((ESLocalProjectImpl) localProject).toInternalAPI();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.emfstore.internal.client.ui.common.MonitoredEMFStoreAction#doRun(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void execute() {
		if (input instanceof ProjectSpace) {
			this.projectSpace = (ProjectSpace) input;
		} else if (input != null) {
			ESWorkspaceImpl workspace = ESWorkspaceProviderImpl.getInstance().getWorkspace();
			try {
				this.projectSpace = workspace.toInternalAPI().getProjectSpace(ModelUtil.getProject(input));
			} catch (UnkownProjectException e) {
				e.printStackTrace();
			}
		} else {
			this.projectSpace = null;
		}
		this.modelElement = input;
		setCenterVersion();

		List<EObject> modelElements = new LinkedList<EObject>();
		modelElements.add(modelElement);

		// System.err.println("\n -------------------");
		// for (EObject obj : getElements(new LinkedList<EObject>(), modelElements)){
		// System.err.println(obj);
		// }
		// System.err.println(" -------------------");

		LinkedList<String> authors = new LinkedList<String>();
		String author;

		for (EObject obj : GetContributingUsersHelper.getAllContributingElements(new LinkedList<EObject>(),
			modelElements)) {
			this.modelElement = obj;
			infos = getHistoryInfos();
			author = GetContributingUsersHelper.getLastAuthor(infos);
			if (!authors.contains(author)) {
				authors.add(author);
			}
		}

		// System.err.println("\n -------------------");
		// for (String str : authors){
		// System.err.println(str);
		// }
		// System.err.println(" -------------------");

		ListDialog listDialog = new ListDialog(this.shell);

		listDialog.setLabelProvider(new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));

		listDialog.setContentProvider(new AdapterFactoryContentProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)) {
			@Override
			public Object[] getElements(Object object) {
				if (object instanceof Object[]) {
					return (Object[]) object;
				}
				return super.getElements(object);
			}
		});

		listDialog.setInput(authors.toArray());

		listDialog.setTitle("Contributing Users");
		listDialog.open();
	}

	private List<HistoryInfo> getHistoryInfos() {
		List<HistoryInfo> result = new AbstractEMFStoreUIController<List<HistoryInfo>>(shell, true, false) {
			@Override
			public List<HistoryInfo> doRun(final IProgressMonitor monitor) throws ESException {
				return new UnknownEMFStoreWorkloadCommand<List<HistoryInfo>>(monitor) {
					@Override
					public List<HistoryInfo> run(final IProgressMonitor monitor) throws ESException {
						List<HistoryInfo> historyInfosFromServer = getHistoryInfosFromServer(monitor);
						return historyInfosFromServer;
					}
				}.execute(); // UnknownEMFStoreWorkloadCommand
			}
		}.execute(); // AbstractEMFStoreUIController

		return (result != null) ? result : new ArrayList<HistoryInfo>();
	}

	private List<HistoryInfo> getHistoryInfosFromServer(final IProgressMonitor monitor) throws ESException {

		return new ServerCall<List<HistoryInfo>>(projectSpace) {
			@Override
			protected List<HistoryInfo> run() throws ESException {
				monitor.beginTask("Fetching history form server", 100);
				List<HistoryInfo> historyInfos = getLocalChanges();
				monitor.worked(10);
				if (projectSpace != modelElement) {
					List<ESHistoryInfo> infos = modelElementQuery();
					for (ESHistoryInfo info : infos) {
						historyInfos.add(((ESHistoryInfoImpl) info).toInternalAPI());
					}
				} else {
					// TODO monitor
					List<ESHistoryInfo> infos = rangeQuery();
					for (ESHistoryInfo info : infos) {
						historyInfos.add(((ESHistoryInfoImpl) info).toInternalAPI());
					}
				}
				monitor.worked(90);
				return historyInfos;
			}

		}.execute(); // ServerCall
	}

	private List<HistoryInfo> getLocalChanges() {
		ArrayList<HistoryInfo> revisions = new ArrayList<HistoryInfo>();
		if (projectSpace != null) {
			// TODO: add a feature "hide local revision"
			HistoryInfo localHistoryInfo = VersioningFactory.eINSTANCE.createHistoryInfo();
			ChangePackage changePackage = (ChangePackage) projectSpace.getLocalChangePackage(false);
			// filter for modelelement, do additional sanity check as the
			// project space could've been also selected
			if (modelElement != null && projectSpace.getProject().contains(modelElement)) {
				Set<AbstractOperation> operationsToRemove = new LinkedHashSet<AbstractOperation>();
				for (AbstractOperation ao : changePackage.getOperations()) {
					if (!ao.getAllInvolvedModelElements().contains(
						ModelUtil.getProject(modelElement).getModelElementId(modelElement))) {
						operationsToRemove.add(ao);
					}
				}
				changePackage.getOperations().removeAll(operationsToRemove);
			}
			localHistoryInfo.setChangePackage(changePackage);
			PrimaryVersionSpec versionSpec = VersioningFactory.eINSTANCE.createPrimaryVersionSpec();
			versionSpec.setIdentifier(-1);
			localHistoryInfo.setPrimarySpec(versionSpec);
			localHistoryInfo.setPreviousSpec(ModelUtil.clone(projectSpace.getBaseVersion()));
			revisions.add(localHistoryInfo);
		}
		return revisions;
	}

	private List<ESHistoryInfo> modelElementQuery() throws ESException {
		ModelElementQuery query = HistoryQueryBuilder.modelelementQuery(centerVersion,
			Arrays.asList(ModelUtil.getModelElementId(modelElement)), UPPER_LIMIT, LOWER_LIMIT, showAllVersions, true);
		// TODO: proivde util method
		ESHistoryQuery<ESModelElementQuery> api = query.toAPI();
		List<ESHistoryInfo> infos = projectSpace.toAPI().getHistoryInfos(api, new NullProgressMonitor());
		return infos;
	}

	private List<ESHistoryInfo> rangeQuery() throws ESException {
		@SuppressWarnings("unchecked")
		RangeQuery<ESRangeQuery<ESRangeQuery<?>>> rangeQuery = (RangeQuery<ESRangeQuery<ESRangeQuery<?>>>) HistoryQueryBuilder.rangeQuery(centerVersion,
			UPPER_LIMIT, LOWER_LIMIT, showAllVersions, true, true, true);
		List<ESHistoryInfo> infos = projectSpace.toAPI().getHistoryInfos(rangeQuery.toAPI(), new NullProgressMonitor());
		return infos;
	}

	private void setCenterVersion() {
		if (this.projectSpace != null) {
			centerVersion = projectSpace.getBaseVersion();
		} else {
			centerVersion = null;
		}
	}
}
