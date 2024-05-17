package testNG;



import org.testng.Assert;
import org.testng.annotations.Test;




public class example_hardAssert {
	@Test
	public void Verifyname() {
		String num="ABC";
		String num2="ABC";
		Assert.assertEquals(num, num2,"Failed: both results are diff:- ");

	}
}
