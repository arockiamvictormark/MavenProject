package tdd.testng.other;

import org.testng.annotations.Test;

public class A11_Parallel_Testing {
	
	@Test
	private void chrome_test() {
		System.out.println("chrome test");
	}
	
	@Test
	private void firefox_test() {
		System.out.println("firefox test");
	}
	
	@Test
	private void edge_test() {
		System.out.println("edge test");
	}

}
