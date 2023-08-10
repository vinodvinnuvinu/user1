package POM;

import java.time.Duration;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginScript {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FaceBookLoginPage loginpage = new FaceBookLoginPage(driver);
		
		loginpage.setUserName("Vinod Kumar V R");
		loginpage.setPassword("7337694989");
		loginpage.clickLoginButton();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
