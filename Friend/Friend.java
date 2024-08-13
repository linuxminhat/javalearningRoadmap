package Friend;

public class Friend implements Comparable<Friend> {
	private String friendName;
	private int friendID;
	private boolean friendSex;
	Friend(String friendName,int friendID,boolean friendSex){
		this.friendName = friendName;
		this.friendID = friendID;
		this.friendSex = friendSex;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName=friendName;
	}
	public int getFriendID() {
		return friendID;
	}
	public void setFriendID(int friendID) {
		this.friendID=friendID;
		
	}
	public boolean getFriendSex() {
		return friendSex;
	}
	public void setFriendSex() {
		this.friendSex=friendSex;
	}
	public String toString() {
		return friendName + " " +  friendID + " " + friendSex;
	}
	@Override
	public int compareTo(Friend that) {
		return Integer.compare(this.friendID, that.friendID );
	}
	

}
