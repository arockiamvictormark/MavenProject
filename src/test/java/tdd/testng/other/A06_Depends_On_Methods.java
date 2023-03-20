package tdd.testng.other;

import org.testng.annotations.Test;

public class A06_Depends_On_Methods {
	
	@Test(priority = 1,expectedExceptions = ArithmeticException.class)
	private void country_india() {
		int a = 9/0;
		System.out.println("country india"+a);
	}
	
	@Test
	private void state_tamilnadu() {
		System.out.println("state tamilnadu");
	}
	
	@Test(dependsOnMethods = "country_india", priority = -1)
	private void city_chennai() {
		System.out.println("city chennai");
	}

}
