package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LogInPage extends ProjectMethods{
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	//@FindBy to find one or more element by single locator
	//@FindBys to find one or more element by multiple locator (AND)
	//@FindAll to find one or more element by multiple locator (OR)
	@CacheLookup
	@FindBy(xpath = "//span[text()='Bangalore']/following::input[@name='residentCity']")
	WebElement eleCity;
	public LogInPage clickCity(String city) {
		/*WebElement eleCity = locateElement
			("xpath", "//span[text()='"+city+"']/following::input[@name='residentCity']");*/
		click(eleCity);
		return this;
	}
	
	
	/*@CacheLookup
	@FindAll({@FindBy(id = "username"),
		      @FindBy(name = "USERNAME")})
	List<WebElement> eleUserName1;
	
	@CacheLookup
	@FindBys({@FindBy(id = "username"),
		      @FindBy(name = "USERNAME")})
	WebElement eleUserName2;
	
	@CacheLookup
	@FindBy(id = "password")
	WebElement elePassword;*/
	
	public LogInPage typeUserName(String data) {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}
	
	public LogInPage typePassword(String data) {
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
}









