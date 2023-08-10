package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginScriptUsingExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./Test Data Resources/text data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		List<String> list = new ArrayList<>();
		for(int i = 0; i < 4; i++)
		{
			String data = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			list.add(data);
			
		}
		System.out.println(list);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get(list.get(0));
		
		long time=Long.parseLong(list.get(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username")).sendKeys(list.get(1)+Keys.TAB +list.get(2)+Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		
		boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		if(status)
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit(); 
		

	}

}
