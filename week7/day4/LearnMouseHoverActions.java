package week7.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHoverActions {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	//locate the men element
	WebElement kids = driver.findElement(By.xpath("//a[text()='KIDS']"));
	
	Actions builder=new Actions(driver);
	
	WebElement shirt = driver.findElement(By.xpath("(//a[text()='Shirts'])[3]"));
	
	//builder.moveToElement(kids).perform();
	//click on T-Shirt
	//builder.click(shirt).perform();
	
	builder.moveToElement(kids).pause(1000).click(shirt).perform();
}
}
