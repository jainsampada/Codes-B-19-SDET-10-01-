package Basic_Codes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
String path;
	public void Launch()
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println(path);
		//Initialize the Chrome Driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		
		Set<String> sel=driver.getWindowHandles();
		Iterator<String> it=sel.iterator();
		
		String parentWindowId=it.next();
		System.out.println("Id of Parent window is:"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("Child window id is:"+childWindowId);
		driver.switchTo().window(childWindowId);
		String title=driver.getTitle();
		System.out.println("Child window Title is:"+title);
		driver.close();
	
		
		driver.switchTo().window(parentWindowId);
		String titlewin=driver.getTitle();
		System.out.println("Title of Parent Window is:"+titlewin);
		driver.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowHandleDemo oo=new WindowHandleDemo();
		oo.Launch();
	}

}
