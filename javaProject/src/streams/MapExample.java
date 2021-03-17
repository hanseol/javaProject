package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동",40),
			new Student("신용권",20),
			new Student("유미선",30)
		);
		
		studentList.stream()
			.mapToInt(s->s.getScore())
			.forEach(value->System.out.println(value));
		
		//최종처리 메소드가 스트림에서 호출이 되어야 중간처리가 연결됨.
		
		int[] intAry = {5,2,1,4,3};
		
		IntStream is = Arrays.stream(intAry);

		is//IntStream
		.forEach(new IntConsumer() {
			@Override
			public void accept(int value) {}
		});
		
		is = Arrays.stream(intAry);
		is
		.sorted()//IntStream
		.asDoubleStream() //DoubleStream
		.forEach(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println(value);
			}
		});
		
		
		is = Arrays.stream(intAry);
		is
		.boxed()
		.forEach(obj -> System.out.println(obj.intValue()));//Stream<Integer>
		
		
		//IntStream!=Stream<Integer>
		
		
		
	}
	
}
