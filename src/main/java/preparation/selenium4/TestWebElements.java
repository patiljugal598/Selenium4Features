package preparation.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
		
		System.out.println(driver.findElement(By.xpath("//body")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("//body")).getText());

	}

}
