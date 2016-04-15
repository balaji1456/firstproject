package datastuctures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Propertiesfile { 
	public static void main(String[] args)  throws IOException {
		FileReader fr=new FileReader("bala.properties");
		Properties p=new Properties();
		
		p.load(fr);
		System.out.println(p.getProperty("bala"));
		System.out.println(p.getProperty("narayana"));
	}

}
