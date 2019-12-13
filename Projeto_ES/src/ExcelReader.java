import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {
	
    public static final String SAMPLE_XLSX_FILE_PATH = "Long-Method.xlsx";
    
    private static void printCellValue(Cell cell, int Row, int Column) {	
     
    	if (cell.getRowIndex()==Row && cell.getColumnIndex()==Column){
        switch (cell.getCellTypeEnum()) {
            case BOOLEAN:
                System.out.print(cell.getBooleanCellValue());
                break;
            case STRING:
                System.out.print(cell.getRichStringCellValue().getString());
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    System.out.print(cell.getDateCellValue());
                } else {
                    System.out.print(cell.getNumericCellValue());
                }
                break;
            case FORMULA:
                System.out.print(cell.getCellFormula());
                break;
            case BLANK:
                System.out.print("");
                break;
            default:
                System.out.print("");
        	}
    	}
    }
    public static void main(String[] args) throws IOException, InvalidFormatException {    	
        Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\joaov\\Downloads\\Long-Method.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);
   
        sheet.forEach(row -> {
    	    row.forEach(cell -> {
    	        printCellValue(cell,12,10);
    	    });
    	});
        workbook.close();
    }
    
    
    
 
    
}
