package oopes;

public class Recurser {
public static   void  met1() {
	System.out.println("iam from method1");
	met2();
}
public static void met2() {
	System.out.println("iam from method2");
	met1();
}
public static void main(String[] args) {
	Recurser.met1();
}
}

