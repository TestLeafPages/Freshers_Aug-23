package week6.day4;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Maximize the chrome browser
		driver.manage().window().maximize();

		//controll move to frame
		driver.switchTo().frame("iframeResult");
		//click on Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//control move to an Alert
		Alert alert = driver.switchTo().alert();
		//pass the values an alert
		alert.sendKeys("TestLeaf");
		//accept the alert
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
       
	}
}
