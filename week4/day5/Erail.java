package week4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://erail.in/");
	
	driver.manage().window().maximize();
	
	WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	fromStation.clear();
	fromStation.sendKeys("MAS",Keys.ENTER);
	
	WebElement toStation = driver.findElement(By.id("txtStationTo"));
	toStation.clear();
	toStation.sendKeys("MDU",Keys.ENTER);
	
	//verify check box
	WebElement selected = driver.findElement(By.id("chkSelectDateOnly"));
	boolean selected2 = selected.isSelected();
	
	//System.out.println(selected);
	if(selected2) {
		System.out.println("Check box is already selected");
	selected.click();
	}else {
		System.out.println("Check box not selected");
	}


}
}
