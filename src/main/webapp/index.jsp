<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addZlecenie" name="Dodaj Zlecenie">
Podaj date Wysylki:<input type="date" id="start" name="dataWysylki">
Podaj id Zlecenia: <input type="text" name="id"><br>
Podaj id Wykrojnika: <input type="text" name="idWykrojnika"><br>
Podaj Szerokosc Materialu: <input type="text" name="szerokoscSurowca"><br>
Podaj Priorytet 1-10: <input type="text" name="priorytet"><br>
Podaj Ilosc Etykiet <input type="text" name="iloscEtykiet"><br>
Podaj gilze: <input type="text" name="gilza"><br>
Podaj numer Etykiety: <input type="text" name="numerEtykiety"><br>
Podaj nazwe Etykiety: <input type="text" name="nazwaEtykiety"><br>
Podaj nazwe Klienta: <input type="text" name="nazwaKlienta"><br>
Podaj numer Maszyny: <input type="text" name="maszyna"><br>
Podaj rodzaj Surowca: <input type="text" name="rodzajSurowca"><br>
Wystawil: <input type="text" name="wystawil"><br>
Podaj kolory:<input type="text" name="kolory"><br>
<input type="submit" value="Dodaj do bazy">
</form>
<br>
<br>
<form action="getZlecenia">
<input type="submit" value="Pokaz zlecenia">
</form>
</body>
</html>		