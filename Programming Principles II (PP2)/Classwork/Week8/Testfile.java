package Week8;

import java.io.File;

public class Testfile {

	public static void main(String[] args) {
		
		File f = new File("test.txt");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		// TODO Auto-generated method stub

	}

}
