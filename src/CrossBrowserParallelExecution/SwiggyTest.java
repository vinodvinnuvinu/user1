
package CrossBrowserParallelExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SwiggyTest extends BaseClass
{
	@Test
	public void swiggypageTest()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions c=new ChromeOptions();

		c.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(c);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//div[@class='_2tnu-']//div[2]//div[1]//img[1]"));
		if(logo.isDisplayed())
			System.out.println("pass");
		else
			System.out.println("fail");
		
	}

}
