package preparation.selenium4.cdp;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.performance.model.Metric;
import org.openqa.selenium.devtools.v125.performance.Performance;

public class PerformanceMetricTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));
		driver.get("https://google.com");
		
		List<Metric> metrics = devtools.send(Performance.getMetrics());
		System.out.println(metrics);
		
		for(Metric metric: metrics) {
			System.out.println(metric.getName()+": "+metric.getValue());
		}
	}

}
