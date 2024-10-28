package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTest {
	
	
	@Test()
	public void FirstTEst() {
		System.out.println("First test executed");
		//Assert.fail();
		
		
	}
	@Test(dependsOnMethods="FirstTEst")
	public void secondTest() {
		System.out.println("Second Test executed");
	}

}
