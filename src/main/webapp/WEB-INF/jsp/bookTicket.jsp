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
</tr>
</table>
<form action="/bookTicket" name="userDetails" method="post">
<label>Username</label>
<input name="userName" type="text" /></br>
<input name="ticketId" type="hidden" value="${ticket.ticketId}" /></br>
<label>Email</label>
<input name="email" type="text"/></br>
<label>Phone</label>
<input name="phone" type="text"/></br>
<input type="submit" value="Book"> 
</form>
</body>
</html>