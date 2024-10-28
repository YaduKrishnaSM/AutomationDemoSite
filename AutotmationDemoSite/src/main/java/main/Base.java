package main;

import org.openqa.selenium.By;

import common.Commonn;

public class Base extends Commonn {
	
	By Nav =By.id("enterimg");

	public Base clickNav() {
		// TODO Auto-generated method stub
		driver.findElement(Nav).click();
		return this;
		
	}
	



}
