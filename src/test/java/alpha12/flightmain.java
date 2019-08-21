package alpha12;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class flightmain {
	@BeforeSuite
  public void fun1() {
		System.out.println("Application shld open ");
  }
	
	@AfterSuite
	public void fun2() {
		System.out.println("Application close ");
	}
	
	
}
