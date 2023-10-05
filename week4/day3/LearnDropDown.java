package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
public static void main(String[] args) {
	//Launch Chrome browser
	ChromeDriver  driver=new ChromeDriver();
	//Load the appplication url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01irrgqx23bkrb13f8uhkmichvw515598.node0");
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Locate  the Dropdown element and store into WebElement
	WebElement dropDown = driver.findElement(By.className("ui-selectonemenu"));
	
	//Create Object for Select class and to select the values from dropdown
	Select dropDownBox=new Select(dropDown);
	  //Select  By Index
	//dropDownBox.selectByIndex(1);
	
	//Select By Visible Text
	dropDownBox.selectByVisibleText("Cypress");
}
}
