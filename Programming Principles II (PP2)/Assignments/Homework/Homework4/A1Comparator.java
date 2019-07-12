package Homework4;

import java.util.Comparator;

public class A1Comparator implements Comparator<Player>{
	//Total Points
	public int compare(Player a1, Player a2) {
		if(a1.getTotalPts() < a2.getTotalPts()) return 1; 
		if(a1.getTotalPts() > a2.getTotalPts()) return -1;
		return 0;
	}
	//Scores
	public int compareTwo(Player b1, Player b2) {
		if(b1.getScorespergame() < b2.getScorespergame()) return 1; 
		if(b1.getScorespergame() > b2.getScorespergame()) return -1;
		return 0;
	}
	//Assists
	public int compareThree(Player c1, Player c2) {
	    if(c1.getAssists() < c2.getAssists()) return 1; 
		if(c1.getAssists() > c2.getAssists()) return -1;
		return 0;
	}

	//Fouls
	public int CompareFour(Player d1, Player d2) {
	    if(d1.getPersonalFouls() > d2.getPersonalFouls()) return 1; 
		if(d1.getPersonalFouls() < d2.getPersonalFouls()) return -1;
		return 0;
	}

}
