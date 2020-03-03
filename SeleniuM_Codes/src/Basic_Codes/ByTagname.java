package Basic_Codes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagname {
	String path;
public void ByTagnamedemo()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.tagName("img")));
	System.out.println(al.size());
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i).getText());//To Fetch text of Links
		System.out.println(al.get(i).getAttribute("src"));//to fetch linkS of a tag
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByTagname oo=new ByTagname();
		oo.ByTagnamedemo();
	}

}
