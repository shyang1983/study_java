<%@page import="com.springbook.biz.user.UserVO"%>
<%@page import="com.springbook.biz.user.impl.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	//1.사용자 입력 정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//2. DB연동 처리
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	//3. 화면 네비게이션
	if(user !=null) {				
		response.sendRedirect("getBoardList.jsp");				
	}else {
		response.sendRedirect("login.jsp");
	}
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login</title>
</head>
<body>
<center>
<h1>로그인</h1>
<hr>
<form action="login_proc.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange">아이디</td>
		<td><input type="text" name="id" /></td>
	</tr>
	<tr>
		<td bgcolor="orange">비밀번호</td>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="로그인">
		</td>
	</tr>
</table>
</form>
</center>

</body>
</html>