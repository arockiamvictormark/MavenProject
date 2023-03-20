package tdd.testng.other;

import org.testng.annotations.Test;

public class A03_Invocation_Time_Out {
	
	@Test(invocationCount = 10,invocationTimeOut = 10)
	private void print_hello() throws Throwable {
		System.out.println("Hello..!");
		Thread.sleep(5);
	}

}
