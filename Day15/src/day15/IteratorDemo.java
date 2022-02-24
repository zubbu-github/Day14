package day15;

import java.util.*;

public class IteratorDemo {
	void Display(List<String> list) {
		Iterator<String> obj =  list.iterator();
		while(obj.hasNext()) {
			System.out.println("Elements are " + obj.next());
		}
	}

	public static void main(String[] args) {
		LinkedList<String> oj = new LinkedList<>();
		oj.add("Zubeir");
		oj.add("Latesh");
		oj.add("Vishal");
		oj.add("Vishwa");
		oj.add("Tariq");
		oj.add("Manoj");
		
		System.out.println("Element is :" + oj);
		
		IteratorDemo id = new IteratorDemo();
	
		oj.sort(null);
		id.Display(oj);
		System.out.println("*************************");
		Collections.reverse(oj);
		id.Display(oj);
	}

}
