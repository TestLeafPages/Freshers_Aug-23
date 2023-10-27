package week7.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
public static void main(String[] args) {
	//Launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/window.xhtml");
	//Maximize the chrome browser
	driver.manage().window().maximize();
	
	//to get parent Window 
	String parentWindow = driver.getWindowHandle();
	
	//verify page title 1
	String title1= driver.getTitle();
	System.out.println("title1  "+title1);
	
	//click on ok Button
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	//To get child windows
	Set<String> childWindow = driver.getWindowHandles();
	
	//create empty list and convert Set into List
	List<String> openedWindow=new ArrayList<String>(childWindow);
	
	driver.switchTo().window(openedWindow.get(1));
	
	//verify page title 2
		String title2= driver.getTitle();
		System.out.println("title2  "+title2);
	
	//driver.close();
		
	driver.quit();	
	
	
	
	
	

}
}
