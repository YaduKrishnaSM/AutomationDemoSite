package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.Alerts;

public class AlertsTest extends Alerts {
  @BeforeTest
  public void initialize() {
	  Alerts.launch();
  }
  
	
	
	@Test
	public void checkMain() {
		new Alerts()
		
		.CheckStart()
		.Alertcheck()
		.AlertOkCancel()
		.AlertWithText();
	}
}
