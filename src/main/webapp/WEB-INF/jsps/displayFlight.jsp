<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flight</title>
</head>
<body>
<h3>Search Flight </h3>
<table border="1">

<tr>
<th>Airlines</th>
<th>DepartureCity</th>
<th>ArrivalCity</th>
<th>DepartureTime</th>
<th>Select Flight</th>
</tr>
<c:forEach var="d" items="findFlights">

<tr>
<td>${d.operatingAirlines}</td>
<td>${d.departureCity}</td>
<td>${d.arrivalCity}</td>
<td>${d.estimatedDepartureTime}</td>
</tr>
</c:forEach>

</table>
</body>
</html>