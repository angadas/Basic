package testNG_Suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_SuitClass1 {
	 @Test
	public void TC1() {
		Reporter.log("running TC1....",true);
	}
	 @Test(priority = 1)
	 public void TC2() {
			Reporter.log("running TC2....",true);
		}
	 @Test(priority = 2)
	 public void TC3() {
			Reporter.log("running TC3....",true);
		}
	 @Test(priority = 3)
	 public void TC4() {
			Reporter.log("running TC4....",true);
		}
	 
}
