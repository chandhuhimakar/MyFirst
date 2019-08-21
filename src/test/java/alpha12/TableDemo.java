package alpha12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


  
  
public class TableDemo {
	WebDriver driver;
  @Test
  public void wTtable() {
	  
	  //path of  the chrome browser
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
	  //init browser
	  driver=new ChromeDriver();
	  //opening of the URL
	  driver.get("http://newtours.demoaut.com/mercurycruise.php?osCsid=4d2f35e6355c6ec71876aaa16981bf8a");
	  //to get the title of the page
	  System.out.println(driver.getTitle());
	  //to maximize the window
	  driver.manage().window().maximize();
	  
	  WebElement ele=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
 
           List<WebElement> trows=ele.findElements(By .tagName("tr"));
        
           for(WebElement row: trows) {
        	   
        	  List<WebElement> tcols= row.findElements(By .tagName("td"));
        	  
        	 for(int c=0;c<=tcols.size()-1;c++) {
        		 String tdata=tcols.get(c).getText();
        		 if(tdata.equals("Inside Passage")) {
        			 System.out.println(tcols.get(0).getText());
        		 }
        	 }
        	   
        	   
        	   
        	   
        	   
        	   
        	   
           }
           
  }
}
