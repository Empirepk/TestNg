package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {
	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");
	}
		@Test(priority=1)
	private void tc01() {
		System.out.println("test 1");
	}
		@Test(priority=-1,invocationCount=3)
	private void tc02() {
		System.out.println("test 2");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("afterclass");
	}
	@Test(priority=-1,invocationCount=3)
	private void tc03() {
		System.out.println("test 3");
	}
//<<<<<<< HEAD
	private void tc04() {
		System.out.println("test 4");
//=======
	
//>>>>>> 93d87df0337b53be012523064c943e10e16f0d96
	}
	
	
	
}

