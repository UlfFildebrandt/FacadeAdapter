package display.impl;

import dataprovider.facade.DataProvider;
import dataprovider.facade.DataProviderFactory;
import adapter.DataProviderAdapter;
import functions.facade.Computation;
import functions.facade.ComputationFactory;

public class Display {

	public static void main(String[] args) {

		Computation computation = ComputationFactory.getInstance();
		DataProviderAdapter adapter = new DataProviderAdapter();
		
		DataProvider dataProvider = DataProviderFactory.getInstance();
		adapter.setDataProvider(dataProvider);
		
		computation.setComputationData(adapter);

		System.out.println(computation.compute());
	}
}
