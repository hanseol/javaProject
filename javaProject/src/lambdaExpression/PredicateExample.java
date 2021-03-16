package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동","남자",90),
			new Student("김순희","여자",90),
			new Student("감자바","남자",95),
			new Student("박한나","여자",92));
	
	public static double avg(Predicate<Student> predicate) {
		int cnt = 0, sum=0;
		for(Student s : list) {
			if(predicate.test(s)) {
				cnt++;
				sum += s.getScore();
			}
		}
		return (double)sum/cnt;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t->t.getSex().equals("남자"));
		System.out.println(maleAvg);
		
		double femaleAvg = avg(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getSex().equals("여자");
			}
			
		});
		
		
		System.out.println(femaleAvg);
	}
}
