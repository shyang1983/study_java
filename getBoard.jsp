<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>    
 <%
//1. �˻��� �Խñ� ��ȣ ����
	String seq = request.getParameter("seq");
	
	//2.DB���� ó��
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	BoardVO board = boardDAO.getBoard(vo);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ۻ�</title>
</head>
<body>
<center>
<h1>�ۻ�</h1>
<a href="logout_proc.jsp">Log-out</a>

<!-- �˻� ���� -->
<form action="updateBoard_proc.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<td bgcolor="orange" width="70">����</td>
		<td align="left"><input name="title" type="text" value="<%=board.getTitle() %>"/></td>				
	</tr>
	<tr>
		<td bgcolor="orange" width="70">�ۼ���</td>
		<td align="left"><%=board.getWirter()%></td>				
	</tr>
	<tr>
		<td bgcolor="orange" width="70">����</td>
		<td align="left"><textarea name="content" cols="40" rows="10" ><%=board.getContent() %></textarea></td>				
	</tr>
	<tr>
		<td bgcolor="orange" width="70">�����</td>
		<td align="left"><%=board.getRegDate() %></td>				
	</tr>
	<tr>
		<td bgcolor="orange" width="70">��ȸ��</td>
		<td align="left"><%= board.getCnt() %></td>				
	</tr>
	<tr>		
		<td colspan="2" align="center"><input type="submit" value="�� ����"/></td>				
	</tr>
</table>
</form>

<hr>
<a href="insertBoard.jsp">�۵��</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="deleteBoard_proc.jsp?seq=<%=board.getSeq()%>">�ۻ���</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="getBoardList.do">�۸��</a>
</center>

</body>
</html>