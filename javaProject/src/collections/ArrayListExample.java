package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.get(0); //인덱스
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("Nice");
		strList.add("Good");
		strList.add(0,"Very"); //인덱스0자리에 Very가 들어가고 다른 데이터는 뒤로 한칸씩.
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		strList.remove(0);
		System.out.println();
		
		for(Object obj : strList) {
			String str = (String)obj;
			System.out.println(str);
		}
		
	}
}
