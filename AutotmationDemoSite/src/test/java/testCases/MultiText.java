package testCases;

import org.testng.annotations.Test;

import main.MultiSelection;

public class MultiText extends MultiSelection{
	
	@Test
	public void multitest() {
		new MultiSelection()
		.CheckMultiselect();
	}

}
