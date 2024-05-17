package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabHomePage {
		

	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement menu;
		WebDriver driver;
		

		public SwagLabHomePage(WebDriver driver) {
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		}
		
		
		public void verifyTitle() 
		{
		String actTitle = driver.getTitle();
		String expTitle="Swag Labs";
		if (actTitle.equals(expTitle)) 
		{
		System.out.println("Pass");
		}
		else
		{
		System.out.println("fail");
		}
		}
		
		
		public void clickOnMenuBtn() 
		{
		menu.click();
		}


		public void SwagLabHomePageYourcartProductName(String stringCellValue) {
			// TODO Auto-generated method stub
			
		}


		public void ClickOnProduct() {
			// TODO Auto-generated method stub
			
		}
}