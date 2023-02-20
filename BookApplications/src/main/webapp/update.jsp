<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Application</title>
</head>
<body bgcolor = "orange">
<br><br><br>
<h1 align="center">Welcome to Book Application</h1>
<br><br><br>
<h2 align="center">
<a href="profile.jsp"> Profile </a>
<br><br><br>
<a href="add_book.html"> Add Book </a>
<a href="view_book.html"> View Book </a>
<br><br><br>
<a href="index.html"> Logout</a></h2>
<br><br><br>
<%@page import="java.sql.*"%>
<%@page import="com.ex.*" %>
<%
Connection con=DatabaseConnection.getConnection();
int id=Integer.parseInt(request.getParameter("id"));
PreparedStatement ps=con.prepareStatement("select * from book where bkid=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if (rs.next()){
	
%>
<form action="./update_book.jsp" method="post" align="center">
<input type="hidden" name="bkid" value="<%=rs.getInt(1)%>">
<input type="text" name="book_name" value="<%=rs.getString(2)%>">
<input type="number" name="book_price" value="<%=rs.getInt(3)%>">
<input type="text" name="book_author" value="<%=rs.getString(4)%>"> 
<input type="text" name="publisher" value="<%=rs.getString(5)%>">
<input type="text" name="year" value="<%=rs.getString(6)%>">
<input type="submit" value="Update Book">
</form>
<%} %>
</body>
</html>