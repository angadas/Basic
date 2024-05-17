package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class exmple_Innvocation {
	@Test(dependsOnMethods = "ard")
	public void abc()  {
		Reporter.log("TC1 Passed",true);
		
		
	}
	@Test(enabled = false)
	public void xyz() {
		Reporter.log("TC2 Passed",true);
		
	}
	@Test
	public void ard() {
		Reporter.log("TC3 Passed",true);
		
	}
	@Test(dependsOnMethods =  "xyz")
	public void acc() {
		Reporter.log("TC4 Passed",true);
		
	}
}
