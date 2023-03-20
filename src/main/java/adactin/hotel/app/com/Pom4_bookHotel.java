package adactin.hotel.app.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4_bookHotel {

	public Pom4_bookHotel(WebDriver mainDriver) {
		PageFactory.initElements(mainDriver, this);
	}
	
	@FindBy(name = "first_name")
	private WebElement first_name;
	public WebElement getFirst_name() {
		return first_name;
	}
	
	@FindBy(name = "last_name")
	private WebElement last_name;	
	public WebElement getLast_name() {
		return last_name;
	}

	@FindBy(name = "address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}

	@FindBy(name = "cc_num")
	private WebElement cc_num;
	public WebElement getCc_num() {
		return cc_num;
	}
	
	@FindBy(id = "cc_type")
	private WebElement cc_type;
	public WebElement getCc_type() {
		return cc_type;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;	
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	
	@FindBy(name = "cc_cvv")
	private WebElement cc_cvv;
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	
	@FindBy(id = "book_now")
	private WebElement book_now;
	public WebElement getBook_now() {
		return book_now;
	}
}
