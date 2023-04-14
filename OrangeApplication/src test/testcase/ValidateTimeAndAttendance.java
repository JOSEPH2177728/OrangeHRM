package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.TimeAndAttendance;
import testcase.TestComponentsBase.Base_Test;

public class ValidateTimeAndAttendance extends Base_Test{
	TimeAndAttendance time;
	
	

	@Test(priority = 0)
	public void validateViewEmployeeAttendance ()  {
		log.logIn("Admin", "admin123");
		time = new TimeAndAttendance(driver);
		time.viewAttendance(true);
		Assert.assertEquals(true, true);
	}
	
	@Test(priority = 1)
	public void validateviewEmployeeTimeSheet () {
		time.viewAttendance(true);
		Assert.assertEquals(true, true);
		
	}
	
	@Test(priority = 2)
	public void validatepunchinandout () {
		time.punchInandOut();
	}
	
	@Test(priority = 3)
	public void validateeditEmployeeTimeSheet() {
		time.editEmployeeTimeSheet();
	}
	@Test(priority = 4)
	public void validateviewReport() {
		time.viewReport(true);
		Assert.assertEquals(true, true);
	}
	@Test(priority = 5)
	public void validateconfigurations() {
		time.configurations();
	}

}
