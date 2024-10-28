package main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.Commonn;

public class MultiSelection extends Commonn {
    
	By Interaction = By.xpath("//a[text()='Interactions ']");
	By Selectable = By.xpath("//a[text()='Selectable ']");
	By serielize =By.xpath("//a[text()='Serialize ']");
	By Clickable =By.xpath("//li[@class='ui-widget-content']");
	
	
	
	
	public MultiSelection CheckMultiselect() {
		driver.findElement(Interaction).click();
		driver.findElement(Selectable).click();
		driver.findElement(serielize).click();
		List<WebElement> Myele=driver.findElements(Clickable);
		
		Actions actions = new Actions(driver);
		
		actions
		.keyDown(Keys.CONTROL)
		.click(Myele.get(8))
		.click(Myele.get(10))
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		return this;
		
	}
}
