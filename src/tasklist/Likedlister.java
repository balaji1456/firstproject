package tasklist;

import java.util.LinkedList;



public class Likedlister {
	
	public String ktr;
	
	public void bala(){
		LinkedList<String> ll=new LinkedList<>();
		ll.add("33");
		ll.add("mad");
		ll.add("44");
		ll.add("ram");
		for (String ktr : ll) 
			System.out.println(ktr);
		
		
		
		
	}
	public void madan(){
		LinkedList<String> ll=new LinkedList<>();
		ll.add("33");
		ll.add("mad");
		ll.add("44");
		ll.add("ram");
		ll.remove("33");
		ll.remove("44");
		for (String har : ll) 
			System.out.println(har);
			
		}
	public void nar(){
		LinkedList<String> ll=new LinkedList<>();
		ll.add("33");
		ll.add("mad");
		ll.add("44");
		ll.add("ram");
		System.out.println(ll.get(0));
	}
	
public static void main(String[] args) {
	Likedlister b=new Likedlister();
	b.bala();
	b.madan();
	b.nar();
}
	
	}


