<html>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center" >Welcome to Book Application</h1>
<br><br><br>
<h2 align="center">
<a href="insert">Add Book</a>
<a href="view">View Book</a>
<a href="update">Update Book</a>
<a href="delete">Delete Book</a>
</h2>
<br><br><br>
<%@page import="java.util.*"%>
<%@page import="com.ex.*" %>
<table border="2" cellpadding="20" width="400" height="200" align="center">
<tr>
<td>bkid</td><td>book_name</td><td>book_price</td><td>book_author</td><td>publisher</td><td>year</td>

<% 
List li=(List)request.getAttribute("list");
Iterator i=li.iterator();
while(i.hasNext()){
	BookApp c=(BookApp)i.next();
%>
<tr>
<td><%=c.getBkid() %></td>
<td><%=c.getBook_name() %></td>
<td><%=c.getBook_price() %></td>
<td><%=c.getBook_author() %></td>
<td><%=c.getPublisher() %></td>
<td><%=c.getYear() %></td>
</tr><tr> 
<%} %>
</table>
</body>
</html>