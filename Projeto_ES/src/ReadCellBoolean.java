import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class ReadCellBoolean   {  
 
	public boolean ReadCellData(int vRow, int vColumn) 	{  
		boolean value;         //variable for storing the cell value  
		Workbook wb=null;           //initialize Workbook null  
		try  {  
			//reading data from a file in the form of bytes  
			FileInputStream fis=new FileInputStream("C:\\Users\\joaov\\Downloads\\Long-Method.xlsx");  
			//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
			wb=new XSSFWorkbook(fis);  
		}  
		catch(FileNotFoundException e)  {  
			e.printStackTrace();  
		}  
		catch(IOException e1)  {  
			e1.printStackTrace();  
		}  
		Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
		Row row=sheet.getRow(vRow); //returns the logical row  
		Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
		value=cell.getBooleanCellValue();    //getting cell value  
		return value;               //returns the cell value  
	} 
	
	public static void main(String[] args)   {  
		ReadCellBoolean rc=new ReadCellBoolean();   //object of the class  
		//reading the value of 2nd row and 2nd column  
		boolean vOutput=rc.ReadCellData(15, 8);   
		System.out.println(vOutput);  
	}  
	//method defined for reading a cell 


}  
