package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;

public class Adactin_Main extends Adactin_Base {
	
	static WebDriver mainDriver = driverLaunch();
	
	public static void main(String[] args) throws Throwable {
		
		Pom1_LoginPage login = new Pom1_LoginPage(mainDriver);
		
		loginUrl("https://adactinhotelapp.com/");
		inputValue(login.getUser(),"arockiam");
		inputValue(login.getPass(),"victor");
		screenShot("1Login");
		buttonClick(login.getLoginButton());
		
		Pom2_SearchHotel searchHotel = new Pom2_SearchHotel(mainDriver);
		
		selectOption(searchHotel.getLocation(), 2);
		selectOption(searchHotel.getHotels(),1);
		selectOption2(searchHotel.getRoomType(),"Super Deluxe");
		selectOption(searchHotel.getRoomNos(),2);
		inputValue(searchHotel.getDatepick_in(), "24/12/2022");
		inputValue(searchHotel.getDatepick_out(), "25/12/2022");
		selectOption2(searchHotel.getAdult_room(), "2");
		selectOption3(searchHotel.getChild_room(), "2 - Two");
		screenShot("2Search Hotel");
		buttonClick(searchHotel.getSearchButton());
		
		Pom3_SelectHotel selectHotel = new Pom3_SelectHotel(mainDriver);
		
		buttonClick(selectHotel.getSelectRadioHotel());
		screenShot("3Continue Search");
		buttonClick(selectHotel.getContinueSearch());
		
		Pom4_bookHotel bookHotel = new Pom4_bookHotel(mainDriver);
		
		inputValue(bookHotel.getFirst_name(), "Arockiam Victor");
		inputValue(bookHotel.getLast_name(), "Mark");
		inputValue(bookHotel.getAddress(), "Besant Nagar, Chennai");
		inputValue(bookHotel.getCc_num(), "1234567887654321");
		selectOption(bookHotel.getCc_type(), 1);
		selectOption2(bookHotel.getCc_exp_month(), "12");
		selectOption3(bookHotel.getCc_exp_year(), "2022");
		inputValue(bookHotel.getCc_cvv(), "123");
		screenShot("4Book Hotel");
		buttonClick(bookHotel.getBook_now());
		
//		waitTime(5);
		Thread.sleep(5000);
		
		Pom5_HotelBookingConfirm hotelBookingConfirm = new Pom5_HotelBookingConfirm(mainDriver);
		
		scrollPage("window.scrollBy(0,500)");
		screenShot("5Booking Confirmation");
		buttonClick(hotelBookingConfirm.getMy_itinerary());
		
		Pom6_BookedItinerary bookedItinerary = new Pom6_BookedItinerary(mainDriver);
		
		buttonClick(bookedItinerary.getSelectCheckBox());
		buttonClick(bookedItinerary.getSelectCancel());
		baseDriver.switchTo().alert().accept();		
		screenShot("6Booked Itinerary");
		
		buttonClick(bookedItinerary.getLogout());
		screenShot("7logout");
		
	}

}
