package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	String path;
	@Test
	public void CheckTitle()
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println(path);
		//Initialize the Chrome Driver
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		SoftAssert ast=new SoftAssert();//sOFT aSSERTION
		ast.assertEquals(driver.getTitle(), "Orange HRM");
		System.out.println("Hello");
	}
	@Test
	public void Login()
	{
		System.out.println("Login Test case");
	}
}
