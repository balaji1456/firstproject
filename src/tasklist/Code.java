package tasklist;

import java.util.Scanner;

public class Code {
	public String guess;
	public String umpire=guess;
	public String player;
	public void bala() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter a guess value");
		guess=sc.next();
		System.out.println("enter player value");
		//System.out.println(umpire);
		player=sc.next();
		if (player.equals(umpire)) {
			System.out.println("you are correct");
			
		}
		else{
		System.out.println("you are wrong");
		}
		
	}
public static void main(String[] args) {
	Code code1=new Code();
	code1.bala();
	
}
}
