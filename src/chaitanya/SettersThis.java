package chaitanya;
class Frog{
	 private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
		System.out.println("this name");

		
	}
	public void setAge(int age) {
		this.age=age;
		System.out.println("this age");
	
		
		
	}
	public int getage() {
		return age;
		
		
	}
	public String getname() {
		return name;

		
	}
	public void setinfo(String name,int age){
		setName(name);
		setAge(age);
	}
}

public class SettersThis {
	public static void main(String[] args) {
		Frog frog1=new Frog();
		frog1.setinfo("bala", 37);
		frog1.getname();
		String text=frog1.getname();
		System.out.println(text);
	}

}
