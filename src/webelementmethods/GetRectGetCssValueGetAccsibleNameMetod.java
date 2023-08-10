package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRectGetCssValueGetAccsibleNameMetod {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.linkText("Create New Account"));
				System.out.println(element.getAccessibleName());
		System.out.println(element.getCssValue("colour"));
		System.out.println(element.getCssValue("background-colour"));
		
		Rectangle r= element.getRect();
		System.out.println("height: " +r.getHeight());
		System.out.println("Width: " +r.getWidth());
		System.out.println("X coordinate: "+r.getX());
		System.out.println("Y coordinate: "+r.getY());
		
		driver.quit();
		
		
	

	}

}
