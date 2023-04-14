package orangeAplication.ParentAbstract;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentClassReusables {
	WebDriver driver;
	public Properties prop;
	public ParentClassReusables(WebDriver driver) {
		this.driver=driver;
	}

	public void waitForElement(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void implicitWait () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void properties () throws Exception {
	 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\josep\\eclipse-workspace\\OrangeApplication\\src test\\source_Orange\\input.Properties");
		prop.load(fis);			
		
	}
	
	public String alertMessage(String alert) {
		String alertMessage =driver.switchTo().alert().getText();
		return alertMessage;
	
	}

}
