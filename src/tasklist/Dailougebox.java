package tasklist;

import javax.swing.JOptionPane;

public class Dailougebox {
	public static String firstname;
	public static String familyname;
	public static String fullname;
	public static void main(String[] args) {
		firstname=JOptionPane.showInputDialog("firstname");
		familyname=JOptionPane.showInputDialog("familyname");
		fullname="you are"+firstname+" "+familyname;
		JOptionPane.showConfirmDialog(null, fullname);
		
	}

}
