package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "Sign Out")
	public WebElement lnkLogOut;

	@FindBy(xpath = "//img[@class='nav-avatar']")
	public WebElement profileArrow;

	@FindBy(xpath = "//img[@class='nav-avatar']")
	public WebElement imgProfile;

	@FindBy(xpath="//div[@class='nav-email']")
	public WebElement userEmail; 
	
	//@FindBy(xpath = "//div[@class='user-info-email']")

	public WebElement profileEmail;
}
