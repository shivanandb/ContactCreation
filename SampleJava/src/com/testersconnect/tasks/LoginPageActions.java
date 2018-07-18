package com.testersconnect.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testersconnect.common.Utils;
import com.testersconnect.pages.LoginPage;
import com.testersconnect.tests.TestCaseBase;

public class LoginPageActions {

	WebDriver driver;
	LoginPage lp;
	public LoginPageActions() {
		 lp = PageFactory.initElements(TestCaseBase.driver, LoginPage.class);
	}
	
	public void accessPage(String un, String pwd) {
		Utils.sleep(5000);
		lp.txtUserName.sendKeys(un);
		lp.txtPassword.sendKeys(pwd);
		lp.btnLogin.click();
		Utils.sleep(5000);
	}
}
