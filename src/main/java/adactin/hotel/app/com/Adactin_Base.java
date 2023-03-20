package adactin.hotel.app.com;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Base {
	
	public static WebDriver baseDriver;
	
	public static WebDriver driverLaunch() {
		baseDriver=new ChromeDriver();
//		baseDriver.manage().window().maximize();
		return baseDriver;
	}
	
	public static void loginUrl(String url) {
		baseDriver.get(url);
	}
	
	public static void screenShot(String fileName) throws Throwable {
		TakesScreenshot tss = (TakesScreenshot) baseDriver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\ScreenShots\\"+fileName+".png");
		FileUtils.copyFile(src, des);
	}

	public static void inputValue(WebElement we,String eValue) {
		we.clear();
		we.sendKeys(eValue);
	}
	
	public static void buttonClick(WebElement we) {
		we.click();
	}
	
	public static void selectOption(WebElement we,int index) {
		Select sel = new Select(we);
		sel.selectByIndex(index);
	}
	
	public static void selectOption2(WebElement we,String sValue) {
		Select sel = new Select(we);
		sel.selectByValue(sValue);
	}
	
	public static void selectOption3(WebElement we,String sValue) {
		Select sel = new Select(we);
		sel.selectByVisibleText(sValue);
	}
	
	public static void waitTime(int duration) {
		baseDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	public static void scrollPage(String sValue) {
		JavascriptExecutor jse = (JavascriptExecutor) baseDriver;
		jse.executeScript(sValue);
	}

}
