package Data_Driven;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FetchData {
public void Fetch() throws IOException
{
	FileInputStream fs=new FileInputStream("D:\\B_19_SDET_10_01\\SeleniuM_Codes\\src\\TestData\\LoginDetails.xls");
	
	//Access Workbook
	HSSFWorkbook wb=new HSSFWorkbook(fs);
	
	//Access WorkSheet
	HSSFSheet sheet=wb.getSheet("Login");
	
	//Fetch last row number where data is saved 
	System.out.println(sheet.getLastRowNum());
	//Access Row of Login Sheet
	HSSFRow row=sheet.getRow(2);
	
	//Fetch data from cell
	HSSFCell cell=row.getCell(0);
	
	System.out.println(cell);
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FetchData data=new FetchData();
		data.Fetch();
	}

}
