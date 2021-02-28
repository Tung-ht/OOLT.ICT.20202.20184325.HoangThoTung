package w1;

import javax.swing.JOptionPane;

public class HelloNameDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "your name is: " + str +" !");
		System.exit(0);
	}

}
