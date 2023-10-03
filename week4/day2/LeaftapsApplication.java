package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeaftapsApplication {
public static void main(String[] args) {
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("http://leaftaps.com/opentaps/control/login");
	//Maximize the browser
	driver.manage().window().maximize();
	//Enter the username as Demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//Enter the password as crmsfa
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	//Click on Login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	//click on crmsfa hyper link
	driver.findElement(By.linkText(("CRM/SFA"))).click();
	//driver.findElement(By.partialLinkText(("SFA"))).click();
	driver.findElement(By.linkText(("Leads"))).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	
	
}
}
