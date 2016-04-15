package datastuctures;

public class Array {
	public static void name() {
		
	
	int a[]=new int[10];
	a[0]=20;
	a[1]=21;
	a[2]=22;
	a[3]=23;
	a[4]=24;
	a[5]=25;
	a[6]=26;
	a[7]=27;
	a[8]=28;
	a[9]=99;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
	}
	public static void main(String[] args) {
		Array.name();
		Testarray ta=new Testarray();
		ta.tree();
	}
}
class Testarray{
	public void tree() {
		int s[]={33,86,99,55};
		Class c=s.getClass();
		String name=c.getName();
		System.out.println(name);
	}
}
