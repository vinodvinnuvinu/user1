package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		  
	        driver.manage().window().maximize();
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        WebElement checkbox =driver.findElement(By.id("keepLoggedInLabel"));
	        checkbox.click();
	       Thread.sleep(2000);
	        if(checkbox.isSelected())
	        	System.out.println("Selected");
	        else
	        	System.out.println("Not Selected");
	        driver.quit();
		

	}

}
