package DoubleSortedList;

import java.util.List;
import java.util.ArrayList;

import java.util.Collections;


public class DoubledataSorting {
	
	public static void main(String Args[]) {
	
		List<Double> lists = new ArrayList<Double>();
		lists.add(1.2);
		lists.add(0.36);
		lists.add(2.58);
		lists.add(3.05);
		lists.add(0.123);
		lists.add(20.21);
		
		Collections.sort(lists);
		
		System.out.println("The sorted data asscending order :"+lists);
		
		Collections.reverse(lists);
		
		System.out.println("The sorted data descending orders :"+lists);
	}

}
