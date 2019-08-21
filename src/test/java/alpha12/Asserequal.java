package alpha12;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Asserequal {
  public void f() {
	  int actual = 20 ;
	  int execpted = 20;
	  Assert.assertEquals(actual , execpted);
  }
  public void f2() {
	  String actual = "hima" ;
	 String execpted = "Hima";
	  Assert.assertEquals(actual , execpted);
  
  } 
}
