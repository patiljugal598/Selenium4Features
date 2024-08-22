package preparation.selenium4.cdp;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.network.Network;

import com.google.common.collect.ImmutableList;

public class NetworkRequestBlocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devtools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.png","*.jpeg")));
		
		driver.get("https://www.makemytrip.com/");
		
	}

}
