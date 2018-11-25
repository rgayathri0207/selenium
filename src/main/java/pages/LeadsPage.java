package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LeadsPage extends ProjectMethods{

	public LeadsPage() {
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead") WebElement eleCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}

	
	
	
	
	
}







