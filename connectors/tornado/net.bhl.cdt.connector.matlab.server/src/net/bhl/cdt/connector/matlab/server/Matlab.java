package net.bhl.cdt.connector.matlab.server;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;
import matlabcontrol.MatlabProxyFactoryOptions;


public class Matlab {

	


	

	


		public boolean isup(){
	
	MatlabProxy matlabProxy;

	
		MatlabProxyFactoryOptions builderOptions = new MatlabProxyFactoryOptions.Builder()
		.setHidden(true).setUsePreviouslyControlledSession(true)
		.build();
		MatlabProxyFactory matlabProxyFactory = new MatlabProxyFactory(builderOptions);
		try {
			matlabProxy = matlabProxyFactory.getProxy();
		
					matlabProxy.eval("");
					matlabProxy.disconnect();
					return true;
					
		} catch (MatlabInvocationException | MatlabConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public Object tornado(double Ma, double alt, double density, double sweep, double alpha) {
		Hashtable<String, double[]> resultHashtable= new Hashtable<String, double[]>();
		MatlabProxy matlabProxy;
//		Object[] doubleResult=new Object[3];
		

		 
		try {
			MatlabProxyFactoryOptions builderOptions = new MatlabProxyFactoryOptions.Builder()
			.setHidden(true).setUsePreviouslyControlledSession(true)
			.build();
	MatlabProxyFactory matlabProxyFactory = new MatlabProxyFactory(builderOptions);
			matlabProxy = matlabProxyFactory.getProxy();
			matlabProxy.eval("addpath(genpath('T:/Martin Glas/T135_export_uk/'))");
			
			double[] params = new double[5];
			params[0]=Ma;
			params[1]=alt;
			params[2]=density;
			params[3]=sweep;
			params[4]=alpha;
			Object[] result=  matlabProxy.returningEval("main_onera("+Ma+","+alt+","+density+","+sweep+","+alpha+")", 1);
			Object[] resultstruct=(Object[]) result[0];
			String[] structNames= (String[])resultstruct[0];
			Object[] structValuesContainer= (Object[]) resultstruct[1];
			Object[] structValues=(Object[]) structValuesContainer[0];
			for (int i=0; i<structValues.length; i++){
				resultHashtable.put(structNames[i], (double[])structValues[i]);
			}
			
			
			

			
			matlabProxy.disconnect();

		} catch (MatlabConnectionException | MatlabInvocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Object[]{resultHashtable};
		}
	
	
	
	
		public double sqrt(double argument) {
			MatlabProxy matlabProxy;
			double doubleResult=0;

			 
			try {
				MatlabProxyFactoryOptions builderOptions = new MatlabProxyFactoryOptions.Builder()
				.setHidden(true).setUsePreviouslyControlledSession(true)
				.build();
		MatlabProxyFactory matlabProxyFactory = new MatlabProxyFactory(builderOptions);
				matlabProxy = matlabProxyFactory.getProxy();
				Object[] result=matlabProxy.returningEval("sqrt("+argument+")", 1);
				double[] doublearray=(double [] ) result[0];
				doubleResult=doublearray[0];
				
				matlabProxy.disconnect();

			} catch (MatlabConnectionException | MatlabInvocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return doubleResult;
			}

		
//		
//		public Object returningFeval(String funtionName, Object inputArguments, int returnArgumentsCounter) {
//			MatlabProxy matlabProxy;
//			Object result=null;
//			try {
//				
//				matlabProxy = matlabProxyFactory.getProxy();
//				result=matlabProxy.returningFeval(funtionName, returnArgumentsCounter, inputArguments);
//				
//				matlabProxy.disconnect();
//
//			} catch (MatlabConnectionException | MatlabInvocationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			return result;
//
//		
//	}
//	
	

	
}
