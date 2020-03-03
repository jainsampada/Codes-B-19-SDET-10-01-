package Basic_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {
	String path;
	WebElement uname;
	WebElement pass;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	//Initialize the Chrome Driver
	WebDriver driver=new ChromeDriver();
	
	//Launch the application on which you want to perform testing
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//Second method to launch Application on Browser
	driver.navigate().to("http://172.16.10.77/hrm/login.php");
	uname=driver.findElement(By.name("txtUserName"));
	System.out.println(uname.getSize());
	if(uname.isDisplayed())
	{
			uname.sendKeys("admin");
	}
	pass=driver.findElement(By.name("txtPassword"));
	if(pass.isDisplayed())
	{
			pass.sendKeys("admin");
	}
	driver.findElement(By.name("Submit")).submit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByName oo=new ByName();
		oo.Launch();
	}

}
