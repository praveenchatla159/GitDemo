package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {
	
	File file;
	
	FileInputStream fip;
	
	public void readExcelData() throws IOException {
		
		file=new File("C:\\Users\\Lenovo\\Desktop\\hello.xlsx");

		fip=new FileInputStream(file);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fip);
		
		fip.close();
		
		wb.close();


		XSSFSheet sheet=wb.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		sheet.getRow(0).createCell(2).setCellValue("2");
		
		FileOutputStream fop=new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\hello.xlsx"));
		
		wb.write(fop);

		fop.close();

	
	
	
		

	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		ReadExceldata readExcel=new ReadExceldata();
		readExcel.readExcelData();
		
	}

}
