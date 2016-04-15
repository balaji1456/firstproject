package dayOne;

import java.util.Scanner;

public class Fibnouchy {   
	
	public void nouchy() {
		int arr[]=new int[100];
		arr[0]=0;
	    arr[1]=1;
	    for (int i = 2; i < arr.length; i++) {
	    	arr[i]=arr[i-1]+arr[i-2];
	    	
			
		}
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter value to required for fib series");
	      int x=sc.nextInt();
	      System.out.println("the value of fibnouchy is "+arr[x]);
	      
			
		
		
	}
	public static void main(String[] args) {
		
	Fibnouchy bal=new Fibnouchy();
	bal.nouchy();
		
	}
	

}
