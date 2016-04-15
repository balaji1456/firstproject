package chaitanya;
class Method{ 
	public void speak(String text){
		System.out.println(text);
	} 
    public void param(int distance) {
    	System.out.println(distance);
	}
    public void mparam(String direction,int distance) {
    	System.out.println("moving"+distance+"meters in"+direction);
    	
		
	}
	
}
	


public class MethodParameters {
	public static void main(String[] args) {
		Method method1=new Method();
		method1.speak("hai bala");
		method1.param(36);
		method1.mparam("west",36);
	}

}
 