package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	
	
	@Test(dataProvider="logindata")
	public void checkLogin(String username,String password) {
		System.out.println(username);
		System.out.println(password);	
	}
	@DataProvider(name="logindata")
	public Object[][] logindata(){
		 return new Object[][]  {
	            {"user1", "pass1"},
	            {"user2", "pass2"},
	            {"user3", "pass3"}
	        };
				
	}

		

	

}
