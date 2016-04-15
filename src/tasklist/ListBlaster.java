package tasklist;

import java.util.ArrayList;

public class ListBlaster {
	public void list() {
		ArrayList al=new ArrayList();
		al.add("mad");
		al.add(3);
		al.add(9);
		al.add("samantha");
		System.out.println(al.get(3));
		System.out.println(al.size());
		
System.out.println(al);		
		
		
	}
public static void main(String[] args) {
	ListBlaster lb=new ListBlaster();
	lb.list();
}
}
