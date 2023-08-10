package autosuggetions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonPractice1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("gLFyf")).sendKeys("dresses");
		Thread.sleep(2000);
		
		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("//div[@class='OBMEnb']/descendent::li[@class='sbct']"));
		
	  for(WebElement element:list)
	  {
		  System.out.println(element.getText());
	  }
         driver.quit();
	}

}
