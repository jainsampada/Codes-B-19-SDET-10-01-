package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.basedemo;

public class LoginPage extends basedemo {
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgetpass;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String CheckTitle()
	{
		return driver.getTitle();
	}
	public void Login()
	{
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		driver.navigate().back();
	}
	public void ForgetClick()
	{
		forgetpass.click();
	}
	public void Close_Browser()
	{
		driver.close();
	}
}
