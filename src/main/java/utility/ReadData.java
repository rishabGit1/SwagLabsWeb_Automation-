package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{

	public static String readConfigFile(String value) throws IOException
	{
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Downloads\\Rishabh_Main_12feb\\Rishabh_Main\\src\\main\\java\\config\\config.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(value);
		
	}
	
	
	
	
}
