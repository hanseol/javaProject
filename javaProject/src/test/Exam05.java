package test;

import java.util.Set;
import hr.EmpDAO;
import hr.Employee;

public class Exam05 {
	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		dao.getEmpList(); 
		dao = new EmpDAO();
		Set<Employee> emps = dao.getEmps(); 
	
		double average = emps.stream()
				.mapToInt(e->e.getSalary())
				.average()
				.getAsDouble();
		
		System.out.println(average);
		
	}
}
