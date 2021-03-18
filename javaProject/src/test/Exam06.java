package test;

import java.util.Set;
import java.util.function.DoubleBinaryOperator;

import hr.EmpDAO;
import hr.Employee;

public class Exam06 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		dao.getEmpList(); // List<Employee>
		dao = new EmpDAO();
		
		Set<Employee> emps = dao.getEmps(); 
		double a = emps.stream() // 직무가 IT_PROG인 사원을 List<Employee>에 담기.
				.filter(n -> n.getJobId().equals("IT_PROG"))
				.mapToDouble(e -> e.getSalary())
				.reduce(0, new DoubleBinaryOperator() {
					double sum =0;
					int cnt =0;
					@Override
					public double applyAsDouble(double left, double right) {
						cnt++;
						sum+=right;
						return sum / cnt ;
					}
				});
		
		System.out.println(a);
	}
}
