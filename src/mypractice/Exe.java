package mypractice;

public class Exe implements InterfacePractice {

	int a;
	int b;
	public void add() {
		System.out.println(a+b);
		
		
	}

	
	public void sub() {
		System.out.println(a-b);
		
		
	}
	public static void main(String[] args) {
		  Exe ee=new Exe();
		  ee.add();
		  ee.sub();
	}

}
