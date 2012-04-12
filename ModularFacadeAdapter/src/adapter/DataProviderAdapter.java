package adapter;

import dataprovider.facade.DataProvider;
import functions.facade.ComputationDataInterface;

public class DataProviderAdapter implements ComputationDataInterface {
	
	private DataProvider dp = null;
	private int[] array = null;
	private int counter = 0;
	
	public void setDataProvider(DataProvider p) {
		dp = p;
		array = dp.getData();
	}

	@Override
	public int getNextValue() {
		return array[counter];
	}

	@Override
	public int getSize() {
		return array.length;
	}
}
