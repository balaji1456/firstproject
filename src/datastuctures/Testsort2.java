package datastuctures;

import java.util.ArrayList;
import java.util.Collections;

public class Testsort2 {
	public static void main(String[] args) {
		ArrayList al2=new ArrayList();
		al2.add(202);
		al2.add(201);
		al2.add(10);
		al2.add(500);
		al2.add(300);
		Collections.sort(al2);
	for (Object object : al2) {
		System.out.println(object);
	}
	}

}
