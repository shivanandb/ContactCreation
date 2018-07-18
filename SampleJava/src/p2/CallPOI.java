package p2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallPOI {
	public static WebDriver driver;
@Test
public void maintest() {
		String aut = "shiv";
		String book = "book1";
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
        
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String file=System.getProperty("user.dir")+"\\TestData\\HSTestData.xlsx";
        String celval = XL.getCellValue(file, 0, 1, 0);
        System.out.println(celval);
        
		
	}



@Test
public static String takescreen(WebDriver driver, String screenshotName) throws IOException {
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts=((TakesScreenshot)driver);
	File source = ts.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
	
		FileUtils.copyFile((File) ts, new File("Screenshot.png"));
		
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 return destination;
	
	
}

}