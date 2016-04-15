package convertings;

/*import java.awt.List;
import java.util.Arrays;

public class Arraytolist {
	public static void main(String[] args) {
		String sarray[]=new String[]{"bala","chai","bro"};
		List lList= Arrays.asList(sarray);
		System.out.println(lList);
	}

}*/
import java.util.Arrays;
import java.util.List;

public class Arraytolist {
  public static void main(String[] argv) {

	  String sArray[] = new String []{"Array 1", "Array 2", "Array 3"};
	  
	  //convert array to list
	  List lList = Arrays.asList(sArray);
	
	  System.out.println(lList);
	
  }
}