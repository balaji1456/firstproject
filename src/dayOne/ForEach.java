package dayOne;

import java.util.ArrayList;

public class ForEach {
	int temp;
public void beames() {
	ArrayList<Integer> lier = new ArrayList<Integer>();
	lier.add(23);
	lier.add(24);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	lier.add(23);
	
	for (Integer dd : lier) {
		
		System.out.print(dd+" ");
		
		
	}
}
public static void main(String[] args) {
	ForEach ff= new ForEach();
	ff.beames();
}
}
