package dataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] datasender() {
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
		 }
	@DataProvider
	public String[][] login() {
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	
}
	@DataProvider
	public String[][] register() {
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}
}
