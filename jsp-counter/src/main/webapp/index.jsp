<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.InetAddress"%>
<%
  Integer counter = (Integer) session.getAttribute("counter");
  counter = (counter == null ? new Integer(1) : new Integer(counter.intValue() + 1));
  session.setAttribute("counter", counter);
  
%>

<!DOCTYPE html>
<html>
<head>
  <title>Jsp Counter</title>
</head>

<body>
  <h1>Jsp Counter</h1>
<p>SessionID:<font size=+3><%=session.getId()%></font></p>
<p>Host:<font size=+3><%=InetAddress.getLocalHost().getHostAddress()%></font></p>
<p>Counter:<font size=+3><%=counter%></font></p>
</body>
</html>
