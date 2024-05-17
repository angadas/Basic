package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example_Timeout {
		

	@Test(timeOut=2000)
	public void TC1() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("TC1 Passed",true);
		
	}
	@Test()
	public void TC2() {
		Reporter.log("TC2 Passed",true);
		
	}
	@Test
	public void TC3() {
		Reporter.log("TC3 Passed",true);
		
	}
	@Test
	public void TC4() {
		Reporter.log("TC4 Passed",true);
		
	}
}


