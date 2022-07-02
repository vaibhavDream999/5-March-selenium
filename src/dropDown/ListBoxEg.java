package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(3000);
		 
		// for DAY
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(day);
		
		//3. By using one of the select class methods we can select values form list box like 
		// i. selectByVisibleText: selectByVisibleText(String arg0) 
		// ii. selectByIndex: selectByIndex(int arg0) 
		// iii. selectByValue: selectByValue(String arg0)
		
		Thread.sleep(500);
		s.selectByVisibleText("13");
		Thread.sleep(300);
		s.selectByIndex(17);
		Thread.sleep(300);
		s.selectByValue("20");
		
		// for MONTH
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement month = driver.findElement(By.id("month"));
		
		//2.Create an object of Select class which will accept WebElement as argument
				Select s1= new Select(month);
				
	    //3. By using one of the select class methods we can select values form list box like 
		// i. selectByVisibleText: selectByVisibleText(String arg0) 
		// ii. selectByIndex: selectByIndex(int arg0) 
		// iii. selectByValue: selectByValue(String arg0)
		Thread.sleep(400);
		s1.selectByVisibleText("Mar");
		Thread.sleep(300);
		s1.selectByIndex(10);
		Thread.sleep(3000);
		s1.selectByValue("6");
		
				
				
				
	}

}
