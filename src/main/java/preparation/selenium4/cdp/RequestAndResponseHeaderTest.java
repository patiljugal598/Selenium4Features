package preparation.selenium4.cdp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.network.Network;
import org.openqa.selenium.devtools.v125.network.model.Headers;

public class RequestAndResponseHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		
		devtools.addListener(Network.requestWillBeSent(), request->{
			Headers headers = request.getRequest().getHeaders();
			if(!headers.isEmpty()) {
				System.out.println("Request Headers:: ");
				headers.forEach((key,value)->{
					System.out.println(" "+key+" = "+value);
				});
			}
		});
		
		devtools.addListener(Network.responseReceived(), response->{
			Headers headers = response.getResponse().getHeaders();
			if(!headers.isEmpty()) {
				System.out.println("Response Headers:: ");
				headers.forEach((key,value)->{
					System.out.println(" "+key+" = "+value);
				});
			}
			System.out.println("Response URI:: "+response.getResponse().getUrl()+" Status COde:: "+response.getResponse().getStatus());
		});
		
		Map<String,Object> header = new HashMap<String, Object>();
		header.put("CustomHeader", "CustomValue");
		Headers headers = new Headers(header);
		devtools.send(Network.setExtraHTTPHeaders(headers));
		driver.get("https://reqres.in/api/users/2");

	}

}
