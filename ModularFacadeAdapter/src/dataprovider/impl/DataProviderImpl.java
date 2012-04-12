package dataprovider.impl;

import java.util.Random;

import dataprovider.facade.DataProvider;

public class DataProviderImpl implements DataProvider {

	@Override
	public int[] getData() {
		int[] a = new int[10];
		Random r = new Random();

		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt();
		}
		
		return a;
	}
}
