package Footballer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingSorting implements Comparator<Footballer>{
	@Override
	public int compare(Footballer footballer1,Footballer footballer2) {
		return Integer.compare(footballer1.getballonDorNumber(), footballer2.getballonDorNumber());		
	}
}

public class FootballerRunner {
	public static void main(String[] args) {
		//Footballer(String playerName,int playerNumber,String playerClub,int ballonDorNumber)
		
		List<Footballer> myList = new ArrayList<>(Arrays.asList(new Footballer("Messi",10,"Barcelona",8),
				new Footballer("Ronaldo",7,"Real",6),
				new Footballer("Neymar",10,"PSG",0)
				));
		System.out.println("This list preorder" + myList);
		Collections.sort(myList, new DescendingSorting());
		System.out.println("This list after order" + myList);
	}
}
