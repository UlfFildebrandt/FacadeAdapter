package functions.impl;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import functions.facade.Computation;
import functions.facade.CustomComputation;

public class ComputationImpl implements Computation {
	
	private BundleContext context = null;
	
	public ComputationImpl(BundleContext c) {
		context = c;
	}

	@Override
	public int compute(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = a[i];
		}
		return sum;
	}

	@Override
	public int customCompute(int[] a) {
		ServiceReference serviceRef = context.getServiceReference("functions.facade.CustomComputation");
		CustomComputation c = (CustomComputation)context.getService(serviceRef);
		
		int sum = 0;
		if ( c != null ) {
			for(int i = 0; i < a.length; i++) {
				sum = c.compute(sum, a[i]);
			}
		}
		
		return sum;
	}
	
	
}
