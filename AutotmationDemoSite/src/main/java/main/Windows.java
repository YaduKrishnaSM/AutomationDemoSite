package main;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import common.Commonn;

public class Windows extends Commonn {
	
	Alerts Alrts =new Alerts();
	By Win =By.xpath("//a[text()='Windows']");
	By WinBtn =By.xpath("//button[text()='    click   ']");
	By newSep =By.xpath("//a[text()='Open New Seperate Windows']");
	By clickSepW =By.xpath("//button[text()='click']");
	By MultiWind = By.xpath("//a[text()='Open Seperate Multiple Windows']");
	By MultiBtn =By.xpath("//button[text()='click ']");
	By SeleniumHQ =By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase fw-bold']");
	By indexpage   =By.id("email");
	
	public Windows windowHan() {
		driver.findElement(Alrts.switchTo).click();
		driver.findElement(Win).click();
		return this;
	}
	public Windows windowshand() {
		driver.findElement(WinBtn).click();
		String mywinodw =driver.getWindowHandle();
		Set<String> Allwindows=driver.getWindowHandles();
		System.out.println(Allwindows);
		for (String crntwindow : Allwindows ) {
			if(!crntwindow.equals(mywinodw)) {
				driver.switchTo().window(crntwindow);
				String title=driver.getTitle();
				System.out.println(title);
				break;				
			}
		}
		driver.close();
		driver.switchTo().window(mywinodw);
		System.out.println(driver.getTitle());
		return this;		
	}
	public Windows TwoSepWindows() {
		driver.findElement(newSep).click();
		driver.findElement(clickSepW).click();
		String mywin= driver.getWindowHandle();
		Set<String> Allwindows =driver.getWindowHandles();
		System.out.println(Allwindows);
		for(String crntWin:Allwindows) {
			if(!crntWin.equals(mywin)) {
				driver.switchTo().window(crntWin);
				System.out.println("new window :"+driver.getTitle());
				break;
			}
		}
		driver.close();
		driver.switchTo().window(mywin);
		return this;
	} 
	public Windows multiplewindows() {
		driver.findElement(MultiWind).click();
		driver.findElement(MultiBtn).click();
		
		String MyWin=driver.getWindowHandle();
		Set<String> AllWind=driver.getWindowHandles();
		Iterator<String> Iterate=AllWind.iterator();
		
		while(Iterate.hasNext()) {
			String CrntWin=Iterate.next();
			    if(!CrntWin.equals(MyWin)) {
				 driver.switchTo().window(CrntWin);
				
				String Wintitle=driver.getTitle();
				if(Wintitle.contains("Selenium")){
					driver.findElement(SeleniumHQ).click();
				}else if(Wintitle.contains("Index")) {
					driver.findElement(indexpage).sendKeys("Completed testing ");
					
				}
			}
		}
		return this;
		
	}
}
