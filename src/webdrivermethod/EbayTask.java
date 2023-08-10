package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EbayTask 
{

	public static void main(String[] args) 
	    {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
             
             driver.get("https://www.ebay.com/");
             String Pagesource=driver .getPageSource();
            if(Pagesource.contains("more eBay"))
            System.out.println("Page displayed");
            else
            	System.out.println("Page Not found");
            driver.manage().window().maximize();    
	}

}
