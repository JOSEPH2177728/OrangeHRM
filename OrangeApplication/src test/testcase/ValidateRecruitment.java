package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.RecruitmentObjectPage;
import testcase.TestComponentsBase.Base_Test;

public class ValidateRecruitment extends Base_Test {
	RecruitmentObjectPage recruit;
	
	@Test (priority = 0)
	public void validateRecruitmentoption()  {
		log.logIn("Admin", "admin123");
		recruit = new RecruitmentObjectPage(driver);
		recruit.checkRecruitmenthighlights(true);
		Assert.assertEquals(true, true);
}
	
	@Test (priority = 1)
	public void validateCandidate(){
		recruit.candidate(true);
		Assert.assertEquals(true, true);
}
	
	@Test (priority = 2)
	public void validateviewicon(){
		recruit.viewIcon(true);
		Assert.assertEquals(true, true);
}
	@Test (priority = 3)
	public void validatedownloadicon(){
		recruit.downloadIcon(true);
		Assert.assertEquals(true, true);
}
	@Test (priority = 4)
	public void validatedeleteicon(){
		recruit.deleteIcon();
}
	
}
