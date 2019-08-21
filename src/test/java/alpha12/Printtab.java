package alpha12;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Printtab {
	WebDriver driver;
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.newtours.demoaut.com/mercurycruise.php?osCsid=051d55e5de1a586aaf2566aafaedab63");
		  driver.manage().window().maximize();
		  WebElement e=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
		  List<WebElement> rows=e.findElements(By .tagName("tr"));
		  System.out.println(rows.size());
		  for(int i=3;i<rows.size();i++)
		  {
			 //System.out.println(rows.get(i).getText());
			 List<WebElement> c=rows.get(i).findElements(By .tagName("td"));
			//System.out.println(c.size());
			for(int j=0;j<c.size();j++)
			{
			   String s1=c.get(1).getText();
			   //System.out.println(s1);
			   if(s1.equals("Inside Passage"))
			   {
				   System.out.println(c.get(0).getText());
			   }
			   break;
			 
			
		  }
	  }
}
}
