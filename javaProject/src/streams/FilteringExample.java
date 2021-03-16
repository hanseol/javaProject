package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "김자바", "신용권", "신용권", "신민철");

		System.out.println("1.중복 제거");
		names.stream().distinct().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("2.필터링");
		
		names.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("신");
			}
		}).forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		System.out.println("3.중복제거 후 필터링");
		
		names.stream()
		.distinct()
		.filter(n->n.startsWith("신"))
		.forEach(n->System.out.println(n));
		
//		
//		Stream<String> s = names.stream();
//		Stream<String> b = s.filter(new Predicate<String>(){
//			@Override
//			public boolean test(String t) {
//				return false;
//			}
//		});

	}
}
