package alpha12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flightapp {
	
 
	@AfterClass
	public void aClass() {
		  System.out.println("to city");
	  }
	
  @BeforeClass
  public void bClass() {
	  System.out.println("from city");
  }
  
  @Test(priority=1)
  public void city() {
	  System.out.println("username");
  }
	  
	  @Test(priority=2)
	  public void city2() {
		  System.out.println("password");
	  }
	  
	  @BeforeMethod
	  public void bMethod() {
		  System.out.println("Valid user name");
	  }
	  
	  @AfterMethod
	  public void aMethod() {
		  System.out.println(" valid username ");
	  }
	  @Test(priority=3)
	  public void login() {
		  System.out.println("click on button");
	  }
	  
	  @Test(priority=4)
	  public void logout() {
		  System.out.println(" error msg ");
	  }
	 
	
	
	
}


