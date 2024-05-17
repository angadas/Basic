package parameterazation;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.NetworkBuilder;

public class parameterrization {
	
	public static void main(String[] args) throws  IOException {
			//excel sheet access
			FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\daily Reading  Notes\\Example[2].xlsx");
			//fech data for xsle sheet
	
	
			Sheet sh1 = WorkbookFactory.create(file).getSheet("DDF");
			
			 int lastCellIndex = sh1.getRow(0).getLastCellNum()-1;
			 
			 for(int i=0; i<=lastCellIndex; i++)
			 {
			 Cell cellInfo = sh1.getRow(0).getCell(i);
			 CellType s1 = cellInfo.getCellType();
			 
			 if (s1==CellType.STRING)
			 {
			 System.out.print(cellInfo.getStringCellValue()+" ");
			 } 
			 else if(s1==CellType.NUMERIC)
			 {
			 System.out.print(cellInfo.getNumericCellValue()+" ");
			 }
			 else if(s1==CellType.BOOLEAN)
			 {
			 System.out.print(cellInfo.getBooleanCellValue()+" ");
			 }

	}
}
}