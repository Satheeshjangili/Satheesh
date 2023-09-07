package testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class times_out {
@Test(timeOut = 5000)
public void login() {
	Reporter.log("i am login",true);
}
}
