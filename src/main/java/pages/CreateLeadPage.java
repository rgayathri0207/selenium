package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);  
	}

	@FindBy(how=How.ID, using="createLeadForm_companyName") WebElement eleCName;

	public CreateLeadPage enterCompanyName(String data) {
		type(eleCName, data);
		return this;
	}
	@FindBy(how=How.ID, using="createLeadForm_firstName") WebElement eleFName;

	public CreateLeadPage enterFirstName(String data) {
		type(eleFName, data);
		return this;
	}

	@FindBy(how=How.ID, using="createLeadForm_lastName") WebElement eleLName;

	public CreateLeadPage enterLastName(String data) {
		type(eleLName, data);
		return this;
	}

	@FindBy(how=How.NAME, using="submitButton") WebElement eleCLbutton;

	public ViewLeadPage clickCreateLeadButton() {
		click(eleCLbutton);
		return new ViewLeadPage();
	}








}







