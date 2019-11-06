<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addStudent" name="Dodaj Zlecenie">
Podaj rollno: <input type="text" name="rollno">
Podaj marks:<input type="text" name="marks">
Podaj name:<input type="text" name="name">
<input type="submit" value="Dodaj do bazy">
</form>
<br>
<br>
<form action="getStudents">
<input type="submit" value="Pokaz zlecenia">
</form>
</body>
</html>