package datastuctures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students{
	int rollno;
	String name;
	int id;
	 Students(int rollno,String name,int id){
		this.rollno=rollno;
		this.name=name;
		this.id=id;
	}
}
class AgeComparator implements Comparator{

	
	public int compare(Object obj1, Object obj2) {
		Students s1=(Students)obj1;
		Students s2=(Students)obj2;
		if(s1.rollno==s2.rollno)
		return 0;
		else if(s1.rollno>s2.rollno)
		return 1;
		else
			return -1;
	}
	
}
class NameComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
	Students s1=(Students)o1;
	Students s2=(Students)o2;
		return s1.name.compareTo(s2.name);
				
	}
	
}
public class Simple {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Students(111, "bala",34));
		al.add(new Students(222,"ashok",12));
		al.add(new Students(333, "chaitanya",32));
		System.out.println("sorting by name");
		Collections.sort(al,new NameComparator());
		Iterator itr=al. iterator(); 
		while (itr.hasNext()) {
			Students st = (Students)itr.next();
			System.out.println(st.rollno+st.name+st.id);
		
		}
		
		
			
			System.out.println("sorting by rollno");
			Collections.sort(al,new AgeComparator());
			Iterator itr2=al. iterator(); 
				while (itr2.hasNext()) {
					Students st = (Students) itr2.next();
					System.out.println(st.rollno+st.name+st.id);
					
				}
			
				

			
		
		
	}

}
