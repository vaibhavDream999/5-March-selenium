package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement tableheader1 = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr//th[1]"));
		System.out.println(tableheader1.getText());
		
		WebElement tabledata2 = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr//td[2]"));
		System.out.println(tabledata2.getText());
		
		List<WebElement> row4 = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr[4]"));
		for(WebElement r:row4) 
		{
			System.out.print(r.getText()+ " ||");
		}
		System.out.println();
		List<WebElement> row5 = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr[5]"));
		for(WebElement r1:row5) 
		{
			System.out.print(r1.getText()+" ||");
		}
	
	}

}
