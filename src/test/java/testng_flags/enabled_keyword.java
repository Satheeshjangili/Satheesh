package testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_keyword {
@Test(enabled = false)
public void login() {
	Reporter.log("i am login",true);
}
@Test
public void logout() {
	Reporter.log("i am logout",true);
	
}
}
