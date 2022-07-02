package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		button.click();
		Thread.sleep(200);
		
		//1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		Alert alt = driver.switchTo().alert();
		
		//2.Alert is an interface which contains abstract methods like popup
		System.out.println(alt.getText());//use to get text present in a alert 
		
		alt.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button2.click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//a[@class='analystic'])[1")).click();
		}
}