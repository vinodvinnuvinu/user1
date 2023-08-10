package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayed {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		  
	        driver.manage().window().maximize();
	        driver.get("https://www.vtiger.com");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        WebElement loginButton =driver.findElement(By.xpath("//img[@alt='vtiger crm']"));
	      
	        if(loginButton.isEnabled())
	        	System.out.println("Displayed");
	        else
	        	System.out.println("Not Displayed");
	        driver.quit();
		

	}

}
