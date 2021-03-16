package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		System.out.println("range : endExculsive");
		IntStream is = IntStream.range(10, 20);
		is.forEach(v -> System.out.print(v+" "));
		System.out.println();
		System.out.println("rangeClosed : endInculsive");
		is = IntStream.rangeClosed(10, 20);
		is.forEach(v -> System.out.print(v+" "));
	
		System.out.println();
		System.out.println();
		//15~35까지 합.
		int sum = IntStream.rangeClosed(15,35).sum();
		System.out.println("15~35 합 : " + sum);
	}
}
