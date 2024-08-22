package preparation.selenium4.cdp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.emulation.Emulation;

public class DeviceEmulation {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
//		devtools.send(Emulation.setDeviceMetricsOverride(375, 812, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		Map<String, Object> deviceMetrics = new HashMap<String, Object>(); 			 

				deviceMetrics.put("width", 375);
				deviceMetrics.put("height", 812);
				deviceMetrics.put("mobile", true);
				deviceMetrics.put("deviceScaleFactor", 50);

 
				driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

}
