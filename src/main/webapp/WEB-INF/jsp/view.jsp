<html>
<head><title>Ticket Application</title></head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
<h2>Event listing</h2>
<table>
<c:forEach items="${events}" var="event">
<tr>
<td>${event.eventId}</td>
<td>${event.eventName}</td>
<td>${event.date}</td>
<td>${event.time}</td>
<td>${event.category}</td>
<td>${event.organizer}</td>
<td><a href="/viewTickets/${event.eventId}">View Tickets</button></td>
</tr>
</c:forEach>
</table>
</body>
</html>