package Week8;

import java.io.File;
import java.util.Scanner;

public class TestCourse {
	public static void main(String[] args) throws Exception {
		Course pp2 = new Course("PP2");
		
		//open file
		File file = new File("C:/Users/af03848/Students.txt");
		Scanner scan = new Scanner(file);
		
		scan.nextLine(); //gets rid of header
		while(scan.hasNext()) {
			Student s = new Student();
			s.seteID(scan.nextInt());
			s.setFname(scan.next());
			s.setLname(scan.next());
			s.setA1(scan.nextInt());
			s.setA2(scan.nextInt());
			s.setA3(scan.nextInt());
			
			pp2.addStudent(s);
		}
		scan.close();
		
		pp2.disByA1Scores();
		
	}

}
