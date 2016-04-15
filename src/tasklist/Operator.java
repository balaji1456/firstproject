package tasklist;

import java.util.Scanner;

public class Operator {
public static int ipo;
public static int ipt;
public static int output;
public static void main(String[] args) {
	Scanner value=new Scanner(System.in);
	System.out.println("please enter first num");
	ipo=value.nextInt();
	System.out.println("please enter second num");
	ipt=value.nextInt();
	output=ipo*ipt;
	System.out.println(output);
	
}

}
