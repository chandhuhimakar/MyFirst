package alpha12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readwit8 {
  @Test
  public void f() throws Exception {
	  FileInputStream fos= new FileInputStream( new File("C:\\Users\\training_h2a.06.15\\Downloads\\veena.xlsx"));
	  XSSFWorkbook xw=new XSSFWorkbook();
	  XSSFSheet xs= xw.createSheet("Sheet1");
	  int rowcnt=xs.getLastRowNum();
	  String username=xs.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(username);
	  xs.getRow(0).createCell(2).setCellValue("Status");	  
	  xs.getRow(1).createCell(2).setCellValue("Pass");
	  FileOutputStream fos1= new FileOutputStream( new File("C:\\Users\\training_h2a.06.15\\Downloads\\veena.xlsxx"));
	  xw.write(fos1);
	  fos1.close();
  }
}
