package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hong");
		list.add("kim");
		list.add("Shin");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("---------------");
		
		list = Arrays.asList("Hong", "kim","Park");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		iter = list.iterator(); //다시 다른 작업을 할 경우, iterator로 값을 다시 불러와야 함.
		
		System.out.println("---------------");
		Stream<String> stream = list.stream();
		stream.forEach((String t) -> System.out.println(t));
		
		stream = list.stream();
		int sum = stream.mapToInt(s -> s.length()).sum();
		System.out.println(sum);
		
		System.out.println("---------------");
		
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream = empList.stream();
		// salary > 10000 인 사원의 급여 합.
		
		int sum2 = eStream.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getSalary() > 10000;
			}
		}).mapToInt(new ToIntFunction<Employee>() {
			@Override
			public int applyAsInt(Employee t) {
				return t.getSalary();
			}
		}).sum();
		System.out.println("급여가 10000이상인 사원의 급여 합 : " + sum2);
	}
	
	
}
