package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1_LoginPage {
	
	WebDriver pomDriver;

	public Pom1_LoginPage(WebDriver mainDriver) {
		pomDriver=mainDriver;
		PageFactory.initElements(pomDriver, this);
	}
	
	@FindBy(id = "username")
	private WebElement user;	
	public WebElement getUser() {
		return user;
	}

	@FindBy(id = "password")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(className = "login_button")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}

}
