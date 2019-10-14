package learnSelenium;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class ExcelDemo {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		File mydata=new File("D:\\Seleniumlp10software\\jxl\\myexceldata.xls");
		WritableWorkbook wb=Workbook.createWorkbook(mydata);
		wb.createSheet("LoginCredentials", 0);
		
		WritableSheet ws=wb.getSheet(0);
		Label data1=new Label(0,0,"rekhabr1@gmail.com");
		ws.addCell(data1);
		
		Label data2=new Label(1,0,"rekhab");
		ws.addCell(data2);
		
		wb.write();
		wb.close();
		
		
		
		Workbook workbook=Workbook.getWorkbook(new File("D:\\Seleniumlp10software\\jxl\\myexceldata.xls"));
		Sheet sheet=null;//sheets are empty
		int noOfSheets=workbook.getNumberOfSheets();//fetch no of sheets
		Cell cell2=null;

		for(int p=0;p<noOfSheets;p++){  //to get values from sheet (firstsheet1and then sheet 2)
			sheet=workbook.getSheet(p); //to get number of sheet
			int noOfRows=sheet.getRows();//to get rows
			int noOfColumns=sheet.getColumns(); //to get no. of columns
			System.out.println(sheet.getRows() + "\t" + sheet.getColumns());
			System.out.println("data from Sheet" +p);
			for(int i=0;i<noOfRows;i++)
				for(int j=0;j<noOfColumns;j++){
					cell2=sheet.getCell(j,i); //to get cell
					if(cell2.getContents().length()>0)//if data is there print else no
						System.out.println(cell2.getContents());
				}
		}
		workbook.close();
	}
	

	}


