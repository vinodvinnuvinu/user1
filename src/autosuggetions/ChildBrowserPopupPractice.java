package autosuggetions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserPopupPractice {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' GEARS '] "));
		driver.findElement(By.xpath("//ul[@class='dropdown menu gear menu')]/descendant::a[text()='skillRary']")).click();
		Thread.sleep(2000);
		String parentID=driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for (String id:windows)
		{
			driver.switchTo().window(id);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("mytext")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	

	}

}
