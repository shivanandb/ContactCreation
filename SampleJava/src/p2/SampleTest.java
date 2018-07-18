package p2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SampleTest{
	public static WebDriver driver;
	public static String  URL="http://toolsqa.wpengine.com/automation-practice-form/";
	
	@Test
	public void BeforeTest() {
		driver = new ChromeDriver();
		
		driver.get(URL);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		//Maximize window
				driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void javaTest() {
		
	}
	
	
}