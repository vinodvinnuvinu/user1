package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocatorsPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("vinodvinukumar95@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("vinod");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		
		

	}

}
