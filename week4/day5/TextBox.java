package week4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/input.xhtml");
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Enter your name
	driver.findElement(By.xpath("(//h5[text()='Type your name']/following::input)[1]")).sendKeys("Keerthi");
	//Append Country to this City.
	driver.findElement(By.xpath("(//h5[text()='Append Country to this City.']/following::input)[1]")).sendKeys("India");
	//Verify if text box is disabled
WebElement enabled = driver.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']/following::input)[1]"));
enabled.isEnabled();
System.out.println(enabled);

String attribute = enabled.getAttribute("placeholder");
System.out.println(attribute);



}
}
