package testcase;

import org.testng.annotations.Test;

import testcase.TestComponentsBase.Base_Test;

public class TestRun_Login extends Base_Test {

	@Test
	public void logInApp()  {
		
		log.logIn("Admin", "admin123");
	}

}
