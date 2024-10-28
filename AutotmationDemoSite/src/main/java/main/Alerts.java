package main;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import common.Commonn;

public class Alerts extends Commonn {
	
	By Nav =By.id("enterimg");
	By switchTo =By.xpath("//a[text()='SwitchTo']");
	By Alerts =By.xpath("//a[text()='Alerts']");
	By AlertClickbox= By.xpath("//button[@class='btn btn-danger']");
	By AlertOkCancel =By.xpath("//a[text()='Alert with OK & Cancel ']");
	By AlertCancelBtn =By.xpath("//button[text()='click the button to display a confirm box ']");
	By AlertText =By.xpath("//a[text()='Alert with Textbox ']");
	By AlerstTextBtn=By.xpath("//button[text()='click the button to demonstrate the prompt box ']");
	
	
	
	public  Alerts CheckStart() {
		driver.findElement(Nav).click();
		driver.findElement(switchTo).click();
		return this;	
	}
	public Alerts Alertcheck() {
		driver.findElement(Alerts).click();
		driver.findElement(AlertClickbox).click();
		driver.switchTo().alert().accept();
		
		return this;
	}
	public Alerts AlertOkCancel() {
		driver.findElement(AlertOkCancel).click();
		driver.findElement(AlertCancelBtn).click();
		driver.switchTo().alert().dismiss();
		return this;
	}
	public Alerts AlertWithText() {
		driver.findElement(AlertText).click();
		driver.findElement(AlerstTextBtn).click();
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("OK");
		alert.accept();
		return this;
		
	}

}
