package alpha12;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class sheetexcel {
  @Test
  public void f() throws Exception  {
	  XSSFWorkbook aa=new XSSFWorkbook();
	  FileOutputStream fos=new FileOutputStream(new File("Date.xlsx"));
	  XSSFSheet as= aa.createSheet("TestMeApp");
	  System.out.println(as.getSheetName());
	  aa.write(fos);
	  fos.close();
  }
}
