package week7.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFinally {
public static void main(String[] args) {
	//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Apply implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account link
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter first name
		try {
			driver.findElement(By.name("firstname123")).sendKeys("Mani");
		} 
		finally {
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mani");
			
		}
			
			
		
		
		
}
}
