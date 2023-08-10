package autosuggetions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopupPractice1 {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
	
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.className("demo-icon icon-flights")).click();
		
		driver.quit();
		
	

	}

}
