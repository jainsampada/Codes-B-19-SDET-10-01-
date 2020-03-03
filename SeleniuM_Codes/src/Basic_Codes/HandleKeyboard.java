package Basic_Codes;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleKeyboard {
	String path;
public void launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	System.out.println(path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Input Devices");
	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleKeyboard oo=new HandleKeyboard();
		oo.launch();

	}

}
