package day15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollections {
	void Display(List<String> list) {
		Iterator<String> obj = list.iterator();
		while(obj.hasNext()) {
			System.out.println("The Elements are " + obj.next());
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
		
		JavaCollections jc = new JavaCollections();
		jc.Display(oj);
		
	}

}
