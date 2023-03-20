package tdd.testng.other;

import org.testng.annotations.Test;

public class A04_Description {
	
	@Test(description = "above is the total of 4+5")
	private void print_message() {
		System.out.println(4+5);
	}

}
