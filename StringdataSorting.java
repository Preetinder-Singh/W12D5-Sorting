package DoubleSortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringdataSorting {

	public static void main(String Args[]) {
		
		List<String> lists = new ArrayList<String>();
		lists.add("Akshay");
		lists.add("Jawahar");
		lists.add("Mahesh");
		lists.add("Preetinder");
		lists.add("Nikhil");
		lists.add("Keshav");
		
		Collections.sort(lists);
		
		System.out.println("The sorted data in alphabetic order :"+lists);
		
		Collections.reverse(lists);
		
		System.out.println("The sorted data in reverse alphabetic orders :"+lists);
	}
}
