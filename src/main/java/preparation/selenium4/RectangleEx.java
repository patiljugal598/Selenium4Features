package preparation.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RectangleEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		
		Rectangle rect = element.getRect();
		System.out.println("Height:: "+rect.getHeight());
		System.out.println("Width:: "+rect.getWidth());
		System.out.println("X:: "+rect.getX());
		System.out.println("Y:: "+rect.getY());
		
		Actions action = new Actions(driver);
		action.moveByOffset(element.getRect().getX(), element.getRect().getY());
		
		//driver.quit();
	}

}
