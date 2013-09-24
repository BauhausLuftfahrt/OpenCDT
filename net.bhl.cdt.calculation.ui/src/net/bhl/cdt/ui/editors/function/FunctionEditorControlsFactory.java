/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.ui.editors.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import net.bhl.cdt.calculationrepository.functions.CalculationScript;
import net.bhl.cdt.calculationrepository.functions.Function;
import net.bhl.cdt.calculationrepository.functions.ScilabFunction;
import net.bhl.cdt.utilities.commands.CDTCommand;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

/**
 * Creates controls for the FunctionEditor based on the type of the function.
 * 
 * @author Sebastian Höcht
 */
@SuppressWarnings("restriction")
public class FunctionEditorControlsFactory {

	private static final String ANNO_TYPE = "com.mycompany.element";
	private static final String ANNO_KEY_HIGHLIGHT = "annotateElemHighlight";
	private static final String ANNO_KEY_OVERVIEW = "annotateElemOverviewRuler";
	private static final String ANNO_KEY_VERTICAL = "annotateElemVertialRuler";
	private static final String ANNO_KEY_TEXT = "annotateElemText";
	private static final String ANNO_KEY_COLOR = "annotateElemColor";

	/**
	 * 
	 * @param function
	 *            the Function
	 * @param parent
	 *            the parent SWT control
	 * @return a list of Pages that shall be added to the MultiPageEditorPart
	 */
	public ArrayList<Page> createControls(Function function, Composite parent) {
		if (function instanceof ScilabFunction) {
			return createScilabControls(parent, function);
		} else {
			return new ArrayList<Page>();
		}
	}

	/**
	 * A simple wrapper class, that gives a SWT Control a name.
	 * 
	 * @author Sebastian Höcht
	 */
	public class Page {

		/**
		 * Add the control as a new TabItem to the TabBar.
		 */
		public static final int POSITION_TABITEM = 0;

		/**
		 * Append the control to the bottom of the Editor.
		 */
		public static final int POSITION_APPEND = 1;

		private String pageName;
		private Control control;
		private int position = POSITION_TABITEM;

		/**
		 * @param pageName
		 *            the pageName to set
		 */
		public void setPageName(String pageName) {
			this.pageName = pageName;
		}

		/**
		 * @return the pageName
		 */
		public String getPageName() {
			return pageName;
		}

		/**
		 * @param control
		 *            the control to set
		 */
		public void setControl(Control control) {
			this.control = control;
		}

		/**
		 * @return the control
		 */
		public Control getControl() {
			return control;
		}

		/**
		 * @param position
		 *            the position to set
		 */
		public void setPosition(int position) {
			this.position = position;
		}

		/**
		 * @return the position
		 */
		public int getPosition() {
			return position;
		}
	}

	private Page createScriptTextPage(Composite parent,
			final CalculationScript function) {
		// http://dev.eclipse.org/newslists/news.eclipse.platform/msg75548.html
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = 1;
		Button importButton = new Button(composite, SWT.PUSH);
		importButton.setText("Import");
		final FileDialog fileDialog = new FileDialog(composite.getShell());

		// IVerticalRuler ruler = new LinesCounter();
		ISharedTextColors sharedColors = EditorsPlugin.getDefault()
				.getSharedTextColors();
		IOverviewRuler overviewRuler = new OverviewRuler(null, 12, sharedColors);
		CompositeRuler ruler = new CompositeRuler(12);

		final Document document = new Document();
		document.set(function.getScriptText());
		document.addDocumentListener(new IDocumentListener() {

			@Override
			public void documentChanged(DocumentEvent event) {
				CDTCommand command = new CDTCommand() {

					@Override
					protected void doRun() {
						function.setScriptText(document.get());
					}
				};
				command.execute();
			}

			@Override
			public void documentAboutToBeChanged(DocumentEvent event) {
			}
		});

		AnnotationModel annotationModel = new AnnotationModel();
		annotationModel.connect(document);

		final SourceViewer scriptText = new SourceViewer(composite, ruler,
				overviewRuler, true, SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI
						| SWT.BORDER | SWT.FULL_SELECTION);
		scriptText.configure(new SourceViewerConfiguration());
		SourceViewerDecorationSupport sds = new SourceViewerDecorationSupport(
				scriptText, overviewRuler, null, sharedColors);
		AnnotationPreference ap = new AnnotationPreference();
		ap.setColorPreferenceKey(ANNO_KEY_COLOR);
		ap.setHighlightPreferenceKey(ANNO_KEY_HIGHLIGHT);
		ap.setVerticalRulerPreferenceKey(ANNO_KEY_VERTICAL);
		ap.setOverviewRulerPreferenceKey(ANNO_KEY_OVERVIEW);
		ap.setTextPreferenceKey(ANNO_KEY_TEXT);
		ap.setAnnotationType(ANNO_TYPE);
		sds.setAnnotationPreference(ap);
		sds.install(EditorsPlugin.getDefault().getPreferenceStore());
		scriptText.setDocument(document, annotationModel);
		ruler.addDecorator(0, new LineNumberRulerColumn());

		importButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String filePath = fileDialog.open();
				try {
					scriptText.getTextWidget().setText(
							readFileAsString(filePath));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.out.println(filePath);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		scriptText.getTextWidget().addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				CDTCommand command = new CDTCommand() {

					@Override
					protected void doRun() {
						function.setScriptText(document.get());
					}
				};
				command.execute();
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});

		GridLayoutFactory.fillDefaults().applyTo(scriptText.getTextWidget());
		GridDataFactory.fillDefaults().grab(true, true)
				.applyTo(scriptText.getTextWidget());
		GridDataFactory.fillDefaults().grab(true, true)
				.applyTo(scriptText.getControl());
		Page page = new Page();
		page.setPageName("Script Text");
		page.setControl(composite);
		return page;
	}

	/**
	 * Shows the line number left of the styled text code editor.
	 * 
	 * @author Sebastian Höcht
	 * 
	 */
	class LinesCounter implements IVerticalRuler {

		private Control control;

		@Override
		public int toDocumentLineNumber(int yCoordinate) {
			return yCoordinate;
		}

		@Override
		public int getWidth() {
			return 15;
		}

		@Override
		public int getLineOfLastMouseButtonActivity() {
			return 2;
		}

		@Override
		public Control getControl() {
			return control;
		}

		@Override
		public void update() {
			// TODO Auto-generated method stub

		}

		@Override
		public void setModel(IAnnotationModel model) {
			// TODO Auto-generated method stub

		}

		@Override
		public IAnnotationModel getModel() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Control createControl(Composite parent, ITextViewer textViewer) {
			Button button = new Button(parent, SWT.PUSH);
			this.control = button;
			button.setText("test");
			return button;
		}
	}

	private ArrayList<Page> createScilabControls(Composite parent,
			Function function) {
		ArrayList<Page> pages = new ArrayList<Page>();
		Page scriptText = this.createScriptTextPage(parent,
				(CalculationScript) function);
		// scriptText.setPosition(Page.POSITION_APPEND);
		pages.add(scriptText);
		return pages;
	}

	private static String readFileAsString(String filePath)
			throws java.io.IOException {
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}
}
