package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangeAplication.ParentAbstract.ParentClassReusables;

public class LeaveObjectPage extends ParentClassReusables {

	public WebDriver driver;

	public LeaveObjectPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	////span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']")
	WebElement click_leaveOption;
	
	@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5)")
	WebElement chechresult;
	
	// //a[normalize-space()='Apply']
	
	@FindBy(xpath = "//a[normalize-space()='Apply']")
	WebElement click_applyLeave;
	
	// .oxd-text.oxd-text--h6.orangehrm-main-title
	
	@FindBy(css = ".oxd-text.oxd-text--h6.orangehrm-main-title")
	WebElement chechresultApplyLeave;
		
	@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(9) > div:nth-child(1) > button:nth-child(1)")
	WebElement click_approve;
	
	// div[role='table'] div:nth-child(1) div:nth-child(1) div:nth-child(9) div:nth-child(1) button:nth-child(2)
	@FindBy(css = "div[role='table'] div:nth-child(1) div:nth-child(1) div:nth-child(9) div:nth-child(1) button:nth-child(2)")
	WebElement click_reject;
	
	// //span[normalize-space()='Configure']
	
	@FindBy(xpath = "//span[normalize-space()='Configure']")
	WebElement click_configure;
	
	// //a[normalize-space()='Holidays']
	
	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	WebElement click_hodays;
	
	// .oxd-text.oxd-text--h5.oxd-table-filter-title
	@FindBy(css = ".oxd-text.oxd-text--h5.oxd-table-filter-title")
	WebElement chechresultHoldays;
	
	// //span[normalize-space()='Reports']
	
	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement click_report;
	
	// //a[normalize-space()='Leave Entitlements and Usage Report']
	
	@FindBy(xpath = "//a[normalize-space()='Leave Entitlements and Usage Report']")
	WebElement click_entitlement;
	
	// .oxd-text.oxd-text--h5.oxd-table-filter-title
	
	@FindBy(css = ".oxd-text.oxd-text--h5.oxd-table-filter-title")
	WebElement chechleavereport;
	
	
	// Action methods
	
	public Boolean checkLeaveBalance(boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_leaveOption.click();
		Boolean leaveBalance =chechresult.isDisplayed();
		return leaveBalance;
	}
	
	public Boolean applyLeave(boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_applyLeave.click();
		Boolean applyleave =chechresultApplyLeave.isDisplayed();
		return applyleave;
	}
	
	public void approveLeave() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_leaveOption.click();
		click_approve.click();

	}
	
	public void rejectLeave() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_leaveOption.click();
		click_reject.click();

	}
	
	public Boolean checkHolidays(Boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_configure.click();
		click_hodays.click();
		Boolean holdays =chechresultHoldays.isDisplayed();
		return holdays;
		

	}
	
	public Boolean viewReport(Boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_report.click();
		click_entitlement.click();
		Boolean report =chechleavereport.isDisplayed();
		return report;
		

	}
	
	

}
