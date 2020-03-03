package TestNGDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data_DrivenTest 
{
	String path;
	@Test(dataProvider="empdata")
	public void CheckLogin(String Email,String Pass)
	{
		
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		//Initialize the Chrome Driver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("pass")).sendKeys(Pass);
		driver.findElement(By.id("u_0_b")).click();
		
		
	}

	@DataProvider(name="empdata")
	public Object[][] readData() {
		//Read data from xls Sheet
		//get the access Excel Sheet
		String sheetpath = System.getProperty("user.dir")+"\\src\\TestNGDemo\\LoginDetails.xls";
		Xls_Reader xlr = new Xls_Reader(sheetpath ); //Constructor Calling of XLS_Reader class
		
		//Count Row
		int rowCount = xlr.getRowCount("Login");//5
		System.out.println(rowCount);
		//Count Col
		int colCount = xlr.getColumnCount("Login");//2
		System.out.println("Col Count:"+colCount);
		Object[][] arr = new Object[rowCount-1][colCount];//2 2
		
		int ci=0;
		for(int i=2; i<=rowCount;i++,ci++) {
			//i=2
			int cj=0;
			for(int j=0;j<colCount;j++,cj++) {
				//j=0
				arr[ci][cj] = xlr.getCellData("Login", j, i);//admin..admin
				System.out.println(arr[ci][cj]);
			}
		}
		return arr;
		
	}
}
