package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTextLocatorsPractice2 {

	public static void main(String[] args) throws InterruptedException 
	   {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("/demo.actitime.com");
		driver.findElement(By.linkText("forgot your pssword")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("return to login page")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
