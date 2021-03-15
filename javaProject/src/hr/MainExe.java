package hr;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO(); //db정의
		
		/*keySet으로 DB 값 불러오기*/
		Map<String,String> map = dao.getJobList();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String id = iter.next();
			String title = map.get(id);
			System.out.println("job id : "+ id +  " job title: "+ title);
		}
		
		
		/*entry set으로 값 불러오기*/
		
//		Map<String,String> map = dao.getJobList();
//		Set<Entry<String,String>> set = map.entrySet();
//		//반복자 필요
//		Iterator<Entry<String,String>> iter = set.iterator();
//		while(iter.hasNext()){
//			Entry<String,String> ent = iter.next();
//			System.out.println("job id: " + ent.getKey() + "job title: " +ent.getValue());
//		}
		
		
		/*List로 값 불러오기 */
		//Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList();
//		System.out.println("salary가 5000 이상인 사원 정보");
//		for(Employee emp : empList) {
//			if(emp!=null && emp.getSalary()>5000) {
//				System.out.println(emp.toString());
//			}
//		}
//		
		 /*Department 클래스로 값 저장*/
//		EmpDAO dao2 = new EmpDAO();
//		Department[] deptList = dao2.deptList();
//		System.out.println("department_id가 30 또는 50인 부서 정보");
//		for(Department dept : deptList) {
//			if(dept!=null && (dept.getDepartmentId() == 30 || dept.getDepartmentId() == 210) ) {
//				System.out.println(dept.toString());
//			}
//		}
	}

}
