package com.OrangeLive.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.TestBase.basedemo;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends basedemo{
	LoginPage log;
	String Title,Exp_Title;
public LoginTest()
{
	super();
}
@BeforeSuite
public void LaunchUrl()
{
	initialize();
	log=new LoginPage();
}
@Test
public void Check()
{
	Title=log.CheckTitle();
	Assert.assertEquals(Title, "OrangeHRM");
}
@Test
public void CheckLogin() throws InterruptedException
{
	log.Login();
	Thread.sleep(5000);
}
@Test
public void CheckForget()
{
	log.ForgetClick();
}
@AfterSuite
public void Close()
{
	log.Close_Browser();
}
}

