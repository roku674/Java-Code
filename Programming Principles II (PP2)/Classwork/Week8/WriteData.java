package Week8;

public class WriteData {

	public static void main(String[] args) throws Exception {

		java.io.File file = new java.io.File("C:/Users/af03848/scores.txt");
		/*if (file.exists()) {
		  System.out.println("File already exists");
		  System.exit(0);
		}*/ 
		
		//Create a file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		//Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.print("Bugs 0 Bunny ");
		output.println(70);
		
		//Close teh file
		output.close();
		System.out.println("File Created!");

	}

}
