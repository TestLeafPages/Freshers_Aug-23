package week8.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
public static void main(String[] args) {
	//Launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/window.xhtml");
		//Maximize the chrome browser
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("current page "+driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
//		Set<String> openedWindow = driver.getWindowHandles();
//		System.out.println(openedWindow.size());
//		
//		List<String> childWindow=new ArrayList<String>(openedWindow);
		
		//driver.switchTo().window(childWindow.get(1));
		System.out.println("next page "+driver.getTitle());
		
	//	driver.close();
	driver.quit();	
		
		
		
}
}
