package Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class teacherRunner {
	public static void main(String[] args) {
		//teacher(String name,int teacherID,boolean sex)
		List<teacher> myList = new ArrayList<>(Arrays.asList(new teacher("Thanh",37,false),
				new teacher("Duy",87,true),
				new teacher("Ha",40,true)
				));
		
	}

}
