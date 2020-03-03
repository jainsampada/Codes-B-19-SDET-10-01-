package DemoHRM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomeTest extends Driver {
@Test//(groups="Smoke")
public void checkAdmin()
{
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
	
}
@Test 
public void JobOpen()
{
	driver.findElement(By.xpath("//*[@id='menu_admin_Job']")).click();
	driver.findElement(By.xpath("//*[@id='menu_admin_viewJobTitleList']")).click();
	
	
	//*[@id="menu_admin_viewJobTitleList"]
}
}
