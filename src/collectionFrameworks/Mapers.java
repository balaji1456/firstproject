package collectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class Mapers {
  public void hashmapper() {
	  Map<String, Integer> hm=new HashMap<String,Integer>();
	          hm.put("kal", 23);
	          hm.put("mal", 22);
	          hm.put("kal", 22);
	          System.out.println(hm.values());
}
  public static void main(String[] args) {
	     Mapers mpp=new Mapers();
	     mpp.hashmapper();
}
}
