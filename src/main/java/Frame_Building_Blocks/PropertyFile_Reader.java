package Frame_Building_Blocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile_Reader {

	public static void main(String[] args) throws IOException {
		
		      /*  educationData("Name");
				educationData("Age");
				educationData("Country");*/
				
				personalData("Name");
				personalData("Age");
				
			
			}

		private static String educationData(String key) throws IOException {
			 Properties prop = new Properties();
			 String path = System.getProperty("user.dir")+"\\TestData\\EducationData.Properties";
			 FileInputStream fis = new FileInputStream(path);
			 prop.load(fis);
				
			 String value = prop.getProperty(key);
			 System.out.println(value);
			 
			 return value;
				
	}


         private static String personalData(String key) throws IOException {
	     Properties prop = new Properties();
	     String path = System.getProperty("user.dir")+"\\TestData\\PersonalData.Properties";
	     FileInputStream fis = new FileInputStream(path);
	     prop.load(fis);
		
	     String value = prop.getProperty(key);
	     System.out.println(value);
	 
	     return value;
		
         }
         
     }

