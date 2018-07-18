package com.testersconnect.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseBase {
	static Logger logger = Logger.getLogger(TestCaseBase.class.getName());
    
public static WebDriver driver;
	@BeforeTest
	public void beginTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//Launch URL 
		driver.get("https://app.hubspot.com/login");
		//Maximize window
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void starttest() throws IOException {
		 File file = new File("file.txt");
		 file.createNewFile();
		 FileWriter fw = new FileWriter(file,true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("Some text here for a reason");
         bw.flush();
         bw.close();
		 
	}
	
	@AfterTest
	public void endTest() {
		System.out.println("Cleaning ...");
		driver.close();
		driver.quit();
	}
	
}
