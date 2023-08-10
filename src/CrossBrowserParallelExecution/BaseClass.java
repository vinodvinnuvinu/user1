package CrossBrowserParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	protected WebDriver driver;
	@Parameters("BROWSER")
	@BeforeMethod
	public void methodSetup(String browser) 
	{
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		else if(browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equals("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Invalid browser data");
		
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void methodTeardown()
	{
		driver.quit();
	}

}
