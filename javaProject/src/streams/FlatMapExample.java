package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList2 = Arrays.asList("10,20,30","40,50,60");
		inputList2.stream()
		.flatMapToInt(new Function<String,IntStream>(){ //<입력타입,리턴타입>
			@Override
			public IntStream apply(String t) { //리턴타입 : IntStream
				String[] strArr = t.split(",");
				int[] intArr = new int[strArr.length];
				for(int i=0;i<strArr.length;i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			}
			
		}).forEach(number -> System.out.println(number));
		
	}
}
