package Week8;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws Exception {

		java.io.File file = new java.io.File("C:/Users/af03848/scores.txt");
		/*if (file.exists()) {
		  System.out.println("File already exists");
		  System.exit(0);
		}*/ 
		
		//Create a scanner for the file file
		Scanner input = new Scanner(file);
		
		//Read data from a file
		while (input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			//System.out.println(firstName + " " + mi + " " +  lastName + " " + score);
		}
		input.close();
		System.out.println("File Created!");

	}

}
