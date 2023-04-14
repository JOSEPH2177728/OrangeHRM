package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_forgotPassword {
	WebDriver driver;
	public OrangeHRM_forgotPassword(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotPass;
	
	@FindBy( xpath= "//input[@placeholder='Username']")
	WebElement sendUsername;
	
	//"//button[normalize-space()='Reset Password']"
	
	@FindBy( xpath= "//button[normalize-space()='Reset Password']")
	WebElement resetButton;
	
	public void resetPassWord() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		forgotPass.click();
		sendUsername.sendKeys("Admin");
		resetButton.click();		
	
	

}
	
}
