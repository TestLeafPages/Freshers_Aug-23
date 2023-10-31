package  week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafgroundWindowsWait {
	
	
	public static void main(String[] args) {
//		System.setProperty(null, null)
//		SafariDriver driver = new SafariDriver();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Webdriver wait - 20 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// Load the waits url
		driver.get("https://leafground.com/waits.xhtml");
//		driver.getScreenshotAs(OutputType.FILE);
		// 1st click button to view I am here button
		WebElement firstButton;
		wait.until(ExpectedConditions.visibilityOf(firstButton = driver.findElement(By.xpath("//button[contains(@class,'ui-button-secondary')]"))));
//		driver.findElement(By.xpath("//button[contains(@class,'ui-button-secondary')]")).click();
		firstButton.click();
		// wait to view I am here button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		String wait1Text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(wait1Text);
		
		// 2nd click button to hide the I am about to hide
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-success')]")).click();
		//Wait for I am about to hide
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='I am about to hide']"))));
		
		// Click on click first button 
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-warning')]")).click();
		// wait for 3 message to invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl ui-widget']")));
		// wait for click second button to click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']/..")));
		driver.findElement(By.xpath("//span[text()='Click Second']/..")).click();
		
		// Click on last Click button
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-danger')]")).click();
		// Wait for text to be change in the WebElement
		wait.until(ExpectedConditions.textToBe(By.xpath("//button[contains(@class,'ui-button-danger')]/following::button"), "Did you notice?"));
		WebElement changableText = driver.findElement(By.xpath("//button[contains(@class,'ui-button-danger')]/following::button"));
		System.out.println(changableText.getText());
		
		
		// Load url to handle waits in window
		driver.get("https://leafground.com/window.xhtml");
		// Click on the open with delay button
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		// Wait to open to 2windows --> (current window + 2 new open windows) = 3 
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		// Close all the windows & driver instance
		driver.quit();
	}
	
}
