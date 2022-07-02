package popUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		// 1.	To get address of main page  we need to use syntax
		String IdOfMainPage = driver.getWindowHandle();
		System.out.println("Main page ID is "+IdOfMainPage);
		
		// 2.	To get address of main page as well child browser we need to use synatx
		// 'allId' are recieved in set
		Set<String> allId = driver.getWindowHandles();
		
		//In 'set' we can not used for loop for iteration , hence we used 'ArrayList' for that.
		ArrayList<String> arr= new ArrayList<>(allId);
		
		for(int i=0;i<=arr.size()-1;i++) 
		{
			System.out.println(arr.get(i));
		}
        //  After all we get ID of each page. it will be change at every window page 
		//	Main Page ID=  "CDwindow-F8D31D89839504CDB575102AFDD71E02"
        //	Child Page ID= "CDwindow-57742029B16D1BF344ED2F479FD49B76"
		
		String MainPageID = arr.get(0);
		String ChildPageID = arr.get(1);
		
		driver.switchTo().window(ChildPageID);// here selenium focus switched to child page
		Thread.sleep(300);
		
		driver.manage().window().maximize();// To maximize child screen
		Thread.sleep(300);
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
		driver.close();// will close only current tab
		//driver.quit();// will close all the window open by selenium of current session
		
		
		
	}

}
