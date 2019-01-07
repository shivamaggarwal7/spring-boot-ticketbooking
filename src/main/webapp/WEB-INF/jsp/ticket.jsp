<html>
<head><title>Tickets for the event</title></head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
<h2>Tickets listing</h2>
<c:choose>
<c:when test="${not empty tickets}">
<table>
<c:forEach items="${tickets}" var="ticket">
<tr>
<td>${ticket.tktType}</td>
<td>${ticket.tktDesc}</td>
<td>${ticket.price}</td>
<c:choose>
<c:when test="${ticket.tktCount ne 0}">
	<td><a href="/bookEvent/${ticket.ticketId}">Book</button></td>
</c:when>
<c:otherwise>
	<td>No Tickets available</td>
</c:otherwise>
</c:choose>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
	No Tickets available
</c:otherwise>
</c:choose>
</body>
</html>