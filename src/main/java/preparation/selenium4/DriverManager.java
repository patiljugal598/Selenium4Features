package preparation.selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().driverVersion("127.0.6533.99").setup();
		WebDriver driver = new ChromeDriver();
	}

}
