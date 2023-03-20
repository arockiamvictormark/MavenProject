package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_SearchHotel {

	public Pom2_SearchHotel(WebDriver mainDriver) {
		PageFactory.initElements(mainDriver, this);
	}
	
	@FindBy(id = "location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	public WebElement getRoomType() {
		return roomType;
	}
	
	@FindBy(id = "room_nos")
	private WebElement roomNos;	
	public WebElement getRoomNos() {
		return roomNos;
	}
	
	@FindBy(name = "datepick_in")
	private WebElement datepick_in;
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	
	@FindBy(name = "datepick_out")
	private WebElement datepick_out;
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	public WebElement getAdult_room() {
		return adult_room;
	}
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	public WebElement getChild_room() {
		return child_room;
	}
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	public WebElement getSearchButton() {
		return searchButton;
	}

}
