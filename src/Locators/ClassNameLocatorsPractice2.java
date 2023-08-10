package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocatorsPractice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.className("gh-tb ui-autocomplete-input")).sendKeys("head phones");
        driver.findElement(By.className("btn-prim")).click();
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
