package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	// Assertions are used to validate the expected result against the actual 
	//TestNG provides two types of assertion
	// Hard Assertion : if expected result is not equal to actual execution will stop 
	// Soft Assertion : if expected result is not equal to actual execution will continue 
	// and at the end of execution test will be failed. 
	
	
	@Test (enabled= false)// this will ignore the test from execution
	public void hardAssertion() {
		int actualValue = 10;
		int expectedValue = 1;
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("This line will execute if Assertion passed");
		
	}
	
	
	@Test 
	public void SoftAssertion() {
		
		// TestNG provides a class call SoftAssert and we create obj of SoftAssert. 
		// Then we use methods provided by this class 
		// Once all assertions are written we have to call assertAll() method. 
		
		int a = 10; 
		int b = 15;
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(a, b);
		System.out.println("This line of code will be executed regarldless of pass of fail");
		softAssert.assertTrue(false);
		System.out.println("This is after second Assertion");
		softAssert.assertTrue(true);
		System.out.println("This is after 3rd Assertion");
		
		softAssert.assertAll();
		
	}
	
}








