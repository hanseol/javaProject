package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("홍길동", 10);
		map.put("김민수", 20);
		map.remove("홍길동");
		//
		Integer result = map.get("홍길동");
		System.out.println("홍길동:"+result);
		if(map.containsKey("홍길동")) {
			System.out.println("홍길동:"+result);
		}
		
		/*ketSet, entrySet 비교*/
		
		//키 값만 가져오는 keySet()
		//Set<String>
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator(); //반복자를 통해서 반복된 요소들을 읽어옴.
		while(iter.hasNext()) {
			String key = iter.next(); //String타입으로 값이 return됨.
			Integer val = map.get(key);
			System.out.println(key + val);
		}
		
		//Entry로 key값과 value를 같이 가져와서 Set collection에 담는 방법.
		//Map.Entry<String,Integer> 
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entIter = entrySet.iterator();
		while(entIter.hasNext()) {
			Entry<String,Integer> ent = entIter.next(); //entry타입으로 값이 return됨.
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println(key + val);
		}
	}
}
