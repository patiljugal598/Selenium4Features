package preparation.selenium4.cdp;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.network.Network;
import org.openqa.selenium.devtools.v125.network.model.ConnectionType;

public class TestNetworkSpeed {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.send(Network.emulateNetworkConditions(false, 100, 20000, 10000, Optional.of(ConnectionType.CELLULAR4G)
				,Optional.empty(),Optional.empty(),Optional.empty()));
		
		driver.get("https://www.google.com/");
		
	}

}
