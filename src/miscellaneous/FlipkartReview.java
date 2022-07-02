package miscellaneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//1st handle Hidden-Division pop up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 12");// for finding search box
		WebElement searchbutton = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchbutton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
		System.out.println(reviews.getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement reviews1 = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
		System.out.println(reviews1.getText());
	}

}
