package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InputDAO {
	static Connection conn = null;
	
	public static void deleteBoard(int boardNo) {
		String sql = "delete input_board where board_no=" + boardNo;
		PreparedStatement pstmt = null;
		conn=DBCon.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r+"건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void updateBoard(BoardVO vo) {
		String sql = "update input_board set publicity=?, exit_date=?, contents=? where board_no=?";
		PreparedStatement pstmt = null;
		conn=DBCon.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPublicity());
			pstmt.setString(2, vo.getExitDate());
			pstmt.setString(3, vo.getContents());
			pstmt.setInt(4, vo.getBoardNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	//테이블 뷰에 담기 위한 ObservableList 사용.
	public static ObservableList<BoardVO> boardList(){
		String sql = "select * from input_board order by board_no";
		Statement stmt = null;	ResultSet rs=null;
		ObservableList<BoardVO> boardList = FXCollections.observableArrayList();
		conn=DBCon.getConnection(); //Connection객체 생성
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //ResultSet 리턴.
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContents(rs.getString("contents"));
				vo.setExitDate(rs.getString("exit_date"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setPublicity(rs.getString("publicity"));
				boardList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return boardList;
	}
	
	public static void insertBoard(InputBoardVO bo) {
		PreparedStatement pstmt = null;
		String sql = "insert into input_board values"
				+ "((select nvl(max(board_no),0)+1 from input_board),?,?,?,?,?)";
		conn=DBCon.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bo.getTitle());
			pstmt.setString(2, bo.getPasswd());
			pstmt.setString(3, bo.getPublicity());
			pstmt.setString(4, bo.getExitDate());
			pstmt.setString(5, bo.getContents());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}//end of insertBoard()
}
