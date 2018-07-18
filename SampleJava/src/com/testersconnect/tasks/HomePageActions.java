package com.testersconnect.tasks;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.pages.HomePage;
import com.testersconnect.tests.TestCaseBase;

public class HomePageActions {
HomePage hp;

public HomePageActions() {
	hp=PageFactory.initElements(TestCaseBase.driver, HomePage.class);
	
}



public void verifyHSLogin(String expEmail) {
	hp.imgProfile.click();
	String actEmail=hp.userEmail.getText();
	
	Assert.assertEquals(actEmail, expEmail);
}



}
