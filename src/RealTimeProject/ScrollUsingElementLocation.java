package RealTimeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollUsingElementLocation {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://cls-clickbizz.in/#");
		
		//https://cls-clickbizz.in/#
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		WebElement woodmart = driver.findElement(By.xpath("//img[@src='https://cls-clickbizz.in/wp-content/uploads/2021/07/wood-logo-dark.svg']"));
		
		Point location = woodmart.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		js.executeAsyncScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
