package tasklist;

import java.util.Scanner;

class player{
	public String players;
	public void play() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter player value");
		players =sc.next();
		
	}
	
}
class guesser{
	public String guessser;
	public void guess() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("please enter guesser value");
		guessser=sc1.next();
		
		
	}
	
		
	}
	

class umpire{
	public String umpires;
	public void ump() {
		player p1=new player();
		guesser g1=new guesser();
		 g1.guessser=umpires;
		g1.guess();
		p1.play();
		if (p1.players.equals(umpires)) {
			System.out.println("you r correct");
			
			
		}
		else {
			System.out.println("you r wrong");
		}
		
	}
}
public class Pgu {
	public static void main(String[] args) {
		
		umpire u1=new umpire();
	
		u1.ump();
	
		
	}

}
