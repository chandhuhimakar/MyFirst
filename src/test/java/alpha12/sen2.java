package alpha12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class sen2 {
	  
	  WebDriver driver;
	  @Test
	  public void testActions() throws Exception {
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");

	  		driver=new ChromeDriver();
	  		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  		Actions a=new Actions(driver);
	  		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[3]"))).click().build().perform();
	  		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"))).click().build().perform();
	  		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"))).click().build().perform();
	  		
  }
}