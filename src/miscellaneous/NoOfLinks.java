package miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());// No of links present in webpage
		// To print all links we can use iterator
		
		Iterator<WebElement> ma = Links.iterator();
		while(ma.hasNext()) 
		{
			System.out.println(ma.next().getText());
		}
		System.out.println("==============================================");
		
		for(Object re:Links) 
		{
			System.out.println(re.toString());
		}
	}

}
