package Frame_Building_Blocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_From_Excel_Data {

	public static void main(String[] args) throws IOException {
		
		
		//Read_From_Excel_Data();
		  Read_Data();
	}

	private static void Read_Data() throws IOException {
	     
	  //Creating a file object with the path to the excel file 
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\Learn_Coding\\TestData\\LoginData.xlsx");
			
	  //Now creating a fileinputstream to read the file
		FileInputStream fis = new FileInputStream(file);
        
      //Creating a workbook instance to access the excel file content
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
        
	  //Now Accessing the sheet named Sheet2 from the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet2");
         
      //getting the total number of rows 
		int rowCount = sheet.getLastRowNum();
         
	  //getting the total number of column
		int columnCount = sheet.getRow(0).getLastCellNum();
          
		for(int i=0; i<=rowCount; i++)
         {
        	 XSSFRow row = sheet.getRow(i);
        	 
        	 for(int j=0; j<columnCount; j++)
        	 {
        		 String cellValue = row.getCell(j).toString();
        		 System.out.println(" | " + cellValue);
        	 }
         
                System.out.println(" | ");
         }
               
              //Now closing the workbook and file input stream 
		        workbook.close();
                fis.close();
		
	}

	
	
	
	
	
	
	
	private static void Read_From_Excel_Data() throws IOException {
		
		  File file = new File("C:\\Users\\HP\\eclipse-workspace\\Learn_Coding\\TestData\\LoginData.xlsx");
		
		  FileInputStream fis = new FileInputStream(file);
          XSSFWorkbook workbook = new XSSFWorkbook(fis);
          XSSFSheet sheet = workbook.getSheet("Sheet1");

	        int rowCount = sheet.getPhysicalNumberOfRows();   

	        for (int i = 0; i < rowCount; i++) 
	        
	        {
	                XSSFRow row = sheet.getRow(i);

	                int cellCount = row.getPhysicalNumberOfCells();  
	                for (int j = 0; j < cellCount; j++) {
	                XSSFCell cell = row.getCell(j);
	                String cellValue = getCellValue(cell);
	                System.out.print(" | " + cellValue);
	        }
	           
	                System.out.println();   
	        }

	                workbook.close();
	                fis.close();
	 }

	
	    public static String getCellValue(XSSFCell cell) {

	        switch (cell.getCellType()) {

	            case NUMERIC:
	                return String.valueOf(cell.getNumericCellValue());

	            case BOOLEAN:
	                return String.valueOf(cell.getBooleanCellValue());

	            case STRING:
	                return cell.getStringCellValue();

	            default:
	                return cell.getStringCellValue();
	        }
	    }
	}	
		
		
	