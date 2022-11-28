<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.jcp.mvc.User "   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>   

</head>
<body>
<h1>Data is here</h1>
<table border="2" class=""thead-dark"">
<tr><td>User</td>
<td>PAss</td>
<td>cpass</td>
<td>email</td>
</tr>
<%
	HttpSession s =request.getSession();
List<User> a= (List<User>) s.getAttribute("datalist");
for(User U : a)
{
%>

<tr>
 <td><%=U.getUser() %></td>
  <td><%=U.getPass() %></td>
  <td> <%=U.getCpass() %></td>
    <td><%=U.getEmail()%></td>
    </tr>
	
<%
}

%>
</table>

</body>
</html>