package com.ohrm.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRMBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void initialization()
	{
		readPropertyFile();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

	}
	
	public void tearDown()
	{
		driver.quit();
	}
	public void readPropertyFile()
	{
		String PropFilePath="./src/main/java/com/ohrm/config/config.properties";
		prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(PropFilePath);
			prop.load(fis);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
