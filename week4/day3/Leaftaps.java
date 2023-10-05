package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {
public static void main(String[] args) {
	//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//Apply implicitly wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter the username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit123")).click();
}
}
