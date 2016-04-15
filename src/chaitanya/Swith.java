package chaitanya;

import java.util.Scanner;

public class Swith {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in); 
		System.out.println("please enter a command");
		String line=input.nextLine();
		switch (line) {
		case "sunday":
			System.out.println("today is holiday");
			
			break;

		default:
			System.out.println("nothing matching");
			break;
		}
		
			
		}
	}


