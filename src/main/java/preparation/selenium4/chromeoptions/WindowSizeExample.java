package preparation.selenium4.chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSizeExample {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,1000");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.dev");
	}

}
