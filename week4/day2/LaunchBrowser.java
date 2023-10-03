package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//launch Chrome browser
    ChromeDriver driver=new ChromeDriver();
    //Load application url
    driver.get("https://www.facebook.com/");
	//maximize the browser
    driver.manage().window().maximize();
}
}
