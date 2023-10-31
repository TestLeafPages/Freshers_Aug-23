package week8.day1;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
public static void main(String[] args) {
	//Launch the browser
			ChromeDriver driver=new ChromeDriver();
			//Load the application url
			driver.get("https://erail.in/");
			//Maximize the browser
			driver.manage().window().maximize();
			//Apply implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			//Enter from station
			WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
			fromStation.clear();
			fromStation.sendKeys("MAS",Keys.ENTER);
			//Enter to station
			WebElement toStation = driver.findElement(By.id("txtStationTo"));
			toStation.clear();
			toStation.sendKeys("MDU",Keys.ENTER);
			
			//uncheck the sort on date check box
		 driver.findElement(By.id("chkSelectDateOnly")).click();
		 
		 //To get all train names
		 List<WebElement> eleTrainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		 
		 for (int i = 0; i < eleTrainName.size(); i++) {
			 String text = eleTrainName.get(i).getText();
			 System.out.println(text);
		}
		 
		 
		 
		 
			
			
			
			
}
}
