package main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.Commonn;
import org.testng.Assert;

public class Frames extends Commonn {
	
	Alerts Alrts = new Alerts();
	By Frms =By.xpath("//a[text()='Frames']");
	By SingleFrameTxt =By.xpath("//input[@type='text']");
	By Nested =By.xpath("//a[text()='Iframe with in an Iframe']");
	By NestedText =By.xpath("//input[@type='text']");
	
	
	public Frames CheckSingleFrame() {
		driver.findElement(Alrts.switchTo).click();
		driver.findElement(Frms).click();
		driver.switchTo().frame("singleframe");
		driver.findElement(SingleFrameTxt).sendKeys("Complete");
		driver.switchTo().defaultContent();
		return this;
		
	}
	public Frames CheckNestedFrames(){
		driver.findElement(Nested).click();
		driver.switchTo().frame("ff4132e120d16626f1720b7cb89458a2");
       // driver.switchTo().frame("//iframe[@cd_frame_id_='ff4132e120d16626f1720b7cb89458a2']");
        WebElement text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
        String Actual =text.getText();
        String Expected ="Nested iFrames";
        Assert.assertEquals(Actual, Expected);
		return this;
		}
		
    }


//		for(int i=0 ; i<allFrames.size();i++) {
//			driver.switchTo().frame(i);
//			
//			try {
//				WebElement target =driver.findElement(NestedText);
//				System.out.println("Target element found in frame with index: " + i);
//				target.sendKeys("sdfadfsf");
//                driver.switchTo().defaultContent();
//				break;
//			}catch (Exception e) {
//                System.out.println("Element not found in frame index: " + i);
//                driver.switchTo().defaultContent();
//            }
//		      try {
//		            Thread.sleep(1000);  // Short delay to allow the frame to load (optional)
//		        } catch (InterruptedException e) {
//		            e.printStackTrace();
//		        }
//		    		}

