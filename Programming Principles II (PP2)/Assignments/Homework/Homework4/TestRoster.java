package Homework4;

public class TestRoster {
	public static void main(String[] args) throws Exception {
		Roster r = new Roster("roster");
		System.out.println("Top 3 ");
		r.disByA1TotalPts();
		System.out.println();
		System.out.println("Top 6 ");
		r.disByA1Scorespergame();
		System.out.println();
		System.out.println("Top 3 ");
		r.disByA1Assists();
		System.out.println();
		System.out.println("Least 4 ");
		r.disByA1PersonalFouls();

		
		

	}

}
