package testNG;

import javax.security.auth.login.FailedLoginException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.netty.util.concurrent.FailedFuture;

public class example_SoftAssert {
	@Test
	public void TC1() {
		SoftAssert soft=new SoftAssert();
		 String actResult="abc";
		 String expResult="xyz";
		 soft.assertEquals(actResult, expResult,"Failed: both results are diff:-");
	}
//	 @Test
//	 public void TC() 
//	 {
//	 String actResult="xyz";
//	 String expResult="abc";
//	
//	 if (actResult.equals(expResult)) 
//	 {
//	 System.out.println("Pass");
//	 }
//	 else
//	 {
//	 System.out.println("fail");
//	 }
//	 }
//	
//
//		
//		
//	}
}
