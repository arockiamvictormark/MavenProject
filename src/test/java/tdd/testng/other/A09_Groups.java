package tdd.testng.other;

import org.testng.annotations.Test;

public class A09_Groups {
	
	@Test(groups = "soft")
	private void test_team() {
		System.out.println("test team");
	}
	
	@Test(groups = "hard")
	private void network_team() {
		System.out.println("network team");
	}
	
	@Test(groups = "soft")
	private void dev_team() {
		System.out.println("dev team");
	}
	
	@Test(groups = "hard")
	private void backup_team() {
		System.out.println("backup team");
	}

}
