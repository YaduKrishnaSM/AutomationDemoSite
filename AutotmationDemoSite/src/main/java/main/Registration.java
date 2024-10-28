package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.Commonn;

public class Registration extends Commonn{
	
	By RegTab = By.xpath("//a[text()='Register']");
	By Firstname =By.xpath("//input[@placeholder='First Name']");
	By LastName =By.xpath("//input[@placeholder='Last Name']");
	By Address=By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
	By Email =By.xpath("//input[@type='email']");
	By Phone =By.xpath("//input[@type='tel']");
	By Lanuguages =By.id("msdd");
	
	
	public Registration ClickRegistrationTab(){
		ClickEle(RegTab);
		return this;		
	}
	public Registration EnterFirstName(String firstname){
		SendKeys(Firstname, firstname);
		return this;		
	}
	public Registration EnterLastName(String lastname) {
		SendKeys(LastName, lastname);
		return this;
	}
	public Registration EnterAddress(String address) {
		SendKeys(Address, address);
		return this;		
	}
	public Registration EnterEmailID(String email) {
		SendKeys(Email, email);
		return this;
	}
	public Registration EnterPhoneNo(String PhoneNo) {
		SendKeys(Phone, PhoneNo);
		return this;
	}
	public Registration SelectRadiobutton(String Sex) {
		By radioBtn=By.xpath("//input[@name='radiooptions' and @value='"+Sex+"']");
		ClickEle(radioBtn);
		return this;
		
	}
	public Registration SelectHobbies(String Hobby) {
		By Hobbies=By.xpath("//label[text()=' "+Hobby+" ']/../input");
		ClickEle(Hobbies);
		return this;
		
	}
	public Registration Selectlanguages(String Text) {
		ClickEle(Lanuguages);
		By La =By.xpath(("//a[text()='"+Text+"']"));
		ClickEle(La);
//		Select select =new Select(driver.findElement(By.id("msdd")));
//		if(select.isMultiple()) {
//			select.selectByVisibleText("Arabic");
//			select.selectByVisibleText("English");
//			select.selectByVisibleText("Hindi");
//		}
		return this;
		
	}
	public Registration SelectSkills() {
		Select select =new Select(driver.findElement(By.id("Skills")));
        select.selectByVisibleText("Adobe Photoshop");
		return this;
	}
	
}
