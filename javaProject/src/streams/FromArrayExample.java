package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = {"sleep","drink","wash"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a->System.out.print(a+" "));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = IntStream.of(intArray);
		
		int sum =0;
		sum = intStream.filter((value)-> value%2==0).sum();
		System.out.println(sum);
		
		
		intStream = Arrays.stream(intArray);
		OptionalDouble od = intStream.filter((value)-> value%2==0).average();
		System.out.println(od.getAsDouble());

	}
}
