package preparation.selenium4.cdp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.emulation.Emulation;

public class TimeZoneOverride {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.whatismytimezone.com/");
		Thread.sleep(3000);
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Emulation.setTimezoneOverride("EST"));
		
		driver.get("https://www.whatismytimezone.com/");

	}

}
