package alpha12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert02 {
  @Test
  public void falsemethod() {
	  Assert.assertFalse(20>18);  
  }
  
  @Test
  public void testMethod2() {
	  Assert.assertFalse("hello".equals("Hi"));
  }
}
