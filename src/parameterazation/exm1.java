package parameterazation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exm1 {
	public static void main(String[] args) throws  IOException {
		//excel sheet access
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\daily Reading  Notes\\Example[2].xlsx");
		//fech data for xsle sheet
		Sheet ddsheet = WorkbookFactory.create(file).getSheet("DDF");
		
		//to fech data from row or cell
		String raw = ddsheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(raw);
		
		System.out.println(raw);
		
}
}
