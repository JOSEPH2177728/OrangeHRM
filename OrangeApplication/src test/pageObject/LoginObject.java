package pageObject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangeAplication.ParentAbstract.ParentClassReusables;

public class LoginObject extends ParentClassReusables {
	public WebDriver driver;
	public Properties prop;
	

	public LoginObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	// xpath("//button[normalize-space()='Login']")
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginButton;
	
	
	

	/*
	 * public void logIn (String userName,String passWord) {
	 * username.sendKeys(userName); password.sendKeys(passWord);
	 * loginButton.click(); }
	 */

	public void goTo() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	public void logIn(String userName, String passWord ) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginButton.click();
	}
	
		
		

	}

