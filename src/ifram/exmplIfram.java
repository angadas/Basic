package ifram;
/*Displaying webpage which is a part of another webpage is known as Iframe. 
 Iframe is created by using Tagname Iframe. 
 How to Handle Iframe using Selenium Webdriver 
To handle Iframe using selenium Webdriver we need to switch selenium focus from 
main webpage to iframe.
Use driver.switchTo().frame() 
We can switch to Iframe using 4 different ways as 
1. id driver.switchTo().frame("iframeResult")
1. name driver.switchTo().frame("iframeResult")
2. index driver.switchTo().frame(0)
3. WebElement :
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[
@id='iframeResult']")));
4. If we want to go back to one frame only then use function switch to 
parent frame. parentFrame();
5. If we want to go directly to main / default page then use switch to default 
content function. defaultContent();
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exmplIfram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		Thread.sleep(1000);
		driver.switchTo().frame(" ");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("")))
//		driver.findElement(By.xpath("//button[@type='button']")).click();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
//		
		
		
	}
}
