package main;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import common.Commonn;

public class DragAndDrop extends Commonn {
	By Interaction = By.xpath("//a[text()='Interactions ']");
	By DragAnD =By.xpath("//a[text()='Drag and Drop ']");
	By staticT =By.xpath("//a[text()='Static ']");
	By Dynamic =By.xpath("//a[text()='Dynamic ']");
	
	
	public DragAndDrop Staticdrag() {
		driver.findElement(Interaction).click();
		driver.findElement(DragAnD).click();
		driver.findElement(staticT).click();
		WebElement dragabble =driver.findElement(By.id("angular"));
		WebElement droppable =driver.findElement(By.id("droparea"));
		Actions action= new Actions(driver);
		action.dragAndDrop(dragabble, droppable).build().perform();
		return this;
		
	}
	public DragAndDrop Dynamicdrag()
	{
		driver.findElement(Interaction).click();
		driver.findElement(DragAnD).click();
		driver.findElement(Dynamic).click();
		return this;
		
	}
}
