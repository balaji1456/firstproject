package datastuctures;

import java.util.ArrayList;
import java.util.Iterator;

//creating a user defined class
class Stud{
	int rollno;
	String name;
	int id;
	Stud(int rollno,String name,int id){
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		
	}
}
public class Collections3 {
	public static void main() {
		Stud s=new Stud(1, "ashk", 12);
		Stud s1=new Stud(2, "bala", 13);
		Stud s2=new Stud(3, "kalyan", 14);
		ArrayList AL=new ArrayList();
		AL.add(s);
		AL.add(s1);
		AL.add(s2);
		Iterator itr=AL.iterator();
		while (itr.hasNext()) {
			Stud stu = (Stud) itr.next();
			System.out.println(stu.rollno+stu.name+stu.id);
			
		}
	}

}
