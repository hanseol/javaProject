package collections.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String n = iter.next();
			totalScore += map.get(n);
			
			if(maxScore < map.get(n)) {
				maxScore = map.get(n);
				name = n;
			}
		}
		
		System.out.println("평균점수 : "+ totalScore / (double)map.size());
		System.out.println("최고점수 : "+maxScore);
		System.out.println("최고 점수를 받은 아이디 : " +name);
		
	}
}
