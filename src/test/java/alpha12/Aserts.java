package alpha12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Aserts {
  @Test
  public void testMethod() {
	  Assert.assertTrue(20>18);
  }
  @Test
  public void testMethod2() {
	  Assert.assertTrue("Hello".equals("Hi"));
  }
  
}
