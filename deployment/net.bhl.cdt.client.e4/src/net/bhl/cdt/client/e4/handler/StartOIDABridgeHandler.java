//
//package net.bhl.cdt.client.e4.handler;
//
//import java.io.File;
//
//import org.eclipse.e4.core.di.annotations.Execute;
//import org.eclipse.e4.ui.model.application.MApplication;
//import org.eclipse.e4.ui.model.application.ui.basic.MPart;
//import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
//import org.eclipse.e4.ui.workbench.modeling.EModelService;
//import org.eclipse.e4.ui.workbench.modeling.EPartService;
//import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
//import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
//import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
//import org.eclipse.emf.ecore.EObject;
//
//import net.bhl.cdt.model.datatypes.impl.CompositeValuesImpl;
//import oida.bridge.service.IOIDABridge;
//import oida.bridge.service.OIDABridgeException;
//import oida.bridge.ui.e4.part.MappingViewPart;
//import oida.bridge.ui.e4.part.PrimaryRecommendationsViewPart;
//import oida.bridge.ui.e4.part.SecondaryRecommendationsViewPart;
//import oida.util.OIDAUtil;
//
//public class StartOIDABridgeHandler {
//	private boolean invoked = false;
//
//	@Execute
//	public void execute(IOIDABridge oidaBridge, EModelService modelService, EPartService partService,
//			ESelectionService selectionService, MApplication app) {
//
//		selectionService.addSelectionListener("org.eclipse.emf.ecp.e4.application.part.navigator",
//				new ISelectionListener() {
//					@Override
//					public void selectionChanged(MPart part, Object selection) {
//						selectionService.setSelection(selection);
//
//						EObject modelObj = (EObject) selection;
//						while (modelObj.eContainer().eClass() == net.bhl.cdt.model.datatypes.DatatypesPackage.eINSTANCE.getCompositeValues())
//							modelObj = modelObj.eContainer();
//
//						if (!invoked) {
//							try {
//								if (oidaBridge != null) {
//									oidaBridge.invokeModelObservation(modelObj, new File(OIDAUtil.getOIDAWorkPath()), "modelont.owl");
//									MPart oidaPrimaryRecommendationPart = partService
//											.createPart(PrimaryRecommendationsViewPart.PART_ID);
//									MPart oidaSecondaryRecommendationPart = partService
//											.createPart(SecondaryRecommendationsViewPart.PART_ID);
//									MPart mappingPart = partService.createPart(MappingViewPart.PART_ID);
//
//									MPartStack bottomPartStack = (MPartStack) modelService
//											.find("net.bhl.cdt.client.e4.partstack.bottom", app);
//									MPartStack additionsPartStack = (MPartStack) modelService
//											.find("net.bhl.cdt.client.e4.partstack.bottom", app);
//
//									if (bottomPartStack != null && oidaPrimaryRecommendationPart != null) {
//										bottomPartStack.getChildren().add(oidaPrimaryRecommendationPart);
//										bottomPartStack.getChildren().add(oidaSecondaryRecommendationPart);
//										additionsPartStack.getChildren().add(mappingPart);
//										partService.showPart(mappingPart, PartState.ACTIVATE);
//										partService.showPart(oidaPrimaryRecommendationPart, PartState.ACTIVATE);
//									}
//
//									invoked = true;
//								}
//							} catch (OIDABridgeException e) {
//								e.printStackTrace();
//							}
//						}
//
//						if (oidaBridge != null) {
//							oidaBridge.reportModelSelectionChanged(modelObj, (EObject)selection);
//						}
//					}
//				});
//
//	}
//}