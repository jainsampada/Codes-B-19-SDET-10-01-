package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {
	
		String var, uname, pass,path;

		public void fetch() throws IOException {
			FileInputStream fs = new FileInputStream(
					"D:\\B_19_SDET_10_01\\SeleniuM_Codes\\src\\TestData\\LoginDetails.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheet("Sheet1");
			int count=sheet.getLastRowNum();
			System.out.println(count);
			HSSFRow row=sheet.getRow(0);
			int col = row.getLastCellNum()-1;
			path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
	
			//Initialize the Chrome Driver
			WebDriver driver=new ChromeDriver();
			
			for (int i = 1; i <= count; i++) {
		
				for (int j = 0; j < col; j++) {

					driver.navigate().to("https://www.facebook.com/");
					uname = sheet.getRow(i).getCell(j).toString();
					pass = sheet.getRow(i).getCell(j + 1).toString();
				
					driver.findElement(By.name("email")).clear();
					driver.findElement(By.name("email")).sendKeys(uname);
					driver.findElement(By.name("pass")).clear();
					driver.findElement(By.name("pass")).sendKeys(pass);
					driver.findElement(By.id("u_0_b")).click();
					driver.navigate().back();
				}
				}

		}

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			FacebookDemo ko = new FacebookDemo();
			ko.fetch();
		}
}
