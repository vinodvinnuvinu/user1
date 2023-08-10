package actionclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Doubleclassespractice1 {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		 
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			WebElement kids = driver.findElement(By.id("course"));
			Actions  a = new Actions(driver);
			a.moveToElement(kids).perform();
			
			driver.findElement(By.xpath("//span[@class='wrappers']/child::a[text()='selenium training']")).click();
			
			int quantityBefore = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
			WebElement plusButton = driver.findElement(By.cssSelector("i.fa-plus"));
			a.doubleClick(plusButton).perform();
			
			int quantityAfter = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
			if(quantityAfter == quantityBefore+1)
				System.out.println("pass");
			else
				System.out.println("fail");
			driver.quit();

	}

}
