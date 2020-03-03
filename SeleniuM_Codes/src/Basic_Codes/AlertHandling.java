package Basic_Codes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	String path;
public void Login() throws InterruptedException
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.findElement(By.name("proceed")).click();
	Alert alt=driver.switchTo().alert();
	//Thread.sleep(5000);
	System.out.println(alt.getText());
	alt.accept();
	
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertHandling oo=new AlertHandling();
		oo.Login();
	}

}
