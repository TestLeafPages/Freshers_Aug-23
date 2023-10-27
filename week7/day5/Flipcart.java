package week7.day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {
public static void main(String[] args) throws InterruptedException, FileNotFoundException  {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	
	Thread.sleep(2000);
	File obj4=new File("./snap");
	FileInputStream obj2=new FileInputStream("./snap");
	//locate the men element
	
	Actions builder=new Actions(driver);
	Thread.sleep(4000);
	WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Thread.sleep(4000);
	builder.moveToElement(electronics).perform();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Samsung']")).click();

	Thread.sleep(4000);
	List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
 System.out.println("Size " +priceList.size());
 
 //create an empty list
 List<Integer> obj=new ArrayList<Integer>();
	for (int i = 0; i <priceList.size(); i++) {
		String text = priceList.get(i).getText();
		//System.out.println(i+"   "+text);
		
		
		//use replce all method to print digit only
		String replaceAll = text.replaceAll("\\D", "");
		System.out.println("replace "+replaceAll);
		
		//convert the String into int using type casting
		int parseInt = Integer.parseInt(replaceAll);
		obj.add(parseInt);
	}
	
	System.out.println(obj);
	
	//to get min value in list
	Collections.sort(obj);
	Integer integer = obj.get(0);
	System.out.println(integer);
	
	Integer integer2 = obj.get(obj.size()-1);
	System.out.println(integer2);
	
	
	
	Integer min = Collections.min(obj);
	System.out.println("min "+min);
	
	Integer max = Collections.max(obj);
	System.out.println("Max "+max);
	
	
	
	
}
}
