package com.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basedemo {
	public static WebDriver driver;
	public static Properties prop;
	public static String path;
public basedemo()
{
	try
	{
	FileInputStream fis=new FileInputStream("D:\\B_19_SDET_10_01\\com.OrangeLiveLogin\\src\\main\\java\\com\\configuration\\config.properties");
	prop=new Properties();
	prop.load(fis);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
public static void initialize()
{
	path=System.getProperty("user.dir")+prop.getProperty("prop2");
	System.setProperty(prop.getProperty("prop1"), path);
	driver=new ChromeDriver();
	driver.get(prop.getProperty("link"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	
	
}
}
