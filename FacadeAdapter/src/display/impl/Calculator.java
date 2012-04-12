package display.impl;

import dataprovider.facade.DataProvider;
import dataprovider.facade.DataProviderFactory;
import functions.facade.Computation;
import functions.facade.ComputationFactory;

public class Calculator {
	
	private DataProvider dataProvider = DataProviderFactory.getInstance();
	private Computation computation = ComputationFactory.getInstance();
	
	public Calculator() {
	}
	
	public int getSum() {
		DataProvider dp = getDataProvider();
		Computation c = getComputation();
		
		return c.compute(dp.getData());
	}
	
	private DataProvider getDataProvider() {
		return dataProvider;
	}
	
	private Computation getComputation() {
		return computation;
	}
}
