<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	//1.�������� ����� ���� ��ü ����
	session.invalidate();

	//2.���� ������, ����ȭ�� �̵�
	response.sendRedirect("login.jsp");
	
%>