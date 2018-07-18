package com.testersconnect.tests;

import org.testng.annotations.Test;

import com.testersconnect.tasks.CreateContactActions;
import com.testersconnect.tasks.HomePageActions;
import com.testersconnect.tasks.LoginPageActions;

public class SmokeTest extends TestCaseBase {
	
@Test(priority=1,description="Test the login functionality ")
public void verify_hs_login() {
	
	//Arrange
	LoginPageActions lpa = new LoginPageActions();
	HomePageActions hpa=new HomePageActions();
	CreateContactActions cca=new CreateContactActions();
	
	//Act
	lpa.accessPage("shivanandpadiyar@yahoo.co.in", "Hubspot@123");
	
	//Assert
	hpa.verifyHSLogin("shivanandpadiyar@yahoo.co.in");
	
	cca.createcontact();
	
}



}
