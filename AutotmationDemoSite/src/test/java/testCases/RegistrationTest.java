package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.ExcelReadd;
import main.Registration;

public class RegistrationTest extends Registration{

	
	@Test(dataProvider="Userdata")
	public void VerifyRegistration(String firstname,String Lastname,String address,String email,String phoneNo,String Sex,String Hobbies,String lanuguage) {
		new Registration()
		.ClickRegistrationTab()
		.EnterFirstName(firstname)
		.EnterLastName(Lastname)
		.EnterAddress(address)
		.EnterEmailID(email)
		.EnterPhoneNo(phoneNo)
		.SelectRadiobutton(Sex)
		.SelectHobbies(Hobbies)
		.Selectlanguages(lanuguage)
		.SelectSkills();
	}
	@DataProvider(name="Userdata")
	public Object[][]Userdata() throws IOException{
		return ExcelReadd.getData("Regdata");
		
	}
}
