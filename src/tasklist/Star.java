package tasklist;

public class Star {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		System.out.print(i);
		for (int j = 0; j < i; j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}
}
