package adapter.impl;

import dummyalgorithm.pub.AddTwoValues;
import functions.facade.CustomComputation;

public class DummyCustomComputation implements CustomComputation {

	@Override
	public int compute(int a, int b) {
		AddTwoValues add = new AddTwoValues();
		return add.add(a, b);
	}

}
