package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// switch selenium to from main page to frame
		driver.switchTo().frame("frame1");
		Thread.sleep(300);
		
		// current focus is on frame
		Thread.sleep(3000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		WebElement Txt = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		WebElement Txt1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		
		System.out.println(Txt1.getText());
		System.out.println(Txt.getText());

	}

}
