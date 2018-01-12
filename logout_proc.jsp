<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	//1.브라우저와 연결된 세션 객체 종료
	session.invalidate();

	//2.세션 종료후, 메인화면 이동
	response.sendRedirect("login.jsp");
	
%>