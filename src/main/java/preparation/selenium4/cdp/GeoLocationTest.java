package preparation.selenium4.cdp;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.emulation.Emulation;

public class GeoLocationTest {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Emulation.setGeolocationOverride(Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100)));
		
		driver.get("https://www.currentlocation.in/");
	}

}
