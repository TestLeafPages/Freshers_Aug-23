package week8.day1;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {
public static void main(String[] args) throws InterruptedException {
	//Launch the browser
			ChromeDriver driver=new ChromeDriver();
			//Load the application url
			driver.get("https://www.leafground.com/select.xhtml");
			//Maximize the browser
			driver.manage().window().maximize();
			//Apply implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			//Locate the dropdown webelement
			WebElement ele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
			Select dropDown=new  Select(ele);
			List<WebElement> options = dropDown.getOptions();
			for (int i = 0; i < options.size(); i++) {
				String text = options.get(i).getText();
				System.out.println(text);
			}
			
			//How to select multiple value from drodown
//			WebElement ele2 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
//			Select dropDown2=new  Select(ele2);
//			dropDown2.selectByIndex(1);
//			Thread.sleep(2000);
//			dropDown2.selectByVisibleText("Cypress");
			
			//How to select random values from dropdown
			WebElement ele3 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
			Select dropDown3=new  Select(ele3);
			List<WebElement> options2 = dropDown3.getOptions();
			dropDown3.selectByIndex(options2.size()-2);
			
}
}
