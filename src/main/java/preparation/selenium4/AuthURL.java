package preparation.selenium4;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthURL {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
//	
//		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
//	
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		// reverse word and its chars
		String s = "Java coding questions";
		String a[] = s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			for(int j=word.length()-1;j>=0;j--) {
				System.out.print(word.charAt(j));
			}
			if(i>a.length)
			System.out.print(" ");
				
		}
		
		System.out.println();
		int x = 1;
		System.out.println(x++);
		System.out.println(x);
		int y= 1;
		System.out.println(++y);
		int p= 1;
		System.out.println(p--);
		int q= 1;
		System.out.println(--q);

		 String text = "This  is   a    test";
	        
	        // Split the string on one or more whitespace characters
	        String[] words = text.split("\\s");
	        System.out.println("words-->"+words.length);
	        // Print the results
	        for (String word : words) {
	            System.out.println(word);
	        }
		
		
		
		
				}

}
