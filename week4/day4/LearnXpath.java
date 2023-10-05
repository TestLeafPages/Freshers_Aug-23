package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
public static void main(String[] args) {
	//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter the username as Demosalesmanager
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//Enter the password as crmsfa
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click on Login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click on hyper link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on Leads tap
		driver.findElement(By.xpath("//atext()='Leads']")).click();
		
}
}