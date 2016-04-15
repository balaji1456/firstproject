package datastuctures;

import java.util.PriorityQueue;

public class Pqueue {
public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("man");
	pq.add("kam");
	pq.add("sam");
	pq.add("lam");
	pq.add("hdh");
	pq.add("lsj");
	pq.add("jhd");
	System.out.println(pq);
	pq.remove();
	pq.poll();
	System.out.println(pq);
}
}
