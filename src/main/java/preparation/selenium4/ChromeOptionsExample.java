package preparation.selenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://selenium.dev");
		System.out.println(driver.getTitle());
	}

}
