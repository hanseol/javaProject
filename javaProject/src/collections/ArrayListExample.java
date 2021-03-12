package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.get(0);
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("Nice");
		strList.add("Good");
		strList.add(0,"Very");
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		strList.remove(0);
//		
//		for(Object obj : strList) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
//		
	}
}
