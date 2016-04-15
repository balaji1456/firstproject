package chaitanya;
class Person{
	String name;
	int age;
	void speak(){
		System.out.println("my name is :"+name);
	}
	int retirement(){
		int yearstoretirement=60-age;
		return yearstoretirement;
		
	}
	String getage(){
		return name;
	}
	
}

public class GettersReturns {
	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="bala";
		person1.age=35;
		person1.speak();
		person1.retirement();
		int years=person1.retirement();
		
		System.out.println(years);
	String text=person1.getage();
	System.out.println(text);
	}
	}

