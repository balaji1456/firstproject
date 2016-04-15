package mypractice;

public class Abstract extends Exte{

	
		


	@Override
	void unimplement1() {
		System.out.println("unimplimented1");
		
	}


	void unimplement2() {
		System.out.println("unimplemented2");
		
		
	}
	public static void main(String[] args) {
		Abstract aa=new Abstract();
		aa.unimplement1();
	}

}
