package Signup;

//import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Scanner;

//import java.io.IOException;
//import java.io.InputStreamReader;
import Customer.IdCreation;
public class CustomerSignup {
	DisplayId idDis = new DisplayId();
	Scanner scan = new Scanner(System.in);
	public void Signup() {
//		BufferedReader br;
		FileWriter fw;
//		br = new BufferedReader(new InputStreamReader(System.in));

		try {
			fw = new FileWriter("MasterFile.txt",true);
			System.out.print("Enter Your Name : ");
			String name = scan.next();
			System.out.print("Enter Deposit Amount : ");
			String bal = scan.next();
			System.out.print("Enter Your Mobile Number : ");
			String mobNo = scan.next();
			System.out.println("-------------------------------------------------------------");
			
			IdCreation ranId = new IdCreation() ;
			int id= Integer.parseInt(ranId.FileReader());
			ranId.updateId();
			
			fw.write(id+"");
			fw.write("#");
			fw.write(name);
			fw.write("#");
			fw.write(bal);
			fw.write("#");
			fw.write(mobNo);
			fw.write("\n");
			
			fw.close();
			idDis.idDisplay();
			fw.close();
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			}
}