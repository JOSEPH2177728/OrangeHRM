package testcase.TestComponentsBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginObject;

public class Base_Test {
	public WebDriver driver;
	// public String url =
	// "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public LoginObject log;

	public WebDriver initializeDriver() throws Exception  {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\josep\\eclipse-workspace\\OrangeApplication\\src test\\source_Orange\\input.Properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}

	@BeforeTest
	public LoginObject launchApp() throws Exception  {
		
			driver = initializeDriver();
		
		log = new LoginObject(driver);
		log.goTo();
		return log;
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	


}

