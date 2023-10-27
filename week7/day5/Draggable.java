package week7.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://jqueryui.com/draggable/");
	WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(ele);
	
	Actions builder=new Actions(driver);
	
	WebElement draggable = driver.findElement(By.id("draggable"));
	builder.dragAndDropBy(draggable, 300, 500).perform();
}
}
