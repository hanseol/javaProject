package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Home","Cafe","Park","Coffee");
		//stream 중간처리 최종집계한 결과를 다시 List<String>
		Collector<String,?,List<String>> col = Collectors.toList();
		
		List<String> newList = list.stream()
		.filter(s->s.startsWith("C"))
		.collect(col);
		
		for(String str : newList) {
			System.out.println(str);
		}
		
		
		System.out.println("----------------------------------");
		EmpDAO dao = new EmpDAO();
		dao.getEmpList(); // List<Employee>
		dao = new EmpDAO();
		Set<Employee> emps = dao.getEmps(); //Set<Employee>
		List<Employee> empList = emps.stream() //직무가 IT_PROG인 사원을 List<Employee>에 담기.
		.filter(n->n.getJobId().equals("IT_PROG"))
		.collect(Collectors.toList());
		
		empList.stream().forEach(s->System.out.println(s.toString()));
	}
}
