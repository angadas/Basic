package screenshot;
import java.io.File; 
import java.io.IOException; 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.io.FileHandler; 


public class capatureScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		File ddr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\HP\\Desktop\\daily Reading  Notes\\abc.jpg");
		FileHandler.copy(ddr, dest);
	}
}
