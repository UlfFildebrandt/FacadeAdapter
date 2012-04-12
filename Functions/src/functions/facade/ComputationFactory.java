package functions.facade;

import org.osgi.framework.BundleContext;

import functions.impl.ComputationImpl;

public class ComputationFactory {
	
	private static BundleContext c = null;
	
	private ComputationFactory() {
	}
	
	public static Computation getInstance() {
		return new ComputationImpl(c);
	}
	
	public static BundleContext getContext() {
		return c;
	}
	
	public static void setContext(BundleContext c) {
		ComputationFactory.c = c;
	}
}
