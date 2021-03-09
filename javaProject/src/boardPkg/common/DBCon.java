package boardPkg.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //jdbc드라이버 로딩
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, passwd); //연결시도
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
