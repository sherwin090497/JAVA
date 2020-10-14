package GUI;
import java.awt.event.*;
import javax.swing.*;

public class LogIn implements ActionListener {

	private static JLabel welcomeText;
	private static JLabel log;
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	private static JButton registerButton;
	private static JLabel success;
	private static JLabel boss;
	
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("Drug Cartel");
		JPanel panel = new JPanel();
		frame.setSize(300, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		welcomeText = new JLabel("Welcome to Sherwin's Drug Cartel");
		welcomeText.setBounds(45, 20, 200, 25);
		log = new JLabel("Please Login");
		log.setBounds(95, 40, 200, 25);
		panel.add(welcomeText);
		panel.add(log);
		
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(20, 70, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(100, 70, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(20, 100, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 100, 165, 25);
		panel.add(passwordText);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(50, 150, 80, 25);
		loginButton.addActionListener(new LogIn());
		panel.add(loginButton);
		
		registerButton = new JButton("Register");
		registerButton.setBounds(150, 150, 90, 25);
		registerButton.addActionListener(new LogIn());
		panel.add(registerButton);
		
		success = new JLabel("");
		success.setBounds(10, 180, 300, 25);
		panel.add(success);
		boss = new JLabel("");
		boss.setBounds(10, 200, 300, 25);
		panel.add(boss);
		frame.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if(user.contentEquals("SherwinBoss6969") && password.contentEquals("1234")) {
			success.setText("Log in successful!");
			boss.setText("Drug Lord logging in...");
		}
		else {
		success.setText("Try Again!");
		}
	}

}
