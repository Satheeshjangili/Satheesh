package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
@Test(invocationCount = 5)
public void c1() {
	Reporter.log("hi",true);	
}

@Test
public void c2() {
	Reporter.log("hello",true);
	System.out.println(sathishhhhhhhh);
}

}

