package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LeaveObjectPage;
import testcase.TestComponentsBase.Base_Test;

public class ValidateLeaveOperations extends Base_Test{
	LeaveObjectPage leave;


	@Test (priority = 0)
	public void validateLeaveBalance() {
		log.logIn("Admin", "admin123");
		 leave = new LeaveObjectPage(driver);
		 leave.checkLeaveBalance(true);
		Assert.assertEquals(true, true);
	}
	@Test (priority = 1)
	public void validateapplyLeave() {
		leave.applyLeave(true);
		Assert.assertEquals(true, true);
	}
	
	@Test (priority = 2)
	public void validateApproveLeave() {
		leave.approveLeave();
	}
	
	@Test (priority = 3)
	public void validateRejectLeave() {
		leave.rejectLeave();
	}
	
	@Test (priority = 4)
	public void validatehodays() {
		leave.checkHolidays(true);
		Assert.assertEquals(true, true);
	}
	
	@Test (priority = 5)
	public void validatereport() {
		leave.viewReport(true);
		Assert.assertEquals(true, true);
	}
}