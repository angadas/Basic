package parameterazation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exm2 {
	public static void main(String[] args) throws  IOException {
		//excel sheet access
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\daily Reading  Notes\\Example[2].xlsx");
		//fech data for xsle sheet
		
		
		

		Sheet sh11 = WorkbookFactory.create(file).getSheet("DDF");
		//last row index get
		 int lastCellIndex = sh11.getRow(1).getLastCellNum()-1;
		 
		 
		 for(int i=0; i<=lastCellIndex; i++)
		 {
		 Cell cellInfo = sh11.getRow(0).getCell(i);
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