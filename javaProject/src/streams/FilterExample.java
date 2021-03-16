package streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30), 
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27),
				new Member("박수미", Member.FEMALE, 27));
		
		list.stream()
		.distinct() //hashCode, equals 재정의.
		.forEach(System.out::println);
		
	}
}
