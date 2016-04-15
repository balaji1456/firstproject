package tasklist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writingfileone {
	public void write() throws IOException {
		File F1=new File("demo.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the txt");
		String input=sc.next();
		FileWriter fw=new FileWriter(F1);
		fw.write(input);
		sc.close();
		fw.close();
		
	}
public static void main(String[] args) throws IOException {
	Writingfileone WFO=new Writingfileone();
	WFO.write();
}
}

