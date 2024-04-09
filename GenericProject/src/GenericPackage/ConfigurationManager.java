package GenericPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;


public class ConfigurationManager {
public static void main(String[] args) throws Exception {
	Properties p=new Properties();
	p.setProperty("A", "B");
	p.getProperty("A");
	FileInputStream
	f=new FileInputStream("c://Batch27//config.properties.txt");
	p.load(f);
	String user=p.getProperty("user");
	String pass=p.getProperty("pass");
	
	System.out.println("user"+user);
	System.out.println("user"+pass);
}
}
