package display.impl;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import dataprovider.facade.DataProvider;
import functions.facade.Computation;

public class Calculator {
	private BundleContext context = null;
	
	public Calculator(BundleContext c) {
		context = c;
	}
	
	public int getSum() {
		DataProvider dp = getDataProvider();
		Computation c = getComputation();
		
		return c.compute(dp.getData());
	}
	
	public int getCustomSum() {
		DataProvider dp = getDataProvider();
		Computation c = getComputation();
		
		return c.customCompute(dp.getData());
	}
	
	private DataProvider getDataProvider() {
		ServiceReference serviceRef = context.getServiceReference("dataprovider.facade.DataProvider");
		return (DataProvider)context.getService(serviceRef);
	}
	
	private Computation getComputation() {
		ServiceReference serviceRef = context.getServiceReference("functions.facade.Computation");
		return (Computation)context.getService(serviceRef);
	}
}
