package datastuctures;

import java.util.ArrayList;
import java.util.Collections;

public class Testsort1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("nana");
		al.add("amma");
		al.add("son");
		al.add("bro");
		al.add("sis");
		Collections.sort(al);
		for (String ntr : al) {
			System.out.println(ntr);
			
		}
	}

}
