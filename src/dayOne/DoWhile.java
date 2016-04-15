package dayOne;

import java.util.Scanner;

public class DoWhile {
	public void maho() {
		Scanner bala= new Scanner(System.in);
		int mynum=0;
		do {
			System.out.println("enter a numer");
			 mynum=bala.nextInt();
		} while (mynum !=5);
		System.out.println("got5");
	}
    public static void main(String[] args) {
		DoWhile dw= new DoWhile();
		dw.maho();
	}
}
