package tdd.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import main.tdd.junit.Junit_Base;
import main.tdd.junit.Junit_Pom1_LoginPage;

public class Junit_Run extends Junit_Base {
	
	static WebDriver mainDriver = driverLaunch();
	
	@After
	public void take_screenshot_after() throws Throwable {
		System.out.println("check...afterscreenshot...");
		screenShot("junit_screen_after_Login");
	}
	
	@AfterClass
	public static void log_out() {
		System.out.println("check...logout...");
		mainDriver.findElement(By.linkText("Logout")).click();;
	}
	
	@Test
	public void login_page() {
		System.out.println("check...loginpage...");		
		Junit_Pom1_LoginPage login = new Junit_Pom1_LoginPage(mainDriver);		
		inputValue(login.getUser(),"arockiam");
		inputValue(login.getPass(),"victor");		
		buttonClick(login.getLoginButton());
	}
	
	@Before
	public void take_screenshot_before() throws Throwable {
		System.out.println("check...beforescreenshot...");
		screenShot("junit_screen_before_Login");
	}
	
	@BeforeClass
	public static void url_launch() {
		System.out.println("check...urllaunch...");
		loginUrl("https://adactinhotelapp.com/");
	}

}
