package collectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Listers {
	public void ArrayLister() {
		ArrayList li= new ArrayList();
		li.add("2");
		li.add("2");
		li.add("man");
		li.add("2");
		li.add("2");
		li.add("2");
		li.remove(2);
		System.out.println(li.size());
System.out.println(li.get(2));
		
	}
public void linkedLister() {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(22);
		l1.add(33);
		
	}
public void vectors() {
	Vector<Character>vc=new Vector<Character>();
	vc.add('d');
	vc.add('g');
	vc.add('m');
	
	
}
public static void main(String[] args) {
	Listers ll= new Listers();
	ll.ArrayLister();
	//ll.linkedLister();
	//ll.vectors();
}
}
