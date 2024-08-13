package Friend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingFriendComparator implements Comparator<Friend>{
	//Phuong thuc compare phai nam trong mot lop 
	@Override
	public int compare(Friend friend1, Friend friend2) {
		return Integer.compare(friend1.getFriendID(),friend2.getFriendID());
	} 
}

public class FriendRunner {
	public static void main(String[] args) {
		//	Friend(String friendName,int frientID,boolean friendSex)
		List<Friend> myList = new ArrayList<>(Arrays.asList(new Friend("Minh",1028,true),
				new Friend("Thanh",37,false),
				new Friend("Ha",40,true)
				));
		System.out.println(myList.toString());
		Collections.sort(myList);
		System.out.println(myList.toString());
		Collections.sort(myList,new DescendingFriendComparator());
		System.out.println(myList);
		
		 
	}

}
