package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	 public static void main(String[] args) {
	       
		    String browserValue = getKeyValue("username");
	        System.out.println(browserValue);
	    }

	    public static String getKeyValue(String key) {
	        
	    	String value = null;
            String path = System.getProperty("user.dir")+"\\resources\\UI_Properties.properties";
            System.out.println("Reading from file: " + path);

	        try (FileInputStream fis = new FileInputStream(path)) { 
	            Properties prop = new Properties();
	            prop.load(fis);
	            value = prop.getProperty(key);
	        } catch (IOException e) {
	            System.out.println("Exception occurred while reading the property file: " + e.getMessage());
	        }

	        return value;
	    }
	}