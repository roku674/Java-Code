package Homework4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Roster {
	private String rosterStats;
	private ArrayList<Player> players = new ArrayList<Player>();
	private static int count;

	public int counter(int count) {
	for(int it=0; it < players.size(); it++) {
		players = new ArrayList<Player>();
        if(players.get(it).getPlayerNum() >= 0 ) {
        //finds how many players there are
        count++;
            }
          }
		return count;
        }
	
	private String getRosterStats() {
		return rosterStats;
	}

	boolean addPlayer(Player p) {
		if(players.contains(p)) return false;
		players.add(p);
		return true;
		
	}
	
	public Roster(String rosterStats) {
		this.rosterStats = rosterStats;
		File input = new File("C:/Users/af03848/GSU_Women_BBall_stats.txt");
		File output = new File("C:/Users/af03848/GSU_Women_BBall_stats2.txt");
		try {
			Scanner scan = new Scanner(input);
			PrintWriter printWriter = new PrintWriter(output);
			
			scan.nextLine(); //gets rid of header
			while(scan.hasNext()) {
	        	//players.add(new Player(scan.nextLine()));
				Player p = new Player();
				p.setPlayerNum(scan.nextInt());
				p.setPlayerName(scan.next()); //Player Name String
				p.setgP(scan.nextInt());
				p.setgS(scan.nextInt());
				p.setTmin(scan.nextInt());
				p.settFG(scan.nextInt());
				p.settFGA(scan.nextInt());
				p.setThreept(scan.nextInt());
				p.setThreeptAttempt(scan.nextInt());
				p.setFreeT(scan.nextInt());
				p.setFreeTAttempt(scan.nextInt());
				p.setOffReb(scan.nextInt());
				p.setDefReb(scan.nextInt());
				p.setPersonalFouls(scan.nextInt());
				p.setAssists(scan.nextInt());
				p.settO(scan.nextInt());
				p.setStl(scan.nextInt());
				p.setBlk(scan.nextInt());
				p.setTotalPts(scan.nextInt());
				//integers above
				/**
				p.setAvgminutespergame(scan.nextDouble());
				p.setFieldgoalperc(scan.nextDouble());
				p.setThreeptfieldgoalperc(scan.nextDouble());
				p.setFreethrowperc(scan.nextDouble());
				p.setAvgReb(scan.nextDouble());
				p.setScoresPerGame(scan.nextDouble());
				//doubles above
				**/
				addPlayer(p);
			
			}

	        scan.nextLine();
	        while(scan.hasNext()) {
	        	Player p = new Player();
	            String s = scan.next();
	            int integer = scan.nextInt();
	            double dou = scan.nextDouble();
	            //printWriter.println(scan.nextDouble(p.toString));
	        	} 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	public void disByA1TotalPts() {
		Collections.sort(players, new A1Comparator());
		for (int i = 0; i <= 3; i++) {
			System.out.println(players.get(i) + " " +  players.get(i).getTotalPts());
            if(count == i) {
            break; 
            } 
		  }
		}
	
		public void disByA1Scorespergame() {
			Collections.sort(players, new A1Comparator());
			for (int j = 0; j <= 6; j++) {
				System.out.println(players.get(j) + " " +  players.get(j).getTotalPts());
                if(count == j) { // you tricked me there's only 5 players in the example!
            	break;
                } 
			  }
			}	
		
			public void disByA1Assists() {
				Collections.sort(players, new A1Comparator());
				for (int k = 0; k <= 3 ; k++) {
					System.out.println(players.get(k) + " " +  players.get(k).getAssists());
                    if(count == k) {
            		break;
                	} 
				  }
				}
				public void disByA1PersonalFouls() {
					Collections.sort(players, new A1Comparator());
					for (int l = 0; l <= 4 ; l++) {
						System.out.println(players.get(l) + " " +  players.get(l).getPersonalFouls());
                        if(count == l) { 
            			break;
                      } 
					}
				} 
				
}
