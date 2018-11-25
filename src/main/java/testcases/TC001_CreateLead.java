package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription ="create new lead in leaftaps";
		testNodes = "Leads";
		authors ="Gayatri";
		category = "smoke";
		dataSheetName="Create Lead";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uname, String pwd,String cName, String fName,String lName) {
		new LoginPage() 
		.enterUsername(uname)
		.enterPassword(pwd)  
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()		
		.verifyFirstname(fName);
		
		
	}

}











