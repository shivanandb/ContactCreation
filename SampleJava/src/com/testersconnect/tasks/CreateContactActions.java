package com.testersconnect.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.common.Utils;
import com.testersconnect.pages.CreateContact;
import com.testersconnect.pages.LoginPage;
import com.testersconnect.tests.TestCaseBase;



public class CreateContactActions {
	//a[@data-appkey='sales-contacts']
		WebDriver driver;
		CreateContact cc;
		public CreateContactActions() {
			 cc = PageFactory.initElements(TestCaseBase.driver, CreateContact.class);
		}
		public void createcontact() {
		cc.creContact.click();
		Utils.sleep(5000);
		cc.creContactBtn.click();
		Utils.sleep(5000);
		String actHdr="Create contact";
		
		Assert.assertEquals(actHdr, cc.Asserthdr.getText());
		System.out.println("Header: "+ actHdr +" is Visible.");
		cc.createEmail.sendKeys("shivanandpadiyar@yahoo.co.in");
		cc.btnCreateCnt.click();
		
		}

}
