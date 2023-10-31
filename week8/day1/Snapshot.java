package week8.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Snapshot {
public static void main(String[] args) throws IOException {
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml");
	//Maximize the browser
	driver.manage().window().maximize();
	//Apply implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement ele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	
	//To take entire webpage
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snapshot/001.jpeg");
	
	FileUtils.copyFile(screenshotAs, destination);
	//To take particular webelement
	WebElement ele1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	
	File source = ele1.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snapshot/003.jpeg");
	
	FileUtils.copyFile(source, dest);
	FileHandler.copy(source, dest);
	
}
}
