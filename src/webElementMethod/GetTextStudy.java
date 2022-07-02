package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).click();
		WebElement Element1=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		System.out.println(Element1.getText());
		String actualText=Element1.getText();
		String expectedtext="Facebook helps you connect and share with the people in your life.";
		
		if(actualText.equals(expectedtext)) 
		{
			System.out.println("Text is matching and TC is Passed");
		}
		else 
		{
			System.out.println("Text is not matching and TC is failed");
		}
	}

}
