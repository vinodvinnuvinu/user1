package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Mainclass {
	@BeforeSuite
	public void suiteConfiguration()
	{
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void testConfiguration()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeClass
	public void classConfiguration()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeMethod
	public void methodConfiguration()
	{
		System.out.println("@BeforeSuite");
	}

	@AfterMethod
	public void methodTearDown()
	{
		
	}
	public void ClassTeardown()
	{
		
	}public void TestTeardown()
	{
		
	}public void suite1Teardown()
	{
		
	}
}

