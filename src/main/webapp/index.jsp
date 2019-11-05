<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addStudent">
Podaj rollno: <input type="text" name="rollno">
Podaj marks:<input type="text" name="marks">
Podaj name:<input type="text" name="name">
<input type="submit" value="Dodaj do bazy">
</form>
<form action="getStudents">
<input type="submit" value="Pokaz zawartosc bazy">
</form>
</body>
</html>