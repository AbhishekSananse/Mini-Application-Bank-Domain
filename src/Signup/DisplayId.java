package Signup;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
public class DisplayId {
	String id;
	String name;
	String balance;
	String mobNo;
	public void idDisplay() {
			BufferedReader br;
			FileReader fr;
			StringTokenizer st;
			String data ;
			try {
				fr =new FileReader("MasterFile.txt");
				br = new BufferedReader(fr); 
				data = br.readLine();
				while(data != null) {
					st = new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						id = st.nextToken();
						name = st.nextToken();
						balance = st.nextToken();
						mobNo = st.nextToken();
					}
					data = br.readLine();
				}
				System.out.println("You Have Successfully Created your account. With Details as :");
				System.out.println("Name : "+ name);
				System.out.println("Deposit Amount : "+ balance);
				System.out.println("Mobile Number : "+ mobNo);
				System.out.print("Your Reference Id is : ");
				System.out.println(id);
				
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}