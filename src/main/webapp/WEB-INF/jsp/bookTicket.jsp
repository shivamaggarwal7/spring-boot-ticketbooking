<html>
<head><title>Book Ticket</title></head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
<h2>Tickets listing</h2>
<table>
<tr>
<td>${ticket.tktType}</td>
<td>${ticket.tktDesc}</td>
<td>${ticket.price}</td>
<td><a href="/bookEvent/${ticket.ticketId}">Book</button></td>
</tr>
</table>
</body>
</html>