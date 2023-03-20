package com.MavenProject;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot tss = (TakesScreenshot) wd;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\JAVA\\Testing\\Workspace\\Sample\\MavenProject\\ScreenShots\\ss1.png");
		FileUtils.copyFile(src, des);
		
	}

}
