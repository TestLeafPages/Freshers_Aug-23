package week6.day4;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3School {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/frame.xhtml");
		//Maximize the chrome browser
		driver.manage().window().maximize();

		//controll move to frame
		driver.switchTo().frame(0);
		//click on click me button
		WebElement ele = driver.findElement(By.id("Click"));
        ele.click();
        String text = ele.getText();
       System.out.println(text);
       //control move to main webpage
      // driver.switchTo().defaultContent();
       //Handle nested frame
       //outer frame
       driver.switchTo().frame(2);
       //inner frame
      // driver.switchTo().frame("frame2");
       driver.switchTo().frame(0);
       
       WebElement nestedFrame = driver.findElement(By.id("Click"));
       nestedFrame.click();
       
       String text2 = nestedFrame.getText();
       System.out.println(text2);
       
       
       
	}
}
