package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String args[]) throws IOException {
	      Properties prop = readPropertiesFile("credentials.properties");
	      System.out.println("username: "+ prop.getProperty("Name"));
	      System.out.println("Course "+ prop.getProperty("Course"));
	   }
	   public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream("Object.properties");
	         prop = new Properties();
	         prop.load(fis);
	      } 
	     catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
}
