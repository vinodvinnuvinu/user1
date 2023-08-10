package windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://www.actitime.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String src=driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
		System.out.println(src);
		
		

	}

}
