package functions.impl;

import functions.facade.Computation;
import functions.facade.ComputationDataInterface;

public class ComputationImpl implements Computation {
	
	ComputationDataInterface data = null;
	
	public ComputationImpl() {
	}

	@Override
	public int compute() {
		int sum = 0;
		for(int i = 0; i < data.getSize(); i++) {
			sum += data.getNextValue();
		}
		return sum;
	}
	
	@Override
	public void setComputationData(ComputationDataInterface inf) {
		data = inf;
	}
}
