package Basic_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {
	String path;
	public void CheckbyLink()
	{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	//Initialize the Chrome Driver
	WebDriver driver=new ChromeDriver();
	
	//Launch the application on which you want to perform testing
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//Second method to launch Application on Browser
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.partialLinkText("your")).click();
	}
	public static void main(String[] args) {
	ByLinkText oo=new ByLinkText();
	oo.CheckbyLink();
	}
}
