package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class exmple_dependsonMethod1 {
	@Test
	public void login() {
		Reporter.log("runnning login TC--,true");
	}
	@Test(dependsOnMethods= {"login"})
	public void logout() {
		Reporter.log("runnning logout TC--,true");
	}
	
	
	
}
