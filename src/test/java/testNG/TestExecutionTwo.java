package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;
import pageObj.HotelPageObject;
import utilities.DriverUtility;

public class TestExecutionTwo extends Base {
	
	
	// I need to declare  an Obj of HotelPageObj
		HotelPageObject hotelpb;
		
		@BeforeMethod
		public void beforeMthod() {
			initializeDriver();
			logger.info("Browser opened Successfully");
			
		}
		
		@AfterMethod
		public void afterMethod() {
			tearDown();
			logger.info("Browser closed");
		}
		
		
		@Test 
		@Parameters({"userName","password"})
		public void loginToHotelTest(String userName,String password) {
			
			hotelpb = new HotelPageObject();
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(hotelpb.signInIsPresent());
			hotelpb.clickOnSignIn();
			softAssert.assertTrue(hotelpb.emailAddressIsPresent());
			softAssert.assertTrue(hotelpb.passwordIsDisplayed());
			softAssert.assertTrue(hotelpb.forgotPasswordLinkIsDisplayed());
			softAssert.assertTrue(hotelpb.signInIsDisplayed());
			DriverUtility.screenShot();
			hotelpb.SignInMethod(userName, password);
			softAssert.assertTrue(hotelpb.myAccountTextIsDisplayed());
			softAssert.assertAll();
			DriverUtility.screenShot();
		}
	
	

}
