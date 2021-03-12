package studentManagementPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import studentManagementPkg.common.DBcon;
import studentManagementPkg.model.StudentInfo;

public class StdManagementDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 학생등록
	public void enrollStd(StudentInfo std) {
		conn=DBcon.getConnection();
		sql= "insert into student_info values(" + std.getStuNo() 
											+ ", '" + std.getName()
											+ "' , " + std.getAge()
											+ ", '" + std.getPhone()
											+ "' , 0) ";						
		try {
			stmt = conn.createStatement();
			int r= stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}

	// 학생정보 수정
	public void updateStdInfo(StudentInfo std) {
		conn=DBcon.getConnection();
		sql = "update student_info set std_phone = '" + 
				std.getPhone() + "' where std_id = "+ std.getStuNo() ;
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	
	// 성적 입력
	public void insertScore(StudentInfo std) {
		conn=DBcon.getConnection();
		sql = "update student_info set std_score = " +
				std.getScore() + "where std_score = 0";
	
		try {
			stmt = conn.createStatement();
			int r= stmt.executeUpdate(sql);
			System.out.println(r +"건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	// 성적 조회 (한건조회)
	public StudentInfo selectScore(int stdId) {
		sql = "select * from student_info where std_id = " + stdId;
		conn = DBcon.getConnection();
		StudentInfo scoreInfo = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs!=null) {
					scoreInfo = new StudentInfo(rs.getInt("std_id"),
												rs.getString("std_name"),
												rs.getInt("std_score"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return scoreInfo;
	}
	// 성적 수정
	public void updateScore(StudentInfo std) {
		conn=DBcon.getConnection();
		sql = "update student_info set std_score = '" + 
				std.getScore() + "' where std_id = "+ std.getStuNo() ;
		
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건이 정상적으로 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 전체리스트 조회
	public StudentInfo[] selectStudentInfo() {
		sql = "select * from student_info order by std_id";
		conn = DBcon.getConnection();
		StudentInfo[] stuInfo = new StudentInfo[10];
		int i = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				StudentInfo std = new StudentInfo();
				std.setStuNo(rs.getInt("std_id"));
				std.setName(rs.getString("std_name"));
				std.setAge(rs.getInt("std_age"));
				std.setPhone(rs.getString("std_phone"));
				std.setScore(rs.getInt("std_score"));

				stuInfo[i++] = std;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

		return stuInfo;
	}

}
