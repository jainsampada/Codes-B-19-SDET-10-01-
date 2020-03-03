package Basic_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo {
	String path;
	WebElement deptDate;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/default.aspx");
	deptDate=driver.findElement(By.id("ctl00_mainContent_view_date2"));
	if(deptDate.isEnabled())
	{
		System.out.println("it is enabled");
	}
	else
	{
		System.out.println("It is Disabled");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsEnabledDemo oo=new IsEnabledDemo();
		oo.Launch();
	}

}
