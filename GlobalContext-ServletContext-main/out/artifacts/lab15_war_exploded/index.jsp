<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <p>URL1: <%=pageContext.getServletContext().getInitParameter("URL1")%></p>
  <p>URL2: <%=pageContext.getServletContext().getInitParameter("URL2")%></p

    <br>
  <p>
    <a href="./ServletFirst?urln=1">URL 1</a>
    <br>
    <br>
    <a href="./ServletFirst?urln=2" >URL 2</a>
  </p>
  <br>
  <form action="Ccc" method="post">
    <div>
      <label>Value1 <input type="text" name="Value1"/></label>
    </div>
    <br>
    <div>
      <label>Value2 <input type="text" name="Value2"/></label>
    </div>
    <br>
    <div>
      <label>Value3 <input type="text" name="Value3"/></label>
    </div>
    <br>
    <div>
      <label><input type="radio" name="CBean" value="new" />New</label>
      <label><input type="radio" name="CBean" value="old" checked/>Old</label>
    </div>
    <br>
    <input type="submit" value="Send"/>
  </form>
  </body>
</html>
