package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//step 1: We have to convert physical file into java Readable Object
		// new FileInputStream() throws FileNotFoundException
		
		FileInputStream fis = new FileInputStream("./TestResources/CommonData.Properties");
		
		//step2: Create an Instance of properties Object
		//properties object should imported from java.util Package
		
		Properties property = new Properties();
		
		//step3: load all the key-value pairs into properties object
		//the below statement throws IOexception
		
		property.load(fis);
		
		//step4: Fetch the data using the key
		String url = property.getProperty("url");
		String browser = property.getProperty("browser");
		String user = property.getProperty("username");
		String pwd = property.getProperty("password");
		
		System.out.println(url+"\n"+browser+"\n"+user+"\n"+pwd);
	}

}
