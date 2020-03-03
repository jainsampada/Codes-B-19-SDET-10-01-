package Basic_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionDemo {
	String path;
	WebElement deptDate;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	WebDriver driver=new ChromeDriver();
//	driver.get("https://jqueryui.com/droppable/");
//	driver.switchTo().frame(0);
//	
//	Actions act=new Actions(driver);
//	act.clickAndHold(driver.findElement(By.id("draggable")))
//	.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	driver.get("https://www.facebook.com/");
	
	//For selecting Drop Down list
	Select slt=new Select(driver.findElement(By.id("day")));
	slt.selectByValue("12");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionDemo oo=new ActionDemo();
		oo.Launch();

	}

}
