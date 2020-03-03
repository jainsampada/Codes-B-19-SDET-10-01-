package TestNGDemo;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {

@Test(priority=0)
public void driverInfo()
{
	System.out.println("Driver Info");
}
@BeforeClass
public void befClass()
{
	System.out.println("Before Class");
}
@AfterClass
public void AfteClass()
{
	System.out.println("After class");
}
@BeforeTest
public void BefTest()
{
	System.out.println("Before Test");
}
@AfterTest
public void AfteTest()
{
	System.out.println("After Test");
}
@BeforeMethod
public void befMethod()
{
	System.out.println("Before Method");
}
@AfterMethod
public void Aftemethod()
{
	System.out.println("After Method");
}
@Test(priority=1)
public void Launch()
{
	System.out.println("Launch");
}
@BeforeSuite
public void beforeDemo()
{
	System.out.println("Before Suite");
}
@AfterSuite
public void close_Browser()
{
	System.out.println("Close Browser");
}
}

