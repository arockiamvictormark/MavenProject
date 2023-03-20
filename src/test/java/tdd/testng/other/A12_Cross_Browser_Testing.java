package tdd.testng.other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A12_Cross_Browser_Testing {
	
	WebDriver wd;
	
	@Test
	private void chrome_launch() {
		wd = new ChromeDriver();
		System.out.println("chrome launch");
		wd.close();
	}
	
	@Test
	private void firefox_launch() {
		wd = new FirefoxDriver();
		System.out.println("firefox launch");
		wd.close();
	}
	
	@Test
	private void edge_launch() {
		wd = new EdgeDriver();
		System.out.println("edge launch");
		wd.close();
	}

}
