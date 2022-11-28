<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%//jsp 

ArrayList<String> data = new ArrayList();
data.add("one");

out.println(data);

%>


<%! //Declaration tag (for method )
public void printMsg()
{

}
%>



</body>
</html>