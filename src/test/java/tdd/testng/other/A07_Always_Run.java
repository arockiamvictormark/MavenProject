package tdd.testng.other;

import org.testng.annotations.Test;

public class A07_Always_Run {
	
	@Test
	private void generator_on() {
		int a=9/0;
		System.out.println("generator on"+a);
	}
	
	@Test(dependsOnMethods = "generator_on",alwaysRun = true,enabled = false)
	private void power_on() {
		System.out.println("power on");
	}
	
	@Test
	private void invertor_on() {
		System.out.println("invertor on");
	}

}
