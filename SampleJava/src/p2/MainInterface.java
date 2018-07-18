package p2;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public interface MainInterface{  
	
	
void reportNG();//bydefault, public and abstract  
void extentReport();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
 
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class ReportNG_D implements MainInterface{  
public void reportswitch(String reportType){	// initialize the HtmlReporter
	switch (reportType) {
	case "ReportNG":
		reportNG();
		break;
		
	case "Extentreport":
		extentReport();
		break;
	default: 
		System.out.println("ABCD");
	
	}
	
	}  
public void extentReport(){
ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

// initialize ExtentRepor111ts and attach the HtmlReporter
//extent = new ExtentReports();

// attach only HtmlReporter
//extent.attachReporter(htmlReporter);

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//driver = new ChromeDriver();

 System.out.println("on test start");}  
public void d(){System.out.println("I am d");}
@Override
public void reportNG() {
	// TODO Auto-generated method stub
	
}
@Override
public void c() {
	// TODO Auto-generated method stub
	
}  
}  
  
//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  
	//MainInterface a=new M();  
 
}}  