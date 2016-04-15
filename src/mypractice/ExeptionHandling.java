package mypractice;

public class ExeptionHandling {
	static int i= 10;
	public void exeption() {
		
		try {int a=10/2;
		System.out.println(a);
			
		} catch (ArithmeticException e) {
			System.out.println("please enter a correct value");
		}
		finally {
			System.out.println("from finall block");
		}
		
		
		
	}
	public void method2() {
		System.out.println("from method2");
		
	}
	public static void main(String[] args) {
		ExeptionHandling EH=new ExeptionHandling();
		EH.exeption();
		EH.method2();
	}
	

}
