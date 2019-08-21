package alpha12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asssame {
  @Test
  public void f() {
	  Object obj1 = new Object();
	  Object obj2 = obj1;
	  Assert.assertSame(obj1, obj2);
  }
  
  @Test
  public void f2() {
	  Object obj1 = new Object();
	  Object obj2 = new Object();
	  Assert.assertSame(obj1, obj2);
  }
  
}
