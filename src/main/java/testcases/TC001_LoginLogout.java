package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginLogout extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginLogout";
		testDescription ="Login to leaftaps";
		testNodes = "Leads";
		authors ="Gayatri";
		category = "smoke";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginLogout(String uname, String pwd) {
		new LoginPage() 
		.enterUsername(uname)
		.enterPassword(pwd)  
		.clickLogin()
		.clickLogout();
	}

}











