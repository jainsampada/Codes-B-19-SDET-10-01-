package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoGroups {
	public static WebDriver driver;
	public static String path,Exp_title="Facebook";

@BeforeSuite(groups="Smoke")
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);

	//Initialize the Chrome Driver
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
}
@Test(groups="Sanity")
public void CheckTitle()
{
System.out.println(driver.getTitle());

	if(driver.getTitle().equals(Exp_title)){
		System.out.println("You are on correct Page");
	}
	
	else
	{
		System.out.println("you are not correct page");
	}
}
@Parameters({"Browser"})
@Test(groups="Smoke")
public void Login(String val)
{
	System.out.println(val);
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("pass");
	driver.findElement(By.id("u_0_b")).click();
}
@AfterSuite(groups="Negative")
public void Close_Browser()
{
	driver.close();
}
}
