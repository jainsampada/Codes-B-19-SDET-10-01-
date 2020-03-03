package TestNGDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
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
	Assert.assertEquals("Orange Live Hrm", driver.getTitle());//Hard Assertion
	System.out.println("Hello");
}
@Test
public void Login()
{
	System.out.println("Login Test case");
}


}
