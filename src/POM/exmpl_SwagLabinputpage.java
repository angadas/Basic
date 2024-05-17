package POM;



import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.Weak;

public class exmpl_SwagLabinputpage {
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN; 
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD; 
	@FindBy(xpath = "//input[@type='submit']") private WebElement login; 
	
public exmpl_SwagLabinputpage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUN()
{
	UN.sendKeys("standard_user");
}
public void enterPWD() 
{
	PWD.sendKeys("secret_sauce");
	}
public void clickOnLoginBtn() 
{
	login.click();
}
	
 public static void main(String[] args) throws FileNotFoundException {
	 
	 FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\daily Reading  Notes\\abc\\angad.xlsx");
	WorkbookFactory.create(file).getSheet(DDF);
	 WebDriver driver=new ChromeDriver();
	
	
}
}
