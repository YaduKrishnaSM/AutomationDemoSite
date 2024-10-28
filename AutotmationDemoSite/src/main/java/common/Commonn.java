package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Commonn {

	public static WebDriver driver;
	
	public static void launch()
{
	    driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		}
	public void  ClickEle(By element) {
		driver.findElement(element).click();
		
	}
	public void SendKeys(By element,String Text) {
		driver.findElement(element).sendKeys(Text);
	}
	public void selectE(WebElement Any,String Text) {
		Select select =new Select((org.openqa.selenium.WebElement) Any);
		select.selectByVisibleText(Text);
	}

}
