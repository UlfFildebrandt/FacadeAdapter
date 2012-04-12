package functions.impl;

import functions.facade.Computation;

public class ComputationImpl implements Computation {
	
	public ComputationImpl() {
	}

	@Override
	public int compute(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = a[i];
		}
		return sum;
	}
}
