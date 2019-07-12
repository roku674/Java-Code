package Week8;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class resReader {
	
	static ArrayList<houseHold> houses = new ArrayList<houseHold>();

	public static void main(String[] args) throws Exception {
		//open file
		File file = new File("C:/Users/af03848/residents.txt");
		Scanner scan = new Scanner(file);
		//read the file
		scan.nextLine();
		while (scan.hasNextLine()) {
			houses.add(new houseHold(scan.nextLine()));
		}
		//close
		scan.close();
		
		for(int i=0; i< houses.size(); i++) {
			System.out.println(houses.get(i));
		}
		int count = 0;
		for(int j=0; j< houses.size(); j++) {
		if(houses.get(j).getState().equals("GA")) {
			count++;
		 }
		}
	
		
		System.out.println("Georgia Residents = " + count);
	}
}
