package tdd.testng.other;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A13_Data_Parsing {
	
	@Parameters({"fn","sn"})
	@Test
	private void first_name(String fname,String sname) {
		System.out.println("First Name: "+fname+" "+sname);
	}
	
	@Parameters({"mn"})
	@Test
	private void middle_name(String mname) {
		System.out.println("Middle Name: "+mname);
	}
	
	@Parameters({"nn","ln"})
	@Test(priority = 1)
	private void last_name(@Optional("Gunold") String nname,String lname) {
		System.out.println("Last Name: "+nname+" "+lname);
	}

}
