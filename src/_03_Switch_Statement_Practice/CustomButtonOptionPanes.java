package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			System.out.println("yadnuS");
			break;
		case "Monday":
			for (int i = 0; i < options.length; i++) {
				System.out.println(options[i].toString());
			}
			break;
		case "Tuesday":
			for (int i = 0; i < 100; i++) {
				System.out.println(i*i*i*i*i);
			}
			break;
		case "Wednesday":
			System.out.println("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[{]};:\'\"\\|,<.>/?`~");
			break;
		case "Thursday":
			System.out.println("".toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString());
			break;
		case "Friday":
			System.out.println(options.hashCode()+"");
			break;
		case "Saturday":
			System.out.println(options);
		}
	}
}
