package scorlling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		System.out.println(driver.manage().window().getSize());
		
		//To set size--> use Dimension class and create object of Dimension class
		// regular size of browser = (1296, 688)
		Dimension drr= new Dimension(1200, 350);
		driver.manage().window().setSize(drr);
	}

}
