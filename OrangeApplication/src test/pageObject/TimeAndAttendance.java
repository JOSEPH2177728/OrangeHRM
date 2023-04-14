package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import orangeAplication.ParentAbstract.ParentClassReusables;

public class TimeAndAttendance extends ParentClassReusables {
	public WebDriver driver;

	public TimeAndAttendance(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)")
	WebElement clickTimeOption;

	@FindBy(xpath = "//*[text()='Attendance ']")
	WebElement clickAttendance;

	@FindBy(xpath = "//*[text()='Employee Records']")
	WebElement clickEmp_records;

	@FindBy(css = ".oxd-text.oxd-text--h5.oxd-table-filter-title")
	WebElement checkresult;

	@FindBy(xpath = "//span[normalize-space()='Timesheets']")
	WebElement clickTimesheets;

	@FindBy(css = "header[class='oxd-topbar'] li:nth-child(2) a:nth-child(1)")
	WebElement clickEmployeeTimesheets;
	
	@FindBy(css = "input[placeholder='Type for hints...']")
	WebElement sendEmployeeName;

	@FindBy(css = "div[class='orangehrm-header-container'] h6[class='oxd-text oxd-text--h6 orangehrm-main-title']")
	WebElement checkresultofTimeSheet;

	@FindBy(css = "button[type='submit']")
	WebElement clickView;

	@FindBy(css = ".oxd-button.oxd-button--medium.oxd-button--ghost")
	WebElement clickedit;
	
	// //a[normalize-space()='Punch In/Out']
	
	@FindBy(xpath = "//a[normalize-space()='Punch In/Out']")
	WebElement clickPunchInandOut;
	
	//button[normalize-space()='Out']
	@FindBy(css = "button[type='submit']")
	WebElement clickIn_Out;
	
	// //span[normalize-space()='Reports']
	
	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement click_report;
	
	// //a[normalize-space()='Employee Reports']
	
	@FindBy(xpath = "//a[normalize-space()='Employee Reports']")
	WebElement click_Employeereport;
	
	@FindBy(css = ".oxd-text.oxd-text--h5.oxd-table-filter-title")
	WebElement resultreport;
	
	// //a[normalize-space()='Configuration']
	
	@FindBy(xpath = "//a[normalize-space()='Configuration']")
	WebElement click_config;
	
	// //button[normalize-space()='Save']
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement click_saveButton;
	

	public Boolean viewAttendance(Boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickTimeOption.click();
		clickAttendance.click();
		clickEmp_records.click();
		Boolean resultAttendance = checkresult.isDisplayed();
		return resultAttendance;

	}

	public Boolean viewEmployeeTimeSheet(Boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickTimesheets.click();
		clickEmployeeTimesheets.click();
		Boolean timesheettextresult = checkresultofTimeSheet.isDisplayed();
		return timesheettextresult;
	}

	public void punchInandOut() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickAttendance.click();
		clickPunchInandOut.click();
		//clickIn_Out.click();
				
	}
	public void editEmployeeTimeSheet() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickTimesheets.click();
		clickEmployeeTimesheets.click();
		checkresultofTimeSheet.isDisplayed();
	
	}
	
	public Boolean viewReport(Boolean True) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click_report.click();
		click_Employeereport.click();	
		 Boolean report =resultreport.isDisplayed();
		 return report;
	
	}
	
	public void configurations() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		clickAttendance.click();
		click_config.click();
		click_saveButton.click();

}
	
}
