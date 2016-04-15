package ehandling;

public class TryerCatcher {
public void trimming() {
	int asd[]= new int[10];
	String ss= null;
	int qwerty= asd.length;
	try {
	//System.out.println(us);
		int lml= ss.length();
		System.out.println(asd[2]);
	} catch (ArrayIndexOutOfBoundsException el) {
	System.out.println("you tryed to acces array of bigger size");
	}
	catch (NullPointerException ell) {
		System.err.println(ell);
		
		System.err.println(ell.getMessage());
		}
	System.out.println(qwerty);
}
public static void main(String[] args) {
	TryerCatcher tte = new TryerCatcher();
	tte.trimming();
}
}
