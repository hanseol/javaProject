package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		int[] intAry = {5,3,2,1,4};
		
		Student[] stdAry = {
				new Student("Hong",30),
				new Student("Shin",20),
				new Student("Yun",15)};
		
		Stream<Student> st = Arrays.stream(stdAry);
		
		st.sorted().forEach(s->System.out.println(s.getName()));
		
		// Hong,30 - Shin,20 양의값
		//Yu, 15- Shin,20 음의값 - Hong,30
	}
}
