package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement dropDown = driver.findElement(By.name("cars"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(dropDown);
		
		//3.check is Multiple
		boolean result = s.isMultiple();
		System.out.println("isMutiple result is "+result);
		
		s.selectByIndex(0);
		Thread.sleep(200);
		
		s.selectByIndex(1);
		Thread.sleep(200);
		
		s.selectByIndex(2);
		Thread.sleep(200);
		
		s.selectByIndex(3);
		Thread.sleep(200);
		
		//s.deselectAll();// can be used only for multiple selectable
		s.deselectByVisibleText("Saab");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		WebElement firstWebElement = s.getFirstSelectedOption();
		String myText = firstWebElement.getText();
		System.out.println("1st selected option is "+myText);
		
		System.out.println(s.getAllSelectedOptions().size());
		
		for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++) 
		{
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		
	}

}
