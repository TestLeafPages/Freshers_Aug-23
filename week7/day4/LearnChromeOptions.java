package week7.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnChromeOptions {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.myntra.com/");
	
	//locate the men element
	WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
	
	Actions builder=new Actions(driver);
	
	//WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Shirts')]"));
	
	builder.moveToElement(men).perform();
	//click on T-Shirt
	driver.findElement(By.xpath("//a[contains(text(),'Shirts')]")).click();
}
}
