package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.ID,using="viewLead_firstName_sp") WebElement elefname;
	
	public ViewLeadPage verifyFirstname(String data) {
		String firstName=getText(elefname);
        if(firstName.equals(data)) {
        	reportStep(firstName+" is same as given", "pass");
        }else {
        	reportStep(firstName+" is  not same as given", "fail");
        }
		return this;
	}
	
	
	
	
}







