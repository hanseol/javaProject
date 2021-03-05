package hr;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO(); //db정의
		Employee[] empList = dao.empList();
		System.out.println("salary가 8000 이상인 사원 정보");
		for(Employee emp : empList) {
			if(emp!=null && emp.getSalary()>8000) {
				System.out.println(emp.toString());
			}
		}
		
		EmpDAO dao2 = new EmpDAO();
		Department[] deptList = dao2.deptList();
		System.out.println("department_id가 30 또는 50인 부서 정보");
		for(Department dept : deptList) {
			if(dept!=null && (dept.getDepartmentId() == 30 || dept.getDepartmentId() == 210) ) {
				System.out.println(dept.toString());
			}
		}
	}

}
