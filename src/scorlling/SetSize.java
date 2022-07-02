package scorlling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
		System.out.println(driver.manage().window().getSize());
		
		//To set size--> use Dimension class and create object of Dimension class
		// regular size of browser=(1296, 688)
		Dimension dr= new Dimension(1296, 460);
		driver.manage().window().setSize(dr);
		
		Dimension dr1= new Dimension(128, 500);// Extra worked by me
		driver.manage().window().setSize(dr1);// Extra worked by me

	}

}
