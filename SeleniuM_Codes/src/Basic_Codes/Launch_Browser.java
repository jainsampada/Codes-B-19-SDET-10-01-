package Basic_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	String Exp_title="OngeHRM",path;
	
public void Launch()
{
	//Path Setting of Chrome Driver
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	//Initialize the Chrome Driver
	WebDriver driver=new ChromeDriver();
	
	//Launch the application on which you want to perform testing
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//Second method to launch Application on Browser
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	//driver.navigate().to("https://www.facebook.com");
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
	
	//Fetch title of Page
	System.out.println(driver.getTitle());
	
	//Fetch current URL OF the application
	System.out.println(driver.getCurrentUrl());
	
	//Fetch Page Source
	System.out.println(driver.getPageSource());
	
//	if(driver.getTitle().equals(Exp_title)){
//		System.out.println("You are on correct Page");
//	}
//	else
//	{
//		System.out.println("you are not correct page");
//	}
//	
//	//driver.quit();
//	//driver.close();
//	//Locate element By Id Selector/Locator
//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	driver.findElement(By.id("btnLogin")).submit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browser oo=new Launch_Browser();
		oo.Launch();
	}

}
