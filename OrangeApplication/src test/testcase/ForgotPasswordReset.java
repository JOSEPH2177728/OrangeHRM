package testcase;

import org.testng.annotations.Test;

import pageObject.OrangeHRM_forgotPassword;
import testcase.TestComponentsBase.Base_Test;

public class ForgotPasswordReset extends Base_Test {

	@Test

	public void resetPassWordForgot() throws Exception {
		OrangeHRM_forgotPassword reset = new OrangeHRM_forgotPassword(driver);
		reset.resetPassWord();
	}

}
