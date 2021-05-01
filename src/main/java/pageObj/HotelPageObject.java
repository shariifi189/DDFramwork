package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HotelPageObject extends Base {
	
	// We are following POM desing pattern 
	// We are implementing PageFactory class 
	//we are using .initElement method to initialize the UI Elements 
	
	public HotelPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	@FindBy(id = "email")
	private WebElement emailAddress;
	
	@FindBy(id ="passwd")
	private WebElement password;
	
	@FindBy(xpath ="//a[contains(text(),'Forgot your password?')]")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath ="//button[@name='SubmitLogin']/span")
	private WebElement signInButton;
	
	@FindBy(xpath="//h1[contains(text(),'My account')]")
	private WebElement myAccountText;
	
	
	public void SignInMethod(String userName, String pass) {
		emailAddress.sendKeys(userName);
		password.sendKeys(pass);
		signInButton.click();
	}
	
	public void clickOnSignIn() {
		//signIn.sendKeys(Keys.ENTER); // sendKeys(Keys.Enter) is same thing as .click();
		signIn.click();
	}
	
	public boolean signInIsPresent() {
		return signIn.isDisplayed();
	}
	
	public boolean emailAddressIsPresent() {
		return emailAddress.isDisplayed();
	}
	
	public boolean passwordIsDisplayed() {
		return password.isDisplayed();
	}
	
	public boolean forgotPasswordLinkIsDisplayed() {
		return forgotPasswordLink.isDisplayed();
	}
	
	public boolean signInIsDisplayed() {
		return signInButton.isDisplayed();
	}
	
	public boolean myAccountTextIsDisplayed() {
		return myAccountText.isDisplayed();
	}

}
