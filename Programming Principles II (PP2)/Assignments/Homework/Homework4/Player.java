package Homework4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Player {
	
	private String playerName;
	//1
	private int playerNum, gP, gS, tmin, tFG, tFGA, threept, threeptAttempt,
	freeT, freeTAttempt, offReb, defReb, personalFouls, assists, tO, stl, blk, totalPts;
	//18
	private double avgminutespergame, fieldgoalperc, threeptfieldgoalperc,
	freethrowperc, avgReb, scoresPerGame;
	//6

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerNum=" + playerNum + ", gP=" + gP + ", gS=" + gS + ", tmin="
				+ tmin + ", tFG=" + tFG + ", tFGA=" + tFGA + ", threept=" + threept + ", threeptAttempt="
				+ threeptAttempt + ", freeT=" + freeT + ", freeTAttempt=" + freeTAttempt + ", offReb=" + offReb
				+ ", defReb=" + defReb + ", personalFouls=" + personalFouls + ", assists=" + assists + ", tO=" + tO
				+ ", stl=" + stl + ", blk=" + blk + ", totalPts=" + totalPts + ", avgminutespergame="
				+ avgminutespergame + ", fieldgoalperc=" + fieldgoalperc + ", threeptfieldgoalperc="
				+ threeptfieldgoalperc + ", freethrowperc=" + freethrowperc + ", avgReb=" + avgReb + ", scoresPerGame="
				+ scoresPerGame + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assists;
		long temp;
		temp = Double.doubleToLongBits(avgReb);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(avgminutespergame);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + blk;
		result = prime * result + defReb;
		temp = Double.doubleToLongBits(fieldgoalperc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + freeT;
		result = prime * result + freeTAttempt;
		temp = Double.doubleToLongBits(freethrowperc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + gP;
		result = prime * result + gS;
		result = prime * result + offReb;
		result = prime * result + personalFouls;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + playerNum;
		temp = Double.doubleToLongBits(scoresPerGame);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stl;
		result = prime * result + tFG;
		result = prime * result + tFGA;
		result = prime * result + tO;
		result = prime * result + threept;
		result = prime * result + threeptAttempt;
		temp = Double.doubleToLongBits(threeptfieldgoalperc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tmin;
		result = prime * result + totalPts;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (assists != other.assists)
			return false;
		if (Double.doubleToLongBits(avgReb) != Double.doubleToLongBits(other.avgReb))
			return false;
		if (Double.doubleToLongBits(avgminutespergame) != Double.doubleToLongBits(other.avgminutespergame))
			return false;
		if (blk != other.blk)
			return false;
		if (defReb != other.defReb)
			return false;
		if (Double.doubleToLongBits(fieldgoalperc) != Double.doubleToLongBits(other.fieldgoalperc))
			return false;
		if (freeT != other.freeT)
			return false;
		if (freeTAttempt != other.freeTAttempt)
			return false;
		if (Double.doubleToLongBits(freethrowperc) != Double.doubleToLongBits(other.freethrowperc))
			return false;
		if (gP != other.gP)
			return false;
		if (gS != other.gS)
			return false;
		if (offReb != other.offReb)
			return false;
		if (personalFouls != other.personalFouls)
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (playerNum != other.playerNum)
			return false;
		if (Double.doubleToLongBits(scoresPerGame) != Double.doubleToLongBits(other.scoresPerGame))
			return false;
		if (stl != other.stl)
			return false;
		if (tFG != other.tFG)
			return false;
		if (tFGA != other.tFGA)
			return false;
		if (tO != other.tO)
			return false;
		if (threept != other.threept)
			return false;
		if (threeptAttempt != other.threeptAttempt)
			return false;
		if (Double.doubleToLongBits(threeptfieldgoalperc) != Double.doubleToLongBits(other.threeptfieldgoalperc))
			return false;
		if (tmin != other.tmin)
			return false;
		if (totalPts != other.totalPts)
			return false;
		return true;
	}

	public int getPlayerNum() {
		return playerNum;
	}
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	
	public  String getPlayerName() {
		return playerName;
	}
	public  void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getgP() {
		return gP;
	}
	public void setgP(int gP) {
		this.gP = gP;
	}
	public int getgS() {
		return gS;
	}
	public void setgS(int gS) {
		this.gS = gS;
	}
	public int getTmin() {
		return tmin;
	}
	public void setTmin(int tmin) {
		this.tmin = tmin;
	}
	public int gettFG() {
		return tFG;
	}
	public void settFG(int tFG) {
		this.tFG = tFG;
	}
	public int gettFGA() {
		return tFGA;
	}
	public void settFGA(int tFGA) {
		this.tFGA = tFGA;
	}
	public int getThreept() {
		return threept;
	}
	public void setThreept(int threept) {
		this.threept = threept;
	}
	public int getThreeptAttempt() {
		return threeptAttempt;
	}
	public void setThreeptAttempt(int threeptAttempt) {
		this.threeptAttempt = threeptAttempt;
	}
	public int getFreeT() {
		return freeT;
	}
	public void setFreeT(int freeT) {
		this.freeT = freeT;
	}
	public int getFreeTAttempt() {
		return freeTAttempt;
	}
	public void setFreeTAttempt(int freeTAttempt) {
		this.freeTAttempt = freeTAttempt;
	}
	public int getOffReb() {
		return offReb;
	}
	public void setOffReb(int offReb) {
		this.offReb = offReb;
	}
	public int getDefReb() {
		return defReb;
	}
	public void setDefReb(int defReb) {
		this.defReb = defReb;
	}
	public int getPersonalFouls() {
		return personalFouls;
	}
	public void setPersonalFouls(int personalFouls) {
		this.personalFouls = personalFouls;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int gettO() {
		return tO;
	}
	public void settO(int tO) {
		this.tO = tO;
	}
	public int getStl() {
		return stl;
	}
	public void setStl(int stl) {
		this.stl = stl;
	}
	public int getBlk() {
		return blk;
	}
	public void setBlk(int blk) {
		this.blk = blk;
	}
	public int getTotalPts() {
		return totalPts;
	}
	public void setTotalPts(int totalPts) {
		this.totalPts = totalPts;
	}

	//Computations
	
	public double getAvgminutespergame() {
		avgminutespergame = tmin/gP;
		return avgminutespergame;
	}
	public void setAvgminutespergame(double avgminutespergame) {
		this.avgminutespergame = avgminutespergame;
	}
	
	
	public double getFieldgoalperc() {
		fieldgoalperc = tFG/tFGA;
		return fieldgoalperc;
	}
	public void setFieldgoalperc(double fieldgoalperc) {
		this.fieldgoalperc = fieldgoalperc;
	}
	
	
	public double getThreeptfieldgoalperc() {
		threeptfieldgoalperc = threept/threeptAttempt;
		return threeptfieldgoalperc;
	}
	public void setThreeptfieldgoalperc(double threeptfieldgoalperc) {
		this.threeptfieldgoalperc = threeptfieldgoalperc;
	}
	
	
	public double getFreethrowperc() {
		freethrowperc = (freeT/freeTAttempt);
		return freethrowperc;
	}
	public void setFreethrowperc(double freethrowperc) {
		this.freethrowperc = freethrowperc;
	}
	
	
	public double getAvgReb() {
		avgReb = (offReb + defReb)/gP;
		return avgReb;
	}
	public void setAvgReb(double avgReb) {
		this.avgReb = avgReb;
	}
	public double getScorespergame() {
		scoresPerGame = totalPts/gP;
		return scoresPerGame;
	}
	public void setScoresPerGame(double scoresPerGame) {
		this.scoresPerGame = scoresPerGame;
	}
	public void addPlayer(Player p) {
		// TODO Auto-generated method stub
		
	}

}
