package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() {
		String path = "config/database.properties";
		FileReader fr = null;
		Properties prop = new Properties();

		try {
			fr = new FileReader(path);
			prop.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		conn = DBUtil.getConnection(url, user, passwd);

//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "hr";
//		String passwd = "hr";
//		conn = DBUtil.getConnection(url,user,passwd);
	}

	// 컬렉션 실습 Map
	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}

		return map;
	}

	public Set<Employee> getEmps() {
		String sql = "select * from emp_java";
		Statement stmt = null;
		ResultSet rs = null;
		Set<Employee> set = new HashSet<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setSalary(rs.getInt("salary"));
				set.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return set;
	}

	// 컬렉션 실습 LIST
	public List<Employee> getEmpList() {
		String sql = "select * from emp_java";
		List<Employee> list = new ArrayList<>(); // 크기 자동 처리.

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn); // oracle DB connection 종료.
		}

		return list;
	}

	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql); // 쿼리문 실행
			rs = psmt.executeQuery(); // 결과값 저장
			int i = 0;
			while (rs.next()) {
				// System.out.println(rs.getString("employee_id")); //칼럼 읽어오기.
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				// System.out.println(emp.toString());
				System.out.println("메소드 호출 완료");
				employees[i++] = emp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn); // oracle DB connection 종료.
		}
		System.out.println("메소드 호출 완료");
		return employees;
	}

	public Department[] deptList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from dept_java";
		Department[] departments = new Department[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));

				departments[i++] = dept;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn); // oracle DB connection 종료.
		}
		System.out.println("메소드 호출 완료");
		return departments;
	}

}
