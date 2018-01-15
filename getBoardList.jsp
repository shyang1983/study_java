<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.List" %>
<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
    
 <%
	//1. ����� �Է� ���� ����
	//2. db���� ó��				
	BoardVO vo = new BoardVO();
	BoardDAO boardDAO = new BoardDAO();
	List<BoardVO> boardList = boardDAO.getBoardList(vo);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�۸��</title>
</head>
<body>
<center>
<h1>�� ���</h1>
<h3>�׽�Ʈ�� ȯ���մϴ�...<a href="logout_proc.jsp">Log-out</a></h3>

<!-- �˻� ���� -->
<form action="getBoardList.do" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<td align="right">
			<select name="searchCondition">
				<option value="TITLE">����</option>
				<option value="CONTENT">����</option>
			</select>
			<input name="searchkeyword" type="text"/>
			<input type="submit" value="�˻�" />
		</td>
	</tr>
</table>
</form>
<!-- �˻� ���� -->

<table boarder="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<th bgcolor="orange" width="100">��ȣ</th>
		<th bgcolor="orange" width="200">����</th>
		<th bgcolor="orange" width="150">�ۼ���</th>
		<th bgcolor="orange" width="150">�����</th>
		<th bgcolor="orange" width="100">��ȸ��</th>		
	</tr>
	
	<% for(BoardVO board:boardList){ %>
	<tr>
		<td><%=board.getSeq() %></td>
		<td align="left"><a href="getBoard.jsp?seq=<%=board.getSeq() %>"><%=board.getTitle() %></a></td>
		<td><%=board.getWirter() %></td>
		<td><%=board.getRegDate() %></td>
		<td><%=board.getCnt() %></td>		
	</tr>
	<%} %>
</table>
</center>

</body>
</html>