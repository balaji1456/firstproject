package convertings;

import java.util.ArrayList;
import java.util.List;

public class Listtoarray {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("mad");
		al.add("mar");
		al.add("mak");
		al.add("mas");
		String[] countries=al.toArray(new String[al.size()]);
	}

}
