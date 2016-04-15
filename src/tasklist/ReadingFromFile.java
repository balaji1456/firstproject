package tasklist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
	public void readerfile() throws IOException {
		File f=new File("demo.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String str;
		while ((str=br.readLine())!=null) {
			System.out.println(str);
			
			
		}
		
	}
public static void main(String[] args) throws IOException {
	ReadingFromFile RFF=new ReadingFromFile();
	RFF.readerfile();
	
}
}
