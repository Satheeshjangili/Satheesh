package testng_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependson_method {
@Test
public void login()
{
	Reporter.log("i am login",true);
	

}
@Test(dependsOnMethods = {"login"})
public void logout()
{
	Reporter.log("i am logout",true);
}
}



