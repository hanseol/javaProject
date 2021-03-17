package streams;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class AggregateExample {
	public static void main(String[] args) {
		
		int Ary[] = new int[] {1,2,3,4,5};
		
		long count = Arrays.stream(Ary).filter(v -> v%2==0).count(); 
		System.out.println(count);
		int sum = Arrays.stream(Ary).filter(value->value%2==0).sum();
		System.out.println(sum);
		double avg = Arrays.stream(Ary).filter(v->v%2==0).average().getAsDouble();
		System.out.println(avg);
		int max = Arrays.stream(Ary).filter(v->v%2==0).max().getAsInt();
		System.out.println(max);
		int min = Arrays.stream(Ary).filter(v->v%2==0).min().getAsInt();
		System.out.println(min);
		int first = Arrays.stream(Ary).filter(v->v%3==0).findFirst().getAsInt();
		System.out.println(first);
	
	}
}
