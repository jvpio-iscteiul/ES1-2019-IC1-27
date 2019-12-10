import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class ReadCellInteger   {  
 
	public String ReadCellData(int vRow, int vColumn)  
	{  
		String value;          //variable for storing the cell value  
		Workbook wb=null;           //initialize Workbook null  
		try  
		{  
			//reading data from a file in the form of bytes  
			FileInputStream fis=new FileInputStream("C:\\Users\\joaov\\Downloads\\Long-Method.xlsx");  
			//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
			wb=new XSSFWorkbook(fis);  
		}  
		catch(FileNotFoundException e)  
		{  
			e.printStackTrace();  
		}  
		catch(IOException e1)  
		{  
			e1.printStackTrace();  
		}  
		Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
		Row row=sheet.getRow(vRow); //returns the logical row  
		Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
		value=cell.getStringCellValue();
		value.toString();
		return value;               //returns the cell value  
	} 
	
	public static void main(String[] args)   
	{  
	ReadCellInteger rc=new ReadCellInteger();   //object of the class  
	//reading the value of 2nd row and 2nd column  
	String vOutput=rc.ReadCellData(2, 4);   
	int foo = Integer.parseInt(vOutput);
	System.out.println(foo);  
	}  
	//method defined for reading a cell 
}  