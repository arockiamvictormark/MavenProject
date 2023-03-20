package tdd.testng.other;

import org.testng.annotations.Test;

public class A10_Time_Out {
	
	@Test(priority = -1,timeOut = 10000)
	private void get_bus() throws Throwable {
		System.out.println("get bus1");
		Thread.sleep(5000);
		System.out.println("get bus2");
	}
	
	@Test(timeOut = 10000)
	private void get_cab() throws Throwable {
		Thread.sleep(5000);
		System.out.println("get cab");
	}
	
	@Test(priority = 1)
	private void get_bike() {
		System.out.println("get bike");
	}

}
