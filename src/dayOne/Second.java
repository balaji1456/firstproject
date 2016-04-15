package dayOne;

public class Second {
	static int table;
	
public static void main(String[] args) {
	for (int i = 1; i <= 12; i++) {
		for (int j = 1; j <= 12; j++) {
			table=i*j;
			System.out.print(table+",");
		}
		
	}
	
}
}
