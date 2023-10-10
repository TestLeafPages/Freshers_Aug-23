package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung implements Mobile{

	

	public void switchOffMobile() {
		System.out.println("Switch Off Mobile");
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Make call");
	}

	public void shareDocument() {
		System.out.println("Share Document");
	}

	public void switchOnMobile() {
		System.out.println("Switch Off Mobile");
	}
	public void takePhoto() {
		
	}
	public static void main(String[] args) {
//		ChromeDriver driver=new ChromeDriver();
//		List<WebElement> findElement = driver.findElements(By.xpath(""));
//		 Set<String> windowHandles = driver.getWindowHandles();
		Samsung mob=new Samsung();
//		NoSuchElementException
//       List<String> obj=new ArrayList<>();
		             // we can not create object for an interface
		//Mobile obj=new Mobile();
	}

	@Override
	public void faceAuthendication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voiceRecognization() {
		// TODO Auto-generated method stub
		
	}
}
