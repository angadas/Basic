package testNG_Suite;

import org.testng.Assert; 
import org.testng.annotations.Test; 
public class B_AssertNotEquals { 
@Test
public void AssertNotEquals() 
 { 
 String actResult = "Vaibhavi"; 
 String expResult = "Vaibhav"; 
 Assert.assertNotEquals(actResult, expResult, "Failed: Results are Equal"); 
 } 

}