package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FecebookWait {
	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Apply implicitly wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click on Create New Account link
		driver.findElement(By.linkText("Create new account")).click();
		By name = By.name("firstname");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(name));
		
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Mani");

		// TODO Auto-generated catch block
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mani");


	}
}
