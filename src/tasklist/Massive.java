package tasklist;

public class Massive {
	static String inp="kassssjal agmmmmarwal";
	public void bigsmal() {
		
		for (int i = 0; i < inp.length(); i++) {
			char c=inp.charAt(i);
			if(c=='s')
				continue;
			if(c=='m')
				continue;
			System.out.print(c);
	}
		}
		public static void main(String[] args) {
			Massive M=new Massive();
			M.bigsmal();
		}
	}


