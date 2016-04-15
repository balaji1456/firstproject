package tasklist;
class Machine{
	public void start() {
		System.out.println("the machine is started");
		
	}
}
class Camera extends Machine{
	public void start() {
		System.out.println("camera is started");
	
	}	
	public void snap() {
		System.out.println("photo taken");
		
	}
}
public class App {
	public static void main(String[] args) {
		Camera c=new Camera();
		Machine m=new Machine();
		c.start();
		c.snap();
		m.start();
		Machine m2=new Camera();
		m2.start();
		
		Machine m3=new Camera();
		Camera c1= (Camera) m3;
		c1.snap();
	}


}
