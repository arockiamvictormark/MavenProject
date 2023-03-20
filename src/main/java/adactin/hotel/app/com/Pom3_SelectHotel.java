package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3_SelectHotel {

	public Pom3_SelectHotel(WebDriver mainDriver) {
		PageFactory.initElements(mainDriver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement selectRadioHotel;
	public WebElement getSelectRadioHotel() {
		return selectRadioHotel;
	}
	
	@FindBy(id = "continue")
	private WebElement continueSearch;
	public WebElement getContinueSearch() {
		return continueSearch;
	}

}
