package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContact {
@FindBy(xpath="//a[@data-appkey='sales-contacts']")
public WebElement creContact;

@FindBy(xpath="//button[@data-onboarding='new-object-button']")
public WebElement creContactBtn;

@FindBy(xpath="//h3")
public WebElement Asserthdr;

@FindBy(xpath="//input[@data-field='email']")
public WebElement createEmail;

@FindBy(xpath="//button[@data-selenium-test='base-dialog-confirm-btn']")
public WebElement btnCreateCnt;
}
