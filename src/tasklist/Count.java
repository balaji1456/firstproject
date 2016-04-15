package tasklist;

public class Count {
	public String number="3334344444333443333444444343434";
	int three;
	int four;
	public void thfo() {
		for (int i = 0; i < number.length(); i++) {
			char k=number.charAt(i);
			switch (k) {
			case '3':
				three++;
				break;
			case '4':
			four++;
			break;
			
			}
			
		}
		System.out.println(three);
		System.out.println(four);
	}
public static void main(String[] args) {
	Count c=new Count();
	c.thfo();
	
}
}
