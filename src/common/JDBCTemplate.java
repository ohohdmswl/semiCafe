package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	//DB 조회 정보
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	//private 생성자
	private JDBCTemplate() {}
	
	//DB연결 객체
	private static Connection conn;
	
	//Connetion 객체 반환
	public static Connection getConnection() {
		if(conn==null) {
		try {
			//드라이버 로드
			Class.forName(DRIVER);
		
			//DB 연결
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			//AutoCommit 설정 끄기
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		
		//DB연결 객체 반환
		return conn;
	}
	
	//Connection객체 닫기
	public static void close( Connection conn ) {
		try {
			if( conn!=null && !conn.isClosed() )	conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//Statement객체 닫기
	public static void close( Statement st ) {
		try {
			if( st!=null && !st.isClosed() )	st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	//PreparedStatement객체 닫기
	public static void close( PreparedStatement ps ) {
		try {
			if( ps!=null && !ps.isClosed() )	ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//ResultSet객체 닫기
	public static void close( ResultSet rs ) {
		try {
			if( rs!=null && !rs.isClosed() )	rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//Commit수행
	public static void commit( Connection conn ) {
		try {
			if( conn!=null && !conn.isClosed() )	conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
			
	//Rollback수행
	public static void rollback( Connection conn ) {
		try {
			if( conn!=null && !conn.isClosed() )	conn.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
			
}
