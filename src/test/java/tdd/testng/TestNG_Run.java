package tdd.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Run {
	
	@Test
	private void test3() {		System.out.println("Test3");	}
	@Test
	private void test1() {		System.out.println("Test1");	}
	@Test
	private void test2() {		System.out.println("Test2");	}
	@AfterSuite
	private void after_suite2() {		System.out.println("After Suite2");	}
	@AfterSuite
	private void after_suite1() {		System.out.println("After Suite1");	}
	@BeforeSuite
	private void before_suite2() {		System.out.println("Before Suite2");	}
	@BeforeSuite
	private void before_suite1() {		System.out.println("Before Suite1");	}
	@AfterTest
	private void after_test2() {		System.out.println("After Test2");	}
	@AfterTest
	private void after_test1() {		System.out.println("After Test1");	}
	@BeforeTest
	private void before_test2() {		System.out.println("Before Test2");	}
	@BeforeTest
	private void before_test1() {		System.out.println("Before Test1");	}
	@AfterClass
	private void after_class2() {		System.out.println("After Class2");	}
	@AfterClass
	private void after_class1() {		System.out.println("After Class1");	}
	@BeforeClass
	private void before_class2() {		System.out.println("Before Class2");	}
	@BeforeClass
	private void before_class1() {		System.out.println("Before Class1");	}
	@AfterMethod
	private void after_method2() {		System.out.println("After Method2");	}
	@AfterMethod
	private void after_method1() {		System.out.println("After Method1");	}
	@BeforeMethod
	private void before_method2() {		System.out.println("Before Method2");	}
	@BeforeMethod
	private void before_method1() {		System.out.println("Before Method1");	}

}
