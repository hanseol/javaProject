package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student,Integer>(); //Map:키와 값의 쌍으로 저장, 키는 중복 저장 안 됨.
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2,"김민수"), 85);
		map.put(new Student(1, "홍길동"), 92);
		
		Set<Student> set = map.keySet(); //Set : 키 값을 저장, 순서 유지 x, 중복 저장 x
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student std = iter.next();
			System.out.println(std);
		}
		//물리적으로는 다르지만 논리적으로 같은 값 처리. hashCode(), equals()로 재정의
		
	}
}
