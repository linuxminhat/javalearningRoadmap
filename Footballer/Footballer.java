package Footballer;

public class Footballer implements Comparable<Footballer> {
	private String playerName;
	private int playerNumber;
	private String playerClub;
	private int ballonDorNumber;
	Footballer(String playerName,int playerNumber,String playerClub,int ballonDorNumber){
		this.playerName=playerName;
		this.playerNumber=playerNumber;
		this.playerClub=playerClub;
		this.ballonDorNumber=ballonDorNumber;
	}
	public String getplayerName() {
		return playerName;
	}
	public void setplayerName(String playerName) {
		this.playerName=playerName;
	}
	public int getplayerNumber() {
		return playerNumber;
	}
	public void setplayerNumber(int playerNumber) {
		this.playerNumber=playerNumber;
	}
	public String getplayerClub() {
		return playerClub;
	}
	public void setplayerClub(String playerClub) {
		this.playerClub=playerClub;
	}
	public void setballonDorNumber(int ballonDorNumber) {
		this.ballonDorNumber=ballonDorNumber;
	}
	public int getballonDorNumber() {
		return ballonDorNumber;
	}
	public String toString() {
		return playerName + playerNumber + playerClub + ballonDorNumber;
	}
	@Override
	public int compareTo(Footballer that) {
		return Integer.compare(this.playerNumber, that.playerNumber);
	}

}
