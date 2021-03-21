package com.yedam.diary;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DiaryOracleDAO implements DAO {
	
	Statement stmt = null;
	ResultSet rs = null;

	Connection conn = null;
	
	public DiaryOracleDAO() {
		String path = "config/diaryDB.properties";
		FileReader fr = null;
		Properties prop = new Properties();
		
		try {
			fr = new FileReader(path);
			prop.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패");
		}
		
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		conn = DBUtil.getConnection(url, user, passwd);
	}
	
	
	@Override
	public int insert(DiaryVO vo) {
		int r=0;
		String sql = "insert into diary values(TO_DATE(" 
		+ "'" + vo.getWdate() + "' ,'yyyy/mm/dd hh24:mi:ss"
		+"'),'"+vo.getContents()+"')";
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return r;
	}

	@Override
	public void update(DiaryVO vo) {
		String content = vo.getContents();
		String date = vo.getWdate();
		
		String sql = "update diary set content = '"+ content + "',"
				+ "day = TO_DATE('"+ StdInputUtil.readInsertDate()+"', 'yyyy/mm/dd hh24:mi:ss')"
				+ "where TO_CHAR(day,'yyyy/MM/dd hh24:mi:ss') = '"+ date+ "'";
		int r=0;
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate(sql);
			System.out.println(r+"건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int delete(String date) {
		String sql = "delete from diary where day = TO_DATE('" 
				+ date + "','yyyy/MM/dd hh24:mi:ss')";
		int r=0;
		try {
			stmt = conn.createStatement();
			r = stmt.executeUpdate(sql);
			System.out.println(r+"건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
	}

	@Override
	public DiaryVO selectDate(String date) {
		String sql = "select * from diary where TO_CHAR(day,'yyyy/MM/dd hh24:mi:ss') = '" + date +"'";
		DiaryVO diary = new DiaryVO();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				diary.setWdate(rs.getString("day"));
				diary.setContents(rs.getString("content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return diary;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		List<DiaryVO> vo = new ArrayList<>();
		String sql = "select * from diary where content LIKE'%" + content +"%'";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO diary = new DiaryVO();
				diary.setWdate(rs.getString("day"));
				diary.setContents(rs.getString("content"));
				vo.add(diary);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public List<DiaryVO> selectAll() {
		
		String sql = "select TO_CHAR(day, 'yyyy/MM/dd hh24:mi:ss') as day, content from diary order by day desc";
		List<DiaryVO> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO diary = new DiaryVO();
				diary.setWdate(rs.getString("day"));
				diary.setContents(rs.getString("content"));
				list.add(diary);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
