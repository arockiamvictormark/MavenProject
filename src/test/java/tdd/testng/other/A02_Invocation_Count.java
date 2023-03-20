package tdd.testng.other;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class A02_Invocation_Count {
	
	@Test(priority = -2,invocationCount = 20)
	private void star_line1() {
		System.out.print("*");
	}
	
	@Test(priority = 1,invocationCount = 20)
	private void star_line2() {
		System.out.print("*");
	}
	
	@Test(priority = -1)
	private void my_name() {
		System.out.println("\nArockiam Victor Mark");
	}
	
	@AfterClass
	private void at_last() {
		System.out.println();
	}

}
