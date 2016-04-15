package tasklist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	    public void rfile() throws IOException {
	    	File f1=new File("raj.txt");
	    	f1.createNewFile();
	    	BufferedReader br=new BufferedReader(new FileReader(f1));
	    	  String str;
	    	  while ((str=br.readLine())!=null) {
				System.out.println(str);
				br.close();
				
			}
			
		}
public static void main(String[] args) throws IOException {
	FileReading FR=new FileReading();
	FR.rfile();
	
}
}
