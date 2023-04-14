package com.ohrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.AddEmployeePage;
import com.ohrm.pages.LoginPage;


public class AddEmployeeTest {
	
LoginPage lp;
	
	@BeforeMethod
	public void browserConfig()
	{
		lp=new LoginPage();
		lp.initialization();
				
	}
	
	@Test
	public void validateAddEmployee() 
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.addEmployee();	
	}
	
	
	@Test
	public void validateUploadImageButton() 
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.uploadImageButton();	
	}
	
	@Test
	public void validateUploadImage() 
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.uploadImage();	
	}
	
	@Test
	public void validateUploadImageLargeFiles() 
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.uploadImageLargeFiles();	
	}
	
	@Test
	public void validateEmployeeNameTextbox()
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.employeeNameTextbox();
	}
	

	@Test
	public void validateFillEmployeeNameTextbox()
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.fillEmployeeNameTextbox();
	}
	
	
	@Test
	public void validateToggleSwitch()
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.toggleSwitch();
	}
	
	@Test
	public void validateSavebutton()
	{
		lp.login();
		AddEmployeePage aep=new AddEmployeePage();
		aep.saveButton();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
}




