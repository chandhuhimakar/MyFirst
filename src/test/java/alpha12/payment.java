package alpha12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class payment {
	WebDriver driver;
  @Test
  public void f() {
	  
	 	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");

  		driver=new ChromeDriver();
  		driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
  		//driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
  		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]")).click();

  		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
  		
  		driver.findElement(By.name("username")).sendKeys("123456");
  		 driver.findElement(By.name("password")).sendKeys("Pass@456");
  		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
  		 driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
  	
  		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
  	  String ari=driver.findElement(By.xpath("/html/body/b/section/div/div/div/table[1]/tbody/tr/td[5]/span")).getText();
	    String xri="Will be delivered in 2-3 days";
	    Assert.assertEquals(ari,xri);
  		
		//Actions ven=new Actions(driver);
		// driver.findElement(By .name("userName")).sendKeys("Atherya");
		// ven.sendKeys(Keys.TAB).perform();
		// driver.findElement(By .name("password")).sendKeys("123456");
		// ven.sendKeys(Keys.TAB).perform();
		// ven.sendKeys(Keys.TAB).perform();
		/// ven.sendKeys(Keys.TAB).perform();
		// ven.sendKeys(Keys.TAB).perform();
		// ven.sendKeys(Keys.TAB).perform();
		// ven.sendKeys(Keys.ENTER).perform();	
		// driver.findElement(By.name("products")).click();
	//	 driver.findElement(By.name("products")).sendKeys("Headphone");
		// driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		// driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//*[@id="cart"]/tbody/tr/td[1]/div/div/h4
		//    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		//    String z=driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4")).getText();
		//    String x="Headphone";
		 //   Assert.assertEquals(z, x);;
		 //   driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		 //   driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
  		
  		
  }
}
//*[@id="errormsg"]