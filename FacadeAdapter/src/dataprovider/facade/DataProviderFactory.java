package dataprovider.facade;

import dataprovider.impl.DataProviderImpl;

public class DataProviderFactory {
	private DataProviderFactory() {
	}
	
	public static DataProvider getInstance() {
		return new DataProviderImpl();
	}
}
