package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocatorsPractice1 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.className("textField")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.className("pwdfield")).sendKeys("manage");
        driver.findElement(By.className("initial")).click();
        Thread.sleep(2000);
        if(driver.getTitle().equals("actiTIME -  Enter Time-Track"))
        		System.out.println("Test Pass");
        else
        	System.out.println("Test Fail");
        driver.quit();
        	
        
	}

}
