package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam04 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Hong", 20, 10),
				new Student("Kim", 80, 85),
				new Student("Choi", 70, 100),
				new Student("Park", 20, 70));

		list.stream()
			.filter(t -> (t.getMath() + t.getEng() < 100))
			.collect(Collectors.toList())
			.forEach(t -> System.out.println(t.toString()));

	}
}
