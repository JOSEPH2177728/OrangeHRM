package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import orangeAplication.ParentAbstract.ParentClassReusables;

public class OrangeHRMAddemployee extends ParentClassReusables{

		WebDriver driver;

		public OrangeHRMAddemployee(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//span[text()='Dashboard']")
		WebElement Dashboard;
		
		//"//span[text()='PIM']"
		@FindBy(xpath = "//span[text()='PIM']")
		WebElement pimclick;
		
		//"//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
		WebElement addemp;
		
		@FindBy(xpath = "//a[normalize-space()='Add Employee']")
		WebElement clickAddEmployee;
		
		@FindBy(xpath = "//input[@placeholder='First Name']")
		WebElement sendFirstName;
		
		// "//input[@placeholder='Last Name']"
		
		@FindBy(xpath = "//input[@placeholder='Last Name']")
		WebElement sendLastName;
		
		// "//button[normalize-space()='Save']"
		
		@FindBy(xpath = "//button[normalize-space()='Save']")
		WebElement clickSaveButton;
		
		@FindBy(xpath = "//a[normalize-space()='Employee List']")
		WebElement employeeList;
		
		//"//span[normalize-space()='(19) Records Found']"
		
		@FindBy(css = "div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] span[class='oxd-text oxd-text--span']")
		WebElement resultdisplay;
		
		@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")
		WebElement sendEmpName;
		
		// "//button[normalize-space()='Search']"
		@FindBy(xpath = "//button[normalize-space()='Search']")
		WebElement clickSearchButton;
		
		@FindBy(css = "div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] span[class='oxd-text oxd-text--span']")
		WebElement checkname;
		
		@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/button[2]/i[1]")
		WebElement clickEditButton;
		
		@FindBy( xpath = "//h6[normalize-space()='Joseph G']")
		WebElement checkresult;
		
		
	
	public void goingtoPIM() {
		Dashboard.isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pimclick.click();
		addemp.click();
	}
	
	public void addEmployee() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		properties();
		clickAddEmployee.click();
		sendFirstName.sendKeys(prop.getProperty("Firstname"));
		sendLastName.sendKeys(prop.getProperty("Lastname"));
		clickSaveButton.click();
	}
	
	public Boolean listOfEmployee(boolean check) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		employeeList.click();
		Boolean listofemployees = resultdisplay.isDisplayed();
		System.out.println(listofemployees);
		return listofemployees;
	}
	
	public Boolean searchEmployee (boolean checkresultfound) throws Exception {
		properties();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pimclick.click();
		sendEmpName.sendKeys(prop.getProperty("empName"));
		clickSearchButton.click();
		Boolean check =checkname.isDisplayed();
		return check;
	}
	
	public Boolean editEmployee(Boolean check) {
		clickEditButton.click();
		// .oxd-text.oxd-text--p.oxd-alert-content-text
		Boolean result = checkresult.isDisplayed();
		return result;
	}
	
	public void deleteEmployee() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pimclick.click();
		sendEmpName.sendKeys(prop.getProperty("empName"));
		clickSearchButton.click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();		
		
	}
	

}
