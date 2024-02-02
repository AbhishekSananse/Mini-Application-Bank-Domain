package updateMobNum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import Customer.DeleteRenameFile;
import signin.CustomerSignIn;

public class MobileNumber {
	
	CustomerSignIn csi = new CustomerSignIn();
	Scanner scan = new Scanner(System.in);
	DeleteRenameFile drf = new DeleteRenameFile();
	public void UpMobNum(String idd){
		String data;
		try {
			FileReader fr = new FileReader("MasterFile.txt");
			FileWriter fw = new FileWriter("tempMasterFile.txt",true);
			BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(fr);
			data = br.readLine();
			System.out.print("Enter the new Mobile Number : ");
        	String num = scan.nextLine();
	        while (data  != null) {
	                
	        	StringTokenizer st = new StringTokenizer(data, "#");
	            String id = st.nextToken();
	            String name = st.nextToken();
	            String bal = st.nextToken();
	            String mobNo = st.nextToken();
	                           	
	            if (Integer.parseInt(idd) == Integer.parseInt(id)) {
	            	
	            	System.out.print("Your Previous Mobile Number was : ");
	            	System.out.println(mobNo);

	    			mobNo = String.valueOf(Long.parseLong(num));	    				    

	    			System.out.print("Your Updated Mobile Number is : ");
	    			System.out.println(mobNo);
	    			
	    			
	                }
	            
                fw.write(id);
                fw.write("#");
                fw.write(name);
                fw.write("#");
                fw.write(bal);
                fw.write("#");
                fw.write(mobNo);
                fw.write("\n");
                
    			data = br.readLine();
	    	
	           }

	        fw.close();
	        fr.close();
	        br.close();
	        
		}  catch (Exception e) {
	            e.printStackTrace();
       }
		drf.delren();
//		scan.close();
		
  	}
	
}
