package functions.facade;

import functions.impl.ComputationImpl;

public class ComputationFactory {
	
	private ComputationFactory() {
	}
	
	public static Computation getInstance() {
		return new ComputationImpl();
	}
}
