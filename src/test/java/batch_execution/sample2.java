package batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void tc4() {
		Reporter.log("==hi i am tc4",true);
	}
	@Test
	public void tc5() {
		Reporter.log("==hi i am tc5",true);
	}
	@Test
	public void tc6() {
		Reporter.log("==hi i am tc6",true);
	}
}
