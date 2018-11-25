package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(how=How.NAME, using="USERNAME") WebElement eleUname;
	@FindBy(how=How.ID, using="password") WebElement elePass;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;
	
	public LoginPage enterUsername(String data) {
		//WebElement eleUname = locateElement("id", "username");
		type(eleUname, data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		type(elePass, data);
		return this;
	}
	
	public HomePage clickLogin() {
		click(eleLogin);
		//HomePage hp = new HomePage();
		//return hp;
		return new HomePage();
	}
	
}







