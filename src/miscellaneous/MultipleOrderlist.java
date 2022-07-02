package miscellaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleOrderlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
		driver.findElement(By.name("q")).sendKeys("HONDA");// for finding in search box
		
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));// for find UnOrder List
		
		for(WebElement search:searchresult)
		{
			System.out.println(search.getText());
		}
		System.out.println("==============================================");
		
		String expectedResult = "honda civic";
		for(WebElement results:searchresult)
		{
			//System.out.println(results.getText());
			String actualresults = results.getText();// for find all model of HONDA
		
			if(actualresults.equals(expectedResult)) 
			{
				results.click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
		// we are click on images by 2 way
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("Im")).click();
	}
}
