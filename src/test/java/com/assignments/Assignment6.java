package com.assignments;

import org.testng.annotations.DataProvider;

public class Assignment6 {
	@DataProvider(name = "product")
	public Object[][] product() {
		return new Object[][] {

				{"MyMoney", },
				{"FamilyAlbum"} ,
				{"ScreenSaver" }
		};
		}

}