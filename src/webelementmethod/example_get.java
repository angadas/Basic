package webelementmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_get {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		
	String title=driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		
		//driver.close();
		driver.quit();		

	}
}
//Webdriver:
//It is an interface use to perform action of browser.
//1. get- to enter url in browser or to open an application.
//2. close: to close the current tab of the browser.
//3. quit: to close the all the tabs present in browser
//4. getTitle: this method is use to get title of a webpage. return type of 
//getTitle method is String
//5. getCurrentURL: this method is use to get URL of a webpage. return type 
//of getCurrentURL method is String
//6. maximize - use to maximize the browser
// 
//7. minimize - use to minimize the browser
//8. navigate: this method is use to open an application, move forward, 
//backward & refresh the webpage