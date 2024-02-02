package Customer;


import java.io.File;

public class DeleteRenameFile {
//	public static void main(String[]args) {
//		DeleteRenameFile drf =new DeleteRenameFile();
//		drf.delren();
//	}
	public void delren() {
	File file = new File("D:\\Study\\JAVA\\Javavavav\\MiniApplication\\MasterFile.txt");
//	File Tfile = new File("D:\\Study\\JAVA\\Javavavav\\MiniApplication\\tempMasterFile.txt");
	
	if (file.exists()) {
	    if (file.delete()) {
	        System.out.println("Success");
	    } else {
	        System.out.println("Fail");
	    }
	} else {
	    System.out.println("File does not exist");
	}
}
}
