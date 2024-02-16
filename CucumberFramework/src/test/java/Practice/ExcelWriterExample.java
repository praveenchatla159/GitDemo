
package Practice;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class ExcelWriterExample {


	Workbook workbook;	



	public void excelWriter() throws IOException {

		workbook=new XSSFWorkbook();

		Sheet sheet=workbook.createSheet("Sheet5");


		Object[][] data= {
				{"Name", "Age", "City"},
				{"John", 30, "New York"},{"Ramu", 40, "Aus York"},{"Somu", 31, " York"}

		};

		int rowcount=0;

		for (Object[] rowData:data)
		{
			Row row=sheet.createRow(rowcount++);


			int columnCount=0;
			for (Object field :rowData)
			{
				Cell cell=row.createCell(columnCount++);

				if (field instanceof String)
				{
					cell.setCellValue((String) field);
				}

				else if (field instanceof Integer) {

					cell.setCellValue((Integer)field);
				}
			}

		}

		try {

			FileOutputStream fop=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\name.xlsx");
			workbook.write(fop);

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		finally {
			
			try {
				
				workbook.close();
				
			} catch (Exception e2) {
			e2.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		ExcelWriterExample excelWriter=new ExcelWriterExample();

		excelWriter.excelWriter();


	}
}