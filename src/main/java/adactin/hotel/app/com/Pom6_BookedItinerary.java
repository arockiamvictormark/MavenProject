package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom6_BookedItinerary {

	public Pom6_BookedItinerary(WebDriver mainDriver) {
		PageFactory.initElements(mainDriver, this);
	}
	
	@FindBy(xpath = "(//input[@name='ids[]'])[1]")
	private WebElement selectCheckBox;
	public WebElement getSelectCheckBox() {
		return selectCheckBox;
	}
	
	@FindBy(name = "cancelall")
	private WebElement selectCancel;
	public WebElement getSelectCancel() {
		return selectCancel;
	}
	
	@FindBy(id = "logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}

}
