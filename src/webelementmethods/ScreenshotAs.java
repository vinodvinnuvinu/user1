package webelementmethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotAs {

	public static void main(String[] args) throws IOException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginButton = driver.findElement(By.name("login"));
		
		File src =loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ElementScreenshot/"+loginButton.getText()+".png");
		FileUtils.copyFile(src,dest);
		driver.quit();
	

	}

}
