<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Application</title>
</head>
<body bgcolor = "wheat">
<br><br><br>
<h1 align="center">Welcome to Book Application</h1>
<br><br><br>
<h2 align="center">
<a href="profile.jsp"> Profile </a>
<a href="index.html"> Logout</a></h2>
<br><br><br>
<table border="2" width = "200" height = "50" cellpadding = "20" align = "center"> 
<tr>
<td>Id</td><td>Name</td><td>Email</td><td>Phone</td>
</tr>
<%@page import = "java.sql.*" %>
<%@page import = "com.ex.*" %>
<%
Connection con = DatabaseConnection.getConnection();
int id=(Integer)session.getAttribute("id");
String sql = "select * from register where id=?";  
PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getString(4) %></td><td><%=rs.getInt(5) %></td>

</tr>

<%} %>

</table>   
</body>
</html>