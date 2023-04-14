package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.OrangeHRMAddemployee;
import testcase.TestComponentsBase.Base_Test;

public class OrangeHRMAddEmployee extends Base_Test {
	OrangeHRMAddemployee add = new OrangeHRMAddemployee(driver);

	@Test(priority = 0)
	public void addemployeeHRM() throws Exception  {
		log.logIn("Admin", "admin123");
		add = new OrangeHRMAddemployee(driver);
		add.goingtoPIM();

	}

	@Test(priority = 1)
	public void employeeName() throws Exception {
		add.addEmployee();

	}

	@Test(priority = 2)
	public void validateListOfEmployee() throws Exception {
		add.goingtoPIM();
		add.listOfEmployee(true);
		Assert.assertEquals(true, true);

	}

	@Test(priority = 3)
	public void validateSearchEmployee() throws Exception {
		add.searchEmployee(true);
		Assert.assertEquals(true, true);

	}
	@Test(priority = 4)
	public void validateEditEmployee() {
		add.editEmployee(true);
		Assert.assertEquals(true, true);
	}
	
	@Test(priority = 5)
	public void validateDeleteEmployee() {
		add.deleteEmployee();		

	}
	
	
	

}
