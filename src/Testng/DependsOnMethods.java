package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	WebDriver driver;
	@Test
	public void navigateToActitime()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("\"https://demo.actitime.com/login.do");
	
	}
	
	@Test(dependsOnMethods = "navigateToActitime")
	public void loginActitime()
	{
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		WebElement userprofile = driver.findElement(By.className("userProfileLink"));
		if(userprofile.isDisplayed())
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();
	
	}
}
