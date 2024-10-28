package testCases;

import org.testng.annotations.Test;

import main.Frames;

public class FrameTest  extends Frames {
	
	@Test
	public void TestFrames() {
		new Frames()
		.CheckSingleFrame()
		.CheckNestedFrames();
	}

}
