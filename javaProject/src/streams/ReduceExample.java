package streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;

public class ReduceExample {
	public static void main(String[] args) {
		Student[] students = { new Student("Hong", 10)
				, new Student("Shin", 20)
				, new Student("Yun", 30) 
		};
		
		
		int sum = Arrays.stream(students) //Stream<Student>
		.mapToInt(s->s.getScore()) //IntStream
		.reduce(0,new IntBinaryOperator(){
			int sum = 0; //익명객체 필드
			int cnt = 0; //익명객체 필드
			@Override
			public int applyAsInt(int left, int right) {
				cnt++;
				sum+=right;
				return sum / cnt ;
			}
		});
		
		System.out.println(sum);
		

	}
}
