package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5_HotelBookingConfirm {

	public Pom5_HotelBookingConfirm(WebDriver mainDriver) {
		PageFactory.initElements(mainDriver, this);
	}
	
	@FindBy(id = "my_itinerary")
	private WebElement my_itinerary;
	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

}
