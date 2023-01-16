<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSP Application</title>
</head>
<body>
<p>${time}</p>

<br>
<table>
  <%
    Date input_date = new Date();
    for(int i = 0; i < 7; i++){
      SimpleDateFormat format1=new SimpleDateFormat("dd.MM.yyyy");
      String message = format1.format(input_date);
      Date dt1=format1.parse(message);
      SimpleDateFormat format2=new SimpleDateFormat("EEEE", java.util.Locale.ENGLISH);
      String finalDay=format2.format(dt1);
      out.println("<tr><td>");
      out.println("Date:" + message);
      out.println("</td><td>");
      out.println("Day:" + finalDay);
      out.println("</td></tr>");
      Calendar cal = Calendar.getInstance();
      cal.setTime(input_date);
      cal.add(Calendar.DAY_OF_YEAR, 1);
      input_date = cal.getTime();
    }
  %>
</table>

<br>
<br>
x<br>
<%@include  file="jsp/morning.jsp" %>
<br>
<a href="afternoon">afternoon</a>
<br>
<a href="jsp/forward.jsp">Forward</a>
<br>
${servletHi}
<br>
<h5><a href="Jjj">Servlet Jjj</a></h5>

<br>
<form method="post" action="Jjj">
  <input type="submit" value="Servlet Jjj doPost">
</form>

  </body>
</html>