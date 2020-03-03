package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
@DataProvider(name="authenticate")
public Object[][] Checklogin()
{
	Object[][] login=new Object[3][2];
	login[0][0]="admin";
	login[0][1]="ad123";
	
	login[1][0]="ad";
	login[1][1]="sdsd";
	
	login[2][0]="123";
	login[2][1]="asd";
	
	return login;
	
}


@Test(dataProvider="authenticate")
public void CheckLoginDemo(Object uname,Object pass)
{
	System.out.println("Username"+uname);
	System.out.println("Password"+pass);
}

}
