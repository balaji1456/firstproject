package ehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checkerss {
	String Bala="StudentDetails.txt";
	String line;
	public void checks() throws IOException {
		FileInputStream fiss= new FileInputStream(Bala);
		BufferedReader bf= new BufferedReader(new InputStreamReader(fiss));
		
		while ((line=bf.readLine())!= null) {
			System.out.println(line);
			
		}
		
	}
public static void main(String[] args) throws IOException {
	Checkerss che= new Checkerss();
	che.checks();
}
}
