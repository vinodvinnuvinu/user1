package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetLocationPractice {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        
         driver.manage().window().maximize();
         driver.get("https://www.amazon.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         WebElement dressesImage = driver.findElement(By.xpath("//img[@alt='Dresses']"));
         Point location = dressesImage.getLocation();
         int x = location.getX();
         int y = location.getY();
         System.out.println(x);
         System.out.println(y);
         driver.quit();
         
         
         

	}

} 
