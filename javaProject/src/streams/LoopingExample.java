package streams;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intAry = {5,4,2,1,3};
		Arrays.stream(intAry)
		.peek(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println("peek: " + value);
			}
		})
		.filter(n->n>2)
		.forEach(s->System.out.println("forEach: "));
		System.out.println("end");
	}
}
