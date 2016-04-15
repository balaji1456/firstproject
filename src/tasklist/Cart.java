package tasklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class City {
	public static String ram = "ram";
	public static String sam = "sam";
	public static String lam = "lam";

	public static void stores() {
		System.out.println("the stores are:" + ram + "," + sam + ","  + lam);
Stores.products();
	}
}

class product {
	public static String input;

	public static void pr() {

		ArrayList<String> al = new ArrayList<String>();
		al.add("cake");
		al.add("brush");
		al.add("surf");
		for (String str : al)
			System.out.println(str);
Prices.rprice();
	}

	public static void ps() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("buisc");
		al1.add("maza");
		al1.add("soap");
		for (String ktr : al1)

			System.out.println(ktr);
		Prices.sprice();
	}

	public static void pl() {
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("mike");
		al2.add("book");
		al2.add("stick");
		for (String ltr : al2)
			System.out.println(ltr);
Prices.lprice();
	}
}

class Stores {
	public static String input;
	

	public static void products() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the store");
		input = sc.next();
		switch (input) {
		case "ram":
			System.out.println("the products are:");
			product.pr();
			break;
		case "sam":
			System.out.println("the products are");
			product.ps();
			break;
		case "lam":
			System.out.println("the products are");
			product.pl();
			break;
       default:
    	   System.out.println("you entered a invalid store");
		}

	}
}
	class Prices {
		public static String keyo;
		public static String keyt;
		public static String key;
		public static Integer value;
		public static void rprice() {
			Scanner sc1=new Scanner(System.in);
			 System.out.println("please enter the product");
		   key=sc1.next();
		   			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			hm.put("cake", 12);
			hm.put("brush", 15);
			hm.put("surf", 10);
			Integer value=(Integer)hm.get(key);
            System.out.println("the value of product:"+value);
		}
			public static void sprice() {
				Scanner sc2=new Scanner(System.in);
				System.out.println("please enter product");
				keyo=sc2.next();
			HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
			hm1.put("buisc", 10);
			hm1.put("maza", 15);
			hm1.put("soap", 24);
			Integer value=(Integer)hm1.get(keyo);
			System.out.println("the price of product:"+value);
			}

			public static void lprice() {
				Scanner sc3=new Scanner(System.in);
				System.out.println("please enter the product");
				keyt=sc3.next();
			HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
			hm2.put("mike", 50);
			hm2.put("book", 20);
			hm2.put("stick", 10);
			Integer value=(Integer)hm2.get(keyt);
			System.out.println("the value of product:"+value);
		}
	}

	public  class Cart {

		public static void main(String[] args) {
			City.stores();
		}

	}

