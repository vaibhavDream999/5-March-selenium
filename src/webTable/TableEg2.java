package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//to know how many rows are there in table
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr"));
		int TotalNoOfRows = rows.size();
		System.out.println("total no of rows in table is "+TotalNoOfRows);
		System.out.println("======================================================");
		
		for(WebElement r:rows) 
		{
			System.out.print("|| "+r.getText()+" ||");
			System.out.println();
		}
		System.out.println("======================================================");

		//to know how many columns are there in table
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//th"));
		int TotalNoOfColumns = columns.size();
		System.out.println("Total No Of Columns in table "+TotalNoOfColumns);
		System.out.println("======================================================");
		
		for(WebElement c:columns) 
		{
			System.out.println(c.getText()+ " ||");
		}
		 
		//To read table we can use Nested For Loop
		for(int i=1;i<=TotalNoOfRows;i++) 
		{
			for(int j=1;j<=TotalNoOfColumns;j++) 
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.println(text+" ||");
				}
				else
				{
					String text = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//table//tr["+i+"]//td["+j+"]")).getText();
					System.out.println(text+" ||");
				}
			}
			System.out.println();
		}
	}

}
