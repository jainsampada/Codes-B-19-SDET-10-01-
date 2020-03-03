package orangelive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static String path;
	public static WebDriver driver;
//	@Parameters({"ChromeBrowser"})
	@BeforeSuite//(groups="Smoke",enabled=true)
public void DriverInfo()//(String browser)
{
//		System.out.println(browser);
//		if(browser.equals("chrome"))
//		{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
	
	 driver=new ChromeDriver();
//		}
//		else if(browser.equals("Firefox"))
//		{
//			path=System.getProperty("user.dir")+"//Driver//firefoxdriver.exe";
//			System.out.println(path);
//			System.setProperty("webdriver.gecko.driver",path);
//			
//			 driver=new FirefoxDriver();
//		}
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
}

@AfterSuite//(groups="Sanity",dependsOnMethods="DriverInfo")
public void Close_Browser()
{
	driver.close();
}
}


