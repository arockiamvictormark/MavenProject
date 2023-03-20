package tdd.testng.other;

import org.testng.annotations.Test;

public class A05_Expected_Exception {
	
	@Test
	private void normal_output() {
		System.out.println("normal output");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void error_output() {
		int a=9/0;
		System.out.println("a: "+a);
		System.out.println("error output");
	}

}
