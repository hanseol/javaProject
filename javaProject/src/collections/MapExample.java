package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15);
		map.put("김민수", 20);
		map.put("박소연", 23);

		Integer result = map.get("홍길동"); //키값을 이용해서 value 를 찾음.
		Set<String> set = map.keySet(); //키값을 set 컬렉션에 담겠다. (특정 키 값을 모를 때 사용)
		
		
		/*방법2*/
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: "+val);
		}
		
		System.out.println("-------------------");
		
		/*방법1*/
		Iterator<String> iter = set.iterator(); //반복자 요소로 키 값을 불러옴.
		while(iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: "+val); //순서 x
		}
		
		Map<Integer, String> sMap = new HashMap<>();
		sMap.put(10, "집");
		String sResult = sMap.get(10);
		

	}
}
