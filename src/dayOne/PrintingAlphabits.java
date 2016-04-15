package dayOne;

import java.util.Scanner;

public class PrintingAlphabits {
  public void namo() {
	
	Scanner sc= new  Scanner(System.in);
	System.out.println("enter your first number");
	int num1= sc.nextInt();
	System.out.println("enter your second number");
	int num2= sc.nextInt();
	int sum=num1+num2;
	System.out.println("addition of two numbers "+ sum);
}
	
	
	public static void main(String[] args) {
		
		PrintingAlphabits chaithu= new PrintingAlphabits();
		chaithu.namo();
	}
}
