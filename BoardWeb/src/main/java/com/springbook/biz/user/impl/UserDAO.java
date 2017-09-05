package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Repository("userDAO")
public class UserDAO implements UserService {

	//JDBC ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	//SQL ��ɾ�	
	private final String USER_GET 		= "select * from users where id =? and password=?";	
	
	//CRUD ����� �޼ҵ� ����	
	//ȸ�� ���
	/* (non-Javadoc)
	 * @see com.springbook.biz.user.impl.UserService#getUser(com.springbook.biz.user.UserVO)
	 */
	@Override
	public UserVO getUser(UserVO vo) {
		System.out.println("===> JDBC�� getUser() ��� ó��");
		UserVO user = null;
			
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);			
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}		
		return user;
	}
	
}
