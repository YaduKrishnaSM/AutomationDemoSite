package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.Base;

public class BaseClass extends Base {
    @BeforeTest
    public void Initialize()
    {
    	Base.launch();
	}
	@Test()
	public void Navi() {
		new Base()
		.clickNav();
	}
}
