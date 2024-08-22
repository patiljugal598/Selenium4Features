package preparation.selenium4.chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableInfoBar {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		//disable-infobars not working, please check EnableAutomationExample class
		options.addArguments("disable-infobars","incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.dev");
	}

}
