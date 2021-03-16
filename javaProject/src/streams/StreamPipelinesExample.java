package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30), 
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27));
		//list.add(new Member("김자바", Member.FEMALE, 27)); (x)

		double ageAvg = list.stream()
		.filter(m -> m.getSex() == Member.MALE)
		.mapToInt(Member::getAge)
		.average()
		.getAsDouble();
		System.out.println("평균: " + ageAvg);
		
		
		System.out.println("-----스트림 파이프라인-----");

		OptionalDouble result = list.stream()
				.filter(t ->t.getSex() == Member.MALE)// Stream<Member>
				.mapToInt(t -> t.getAge())// IntStream
				.average(); 
	
		if(result.isPresent()) {
			System.out.println("평균나이 = "+result.getAsDouble());
		}else {
			System.out.println("만족하는 요소가 없습니다.");
		}
		
		
		System.out.println("------연습-------");
		//컬렉션->스트림->매핑(나이)->필터(50세 이상) ->평균 나이 구해보세요.
		double avg = list.stream()
			.mapToInt(value -> value.getAge())
			.filter(value -> value >=30)
			.average()
			.getAsDouble();
		System.out.println("평균: " + avg);
		//50세 이상인 사람이 없을 경우 처리할 때 -> OptionalDouble 사용.
		
		
		
	}
}
