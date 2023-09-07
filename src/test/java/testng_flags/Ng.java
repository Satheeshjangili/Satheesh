package testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ng {
	@Test
	public void j() {
	Reporter.log("case1",true);
	}
	@Test
	public void j1() {
	Reporter.log("case2",true);
}
	@Test
	public void j2() {
	Reporter.log("case3",true);
	}
}