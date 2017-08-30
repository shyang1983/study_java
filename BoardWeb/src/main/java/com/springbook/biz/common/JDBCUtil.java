package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JDBCUtil {

	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");			
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		
		if(conn !=null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				conn = null;
			}
			
		}		
		
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if(rs !=null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				rs = null;
			}
			
		}		
		
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		
		if(conn !=null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				conn = null;
			}			
		}		
		
	}
}
