package tdd.testng.other;

import org.testng.annotations.Test;

public class A01_Priority {
	
	@Test(priority = -1)
	private void family() {
		System.out.println("family is my 1st Priority");
	}
	
	@Test
	private void friend() {
		System.out.println("friend is my 2nd Prioroty");
	}
	
	@Test(priority = 1)
	private void Friends() {	//Upper-case has more priority than Lower-case
		System.out.println("Friends are my 3rd Prioroty");
	}

}
