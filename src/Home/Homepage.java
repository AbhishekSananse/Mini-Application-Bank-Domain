package Home;

import java.util.Scanner;
import Signup.CustomerSignup;
import signin.CustomerSignIn;

public class Homepage {
	
	public void home(){
		CustomerSignup csu = new CustomerSignup();
		CustomerSignIn csi = new CustomerSignIn();
		Scanner in = new Scanner(System.in);
		
		boolean exit = false;
		do {
			System.out.println("-------------------------------------------------------------");
		System.out.println("                        Home Page         ");
		System.out.println("1. Customer Signup.");
		System.out.println("2. Customer Signin.");
		System.out.println("3. Exit.");
		System.out.println("-------------------------------------------------------------");
		int option;
		try {
		System.out.print("Enter Your Option : ");
		option = Integer.parseInt(in.next());
		System.out.println("-------------------------------------------------------------");
		switch(option) {
		case 1 :
			csu.Signup();
			break;
		case 2 :
			csi.Signin();
			break;
		case 3 :
			System.out.println("Thank You for using this Application.");
			System.out.println("Visit Again.");
			System.out.println("-------------------------------------------------------------");
			exit = true;
			System.exit(option);
			break;
		}
		in.close();
		}catch(Exception e) {
			System.out.println("Enter valid input.");
		}
		}while(!exit);
		in.close();
	}
}
