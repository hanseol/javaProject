package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/*
		double avg = list.stream().mapToInt(new ToIntFunction<Integer>(){
			@Override
			public int applyAsInt(Integer value) {
				return value;
			}
			.average()
			.getAsDouble()
			});
		 */
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		
		if(optional.isPresent()) {
			System.out.println("평균"+optional.getAsDouble());
		}else {
			System.out.println("방법1_평균: 0.0");
		}
		
	}
}
