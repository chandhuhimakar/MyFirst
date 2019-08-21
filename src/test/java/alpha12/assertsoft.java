package alpha12;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertsoft {
  @Test
  public void f() {
	  
	  SoftAssert so = new SoftAssert();
	  System.out.println( "Check for vali***");
	  so.assertEquals(10,11);
	  
	  System.out.println( "Check for vali***");
	  so.assertEquals("Hello","Hima");
	  
	  so.assertAll();
	  
	  
  }
}
