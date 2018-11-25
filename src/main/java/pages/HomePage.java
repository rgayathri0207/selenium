package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	
	public LoginPage clickLogout() {
	    click(eleLogout);
	    return new LoginPage();   
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'CRM/SFA')]") WebElement elecrmSFA;
	
	public MyHomePage clickCRM() {
		click(elecrmSFA);
		return new MyHomePage();
	}
	
	
}







