package preparation.selenium4.cdp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.security.Security;

public class TestBadSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		devTools.send(Security.enable());
		devTools.send(Security.setIgnoreCertificateErrors(true));
		
		driver.get("https://expired.badssl.com/");
	}

}
