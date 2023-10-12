package ExcelSheet;
import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 

public class ReadDataFromExcelSheet 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String CUSTNAME = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String CUSTDESC = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

 

		System.out.println(CUSTNAME);
		System.out.println(CUSTDESC);
	}
}


		