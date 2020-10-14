package GUI;

import javax.swing.*;

public class Adding {

	public static void main(String[] args) {
		
		String x = JOptionPane.showInputDialog("Enter first number");
		String y = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "Adding", JOptionPane.PLAIN_MESSAGE);
		
	}
}
