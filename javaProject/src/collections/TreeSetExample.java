package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Iterator<Integer> iter = scores.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); //TreeSet -> 기본적으로 오름차순으로 정렬.
		}
		
		System.out.println("--------역순---------");
		iter = scores.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("--------역순---------");
		NavigableSet<Integer> nset = scores.descendingSet();
		for(Integer i : nset) {
			System.out.println(i);
		}
	}
}
