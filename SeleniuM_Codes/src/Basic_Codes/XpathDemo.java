package Basic_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	String path;
	public void ByTagnamedemo() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To Maximize the Browser window
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("admin");
	//	driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
		//driver.findElement(By.xpath("//a[text()='Terms']")).click();
		
		//Static wait
		Thread.sleep(5000);
		
		//Delete all Cookies
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='email']")).clear();

	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		XpathDemo oo=new XpathDemo();
		oo.ByTagnamedemo();

	}

}
