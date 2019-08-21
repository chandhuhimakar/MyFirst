package alpha12;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class browtabex {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  System.out.println("1."+driver.getTitle());
		driver.findElement(By .linkText("Gmail")).click();
		System.out.println("1."+driver.getTitle());
		  driver.findElement(By .linkText("Terms")).click();
		  System.out.println("3."+driver.getTitle());
		  Set<String> hand=driver.getWindowHandles();
		  System.out.println(hand.size());
		      Iterator<String> ita=  hand.iterator();
		       String str= ita.next().toString();
		       System.out.println(str);
		       String str1= ita.next().toString();
			      System.out.println(str1);
			      
			      driver.switchTo().window(str1);
			      
		  driver.findElement(By .linkText("view archived versions")).click();
		  System.out.println("4."+driver.getTitle());
  }
}
