package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssLocatorsPractoice1 {

	public static void main(String[] args) throws InterruptedException
	 {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[class='initial']")).clear();
		Thread.sleep(2000);
		if(driver.getTitle().equals("actiTime - Enter Time-Track"))
		    System.out.println("pass");
		    else
		    	System.out.println("Fail");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
