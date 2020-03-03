package Basic_Codes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass {
	String path;
	int Count;

	public void CheckbyClass() {
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println(path);
		// Initialize the Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Launch the application on which you want to perform testing
		// driver.get("https://opensource-demo.orangehrmlive.com/");

		// Second method to launch Application on Browser
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//To pick all the elements comes under classname form-hint
		ArrayList<WebElement> al = (ArrayList<WebElement>) driver.findElements(By.className("form-hint"));
		Count = al.size();
		System.out.println(Count);
		for (int i = 0; i < Count; i++) {
			System.out.println(al.get(i).getText());
		}
		// System.out.println("Text is"+text);

	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ByClass oo = new ByClass();
		oo.CheckbyClass();

	}

}
