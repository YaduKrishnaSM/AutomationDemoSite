package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTables {

	
		@Test
		public void launch()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			
			List<WebElement> hieghts =driver.findElements(By.xpath("//tbody[@style='margin:0;padding:0']/tr/td[3]"));
			int hieghts1=0;
			for(WebElement hieght:hieghts) {
				String Shght=hieght.getText();
				String replaced =Shght.replace("m", "");
				int N=Integer.parseInt(replaced);
				if(N>hieghts1) {
					hieghts1=N;
				}
				
	
			}
			String Shieghts=String.valueOf(hieghts1);
			Shieghts=Shieghts+"m";
			String result=driver.findElement(By.xpath("//span[text()='"+Shieghts+"']/ancestor::tr/th")).getText();
			System.out.println(result);
	}

}
