<!-- 

1 create jsp page 
2 create servlet - processSErvlet 
3 create model class with user class 
4(dataAccess layer ) crate interface - interface DataAccess (give data  )
5 Data persisitance (jdbc code )



 -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Process" method="post">
		<input type="text" name="qu"><br><input type="submit">
	</form>
</body>
</html>