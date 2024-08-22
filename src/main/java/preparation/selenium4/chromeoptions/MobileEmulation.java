package preparation.selenium4.chromeoptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileEmulation {

	public static void main(String[] args) {

		
		  Map<String, Object> map = new HashMap<>();
		  map.put("deviceName", "Nexus 5"); 
		  ChromeOptions options = new ChromeOptions();
		  options.setExperimentalOption("mobileEmulation", map);
		  
		  WebDriver driver = new ChromeDriver(options);
		  driver.get("https://www.selenium.dev/");
		 

	}

}
