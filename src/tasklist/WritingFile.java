package tasklist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingFile {
	public void write() throws IOException {
		File f1=new File("studentDetails.txt");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		FileWriter FW=new FileWriter(f1);
		
		FW.write(n);
		FW.close();
		
	}
	public static void main(String[] args) throws IOException {
		WritingFile wf=new WritingFile();
		wf.write();
	}

}
