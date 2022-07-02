package miscellaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleOrderlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//1st handle Hidden-Division pop up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("oneplus 10 pro");// for finding search box
		
		WebElement searchbutton = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchbutton.click();
		
		List<WebElement> searchresult = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));
		for(WebElement search:searchresult) 
		{
			System.out.println(search.getText());
		}
		System.out.println("==============================================");
		for(WebElement result:searchresult) 
		{
			System.out.println(result.getText());
		}
	
	}

}
