package testCases;

import org.testng.annotations.Test;

import main.Windows;

public class WindowsTest extends Windows {
	
	
	@Test
	public void checkwindow()
	{
		new Windows()
		.windowHan()
		.windowshand()
		.TwoSepWindows()
		.multiplewindows();
	}
}
