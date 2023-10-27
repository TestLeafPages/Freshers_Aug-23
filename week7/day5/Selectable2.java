package week7.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable2 {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://jqueryui.com/selectable/");
	WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(ele);
	
	Actions builder=new Actions(driver);
	
	WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	
	WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
    WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	
	WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	
	
	builder.keyDown(Keys.CONTROL).click(ele1).click(ele2).click(ele3).click(ele4).keyUp(Keys.CONTROL).perform();
	
}
}
