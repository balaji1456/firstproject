package tasklist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SecondTable {
	
	 static Integer table;
	public static void table1() throws IOException {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <=12; j++) {
				table=i*j;
				File f2=new File("demo.txt"); 
				
				FileWriter fw=new FileWriter(f2);
				
				fw.write("table");
			
			
				System.out.print(table+",");
			}
			
			System.out.println(" ");
		}
		
				
			}
	public static void main(String[] args) throws IOException {
		SecondTable.table1();
		
	}
			
		
		
	}


