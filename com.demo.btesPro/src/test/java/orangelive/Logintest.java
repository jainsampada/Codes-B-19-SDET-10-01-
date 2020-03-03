package orangelive;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logintest extends Driver{
	String title,exptitle="Orange HRM";
	
	@Test
	public void CheckTitle()
	{
		
		
		
		title=driver.getTitle();
		if(title.equals(exptitle))
		{
			System.out.println("Correct page opened");
		}
		else
		{
			System.out.println("Not Correct page");
		}
	}
	@Test
	public void Login() throws InterruptedException
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).submit();
		Thread.sleep(5000);
	}
}
