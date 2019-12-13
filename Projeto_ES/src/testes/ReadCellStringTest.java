package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReadCellStringTest {

	Workbook we;
	Sheet s;
	Row r;
	Cell c;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		we = new XSSFWorkbook("Long-Method.xlsx");
		s = we.getSheetAt(0);
		r = s.getRow(2);
		c = r.getCell(1);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReadCellData() {
		assertEquals("fat", c.getStringCellValue());
	}

}
