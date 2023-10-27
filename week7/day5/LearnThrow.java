package week7.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnThrow {
public static void main(String[] args) throws InterruptedException, FileNotFoundException {
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
	Thread.sleep(3000);
	FileInputStream file=new FileInputStream("./snap");
			driver.findElement(By.name("firstname")).sendKeys("Mani");
		
			// TODO Auto-generated catch block
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		
		//throw new RuntimeException();
		
}
}
