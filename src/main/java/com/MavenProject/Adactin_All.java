package com.MavenProject;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_All {
	
	public static WebDriver wd;
	
	public static void main_page() {
		wd=new ChromeDriver();
		wd.get("https://adactinhotelapp.com/");
		wd.manage().window().maximize();
	}
	
	public static void screenShot(String fileName) throws Throwable {
		TakesScreenshot tss = (TakesScreenshot) wd;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\ScreenShots\\"+fileName+".png");
		FileUtils.copyFile(src, des);
	}

	public static void elementWithValue(String eName,String eValue) {
		WebElement we = wd.findElement(By.name(eName));
		we.clear();
		we.sendKeys(eValue);
	}
	
	public static void buttonClick(String eName) {
		WebElement we = wd.findElement(By.className(eName));
		we.click();
	}
	
	public static void buttonClick2(String eName) {
		WebElement we = wd.findElement(By.xpath(eName));
		we.click();
	}
	
	public static void buttonClick3(String eName) {
		WebElement we = wd.findElement(By.id(eName));
		we.click();
	}
	
	public static void buttonClick4(String eName) {
		WebElement we = wd.findElement(By.name(eName));
		we.click();
	}
	
	public static void selectOption(String eName,int index) {
		WebElement we = wd.findElement(By.id(eName));
		Select sel = new Select(we);
		sel.selectByIndex(index);
	}
	
	public static void selectOption2(String eName,String sValue) {
		WebElement we = wd.findElement(By.id(eName));
		Select sel = new Select(we);
		sel.selectByValue(sValue);
	}
	
	public static void selectOption3(String eName,String sValue) {
		WebElement we = wd.findElement(By.id(eName));
		Select sel = new Select(we);
		sel.selectByVisibleText(sValue);
	}
	
	public static void waitTime(int duration) {
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	public static void scrollPage(String sValue) {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript(sValue);
	}
	
	public static void main(String[] args) throws Throwable {

		main_page();
		elementWithValue("username","arockiam");
		elementWithValue("password","victor");
		screenShot("1Login Screen");
		buttonClick("login_button");
		
		selectOption("location", 3);
		selectOption("hotels",2);
		selectOption2("room_type","Super Deluxe");
		selectOption("room_nos",2);
		elementWithValue("datepick_in", "20/12/2022");
		elementWithValue("datepick_out", "25/12/2022");
		selectOption2("adult_room", "2");
		selectOption3("child_room", "2 - Two");
		screenShot("2Search Hotel");
		buttonClick2("//input[@value='Search']");
		
		buttonClick3("radiobutton_0");
		screenShot("3Continue Search");
		buttonClick3("continue");
		
		elementWithValue("first_name", "Arockiam Victor");
		elementWithValue("last_name", "Mark");
		elementWithValue("address", "Besant Nagar, Chennai");
		elementWithValue("cc_num", "1234567887654321");
		selectOption("cc_type", 1);
		selectOption2("cc_exp_month", "12");
		selectOption3("cc_exp_year", "2022");
		elementWithValue("cc_cvv", "123");
		screenShot("4Book Hotel");
		buttonClick3("book_now");
		
//		waitTime(5);
		Thread.sleep(5000);
		
		scrollPage("window.scrollBy(0,500)");
		screenShot("5Booking Confirmation");
		buttonClick3("my_itinerary");
		
		buttonClick2("(//input[@name='ids[]'])[1]");
		buttonClick4("cancelall");
		wd.switchTo().alert().accept();		
		screenShot("6Booked Itinerary");
		
		buttonClick3("logout");
		screenShot("7logout");

	}

}
