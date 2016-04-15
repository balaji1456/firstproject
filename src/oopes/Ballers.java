package oopes;

public class Ballers extends Abstratcores implements Inters{
public void vattakaya(int a) {
	System.out.println("from vattakaya");
	System.out.println(a);
}
public void vattakaya(int a,int b) {
	System.out.println("from vattakaya");
	System.out.println(a+b);
	
}

void incompleter() {
	System.out.println("from incompleter");
	
}

@Override
void completer() {
	System.out.println("from completer");
	
}
public static void main(String[] args) {
	Ballers bal= new Ballers();
	bal.vattakaya(3,4);
	//bal.incompleter();
	//Ballersbal.completer();
}


@Override
public void add() {
	
	
}



public void adult() {
	
	System.out.println("from adult");
}


@Override
public void child() {
	System.out.println("from child");
}
}
