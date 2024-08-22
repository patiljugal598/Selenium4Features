package preparation.selenium4;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com/");
		
		Set<String> handles = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(handles);
		
		System.out.println(driver.switchTo().window(list.get(0)).getTitle());
		System.out.println(driver.switchTo().window(list.get(1)).getTitle());
		System.out.println(driver.switchTo().window(list.get(2)).getTitle());
		
		
	}

}
