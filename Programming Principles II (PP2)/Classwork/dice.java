import javax.swing.JOptionPane;

public class dice {

	public static void main(String[] args) {
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, x = 0;
		
		String choice;
		do
		{

		for(int i=1; i<=10000; i++)
		{
			
			x = (int) ((Math.random()*6)+1);
			
			
			
			if(x==1) count1++;
			
			if(x==2) count2++;
			if(x==3) count3++;

			if(x==4) count4++;
			
			if(x==5) count5++;
		
			if(x==6) count6++;

			
		}
		
		
		JOptionPane.showMessageDialog(null, 
				"1 appears " + count1 + " times"
					+ '\n' +
				"2 appears " + count2 + " times"
					+ '\n' +
				"3 appears " + count3 + " times"
					+ '\n' +
				"4 appears " + count4 + " times"
					+ '\n' +
				"5 appears " + count5 + " times"
					+ '\n' +
				"6 appears " + count6 + " times"
				);
		
		System.out.println(" ");
		System.out.println("1 appears " + count1 + " times");
		System.out.println("2 appears " + count2 + " times");
		System.out.println("3 appears " + count3 + " times");
		System.out.println("4 appears " + count4 + " times");
		System.out.println("5 appears " + count5 + " times");
		System.out.println("6 appears " + count6 + " times");
		
	    choice = JOptionPane.showInputDialog("want to continue? Type Y or Yes to continue");
	} while (choice.equals("Yes") | choice.equals("yes") | choice.equals("Y")| choice.equals("y"));

	}

}
