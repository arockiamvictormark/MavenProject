package tdd.testng.other;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class A08_Ignore {
	
	@Test
	private void happiness() {
		System.out.println("happiness");
	}
	
	@Test
	private void sadness() {
		System.out.println("sadness");
	}
	
	@Test @Ignore
	private void hatred() {
		System.out.println("hatred");
	}

}
