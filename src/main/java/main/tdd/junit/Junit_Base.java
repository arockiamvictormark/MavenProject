package main.tdd.junit;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Base {
	
public static WebDriver baseDriver;
	
	public static WebDriver driverLaunch() {
		baseDriver=new ChromeDriver();
		baseDriver.manage().window().maximize();
		return baseDriver;
	}
	
	public static void loginUrl(String url) {
		baseDriver.get(url);
	}
	
	public static void inputValue(WebElement we,String eValue) {
		we.clear();
		we.sendKeys(eValue);
	}
	
	public static void screenShot(String fileName) throws Throwable {
		TakesScreenshot tss = (TakesScreenshot) baseDriver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\ScreenShots\\"+fileName+".png");
		FileUtils.copyFile(src, des);
	}
	
	public static void buttonClick(WebElement we) {
		we.click();
	}

}
