package dayOne;

import java.util.Scanner;

public class Switch {
    public void pradeep() {
		Scanner pra= new Scanner(System.in);
		 System.out.println("enter a command");
		 String text=pra.nextLine();
		 switch (text) {
		case "madan":
			System.out.println("naga mani");
			
			break;
		case "diwakar":
			System.out.println("suchi");
           break;
		default:
			System.out.println("nothing is match");
			break;
		}
		 
	}
    public static void main(String[] args) {
		Switch BALA=new Switch();
		BALA.pradeep();
	}
}
