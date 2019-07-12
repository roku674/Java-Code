import javax.swing.JOptionPane;

// Make sure your Class name is the same in x.footToMeter mine was Project.
public class Project {
	
	static double foot, meter;
	
	/** Converts from feet to meters **/
	public static double footToMeter(double foot) {
		foot = foot*0.305;
		return foot;
	}

	/** Converts from meters to feet **/
	public static double meterToFoot(double meter) {
		meter = meter*3.28;
		return meter;
		
	}

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"1 foot to " + Project.footToMeter(1) + " meters"
						+ '\n' +
				"2 feet to " + Project.footToMeter(2) + " meters"
						+ '\n' +
				"3 feet to " + Project.footToMeter(3) + " meters"
						+ '\n' +
				"4 feet to " + Project.footToMeter(4) + " meters"
						+ '\n' +
				"5 feet to " + Project.footToMeter(5) + " meters"
						+ '\n' +
				"6 feet to " + Project.footToMeter(6) + " meters"
						+ '\n' +
				"7 feet to " + Project.footToMeter(7) + " meters"
						+ '\n' +
				"8 feet to " + Project.footToMeter(8) + " meters"
						+ '\n' +
				"9 feet to " + Project.footToMeter(9) + " meters"
						+ '\n' +
				"10 feet to " + Project.footToMeter(10) + " meters"
				);
		
		JOptionPane.showMessageDialog(null,
				"1 meter to " + Project.meterToFoot(1) + "feet"
						+ '\n' +
				"2 meters to " + Project.meterToFoot(2) +"feet"	
						+ '\n' +
				"3 meters to " + Project.meterToFoot(3) +"feet"
						+ '\n' +
				"4 meters to " + Project.meterToFoot(4) +"feet"
						+ '\n' +
				"5 meters to " + Project.meterToFoot(5) +"feet"
						+ '\n' +
				"6 meters to " + Project.meterToFoot(6) +"feet"
						+ '\n' +
				"7 meters to " + Project.meterToFoot(7) +"feet"
						+ '\n' +
				"8 meters to " + Project.meterToFoot(8) +"feet"
						+ '\n' +
				"9 meters to " + Project.meterToFoot(9) +"feet"
						+ '\n' +
				"10 meters to " + Project.meterToFoot(10) +"feet"
				);
		
		// Tested with system out prints first
		System.out.println("1 foot to " + Project.footToMeter(1) + " meters");
		System.out.println("2 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("3 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("4 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("5 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("6 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("7 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("8 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("9 feet to " + Project.footToMeter(1) + " meters");
		System.out.println("10 feet to " + Project.footToMeter(1) + " meters");
	
		System.out.println();
		
		System.out.println("1 meter to " + Project.meterToFoot(1) + "feet");
		System.out.println("2 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("3 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("4 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("5 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("6 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("7 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("8 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("9 meters to " + Project.meterToFoot(1) +"feet");
		System.out.println("10 meters to " + Project.meterToFoot(1) +"feet");
		

	}

}
