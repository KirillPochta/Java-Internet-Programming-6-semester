<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 03.04.2022
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mylib" uri="tagconf.uri" %>
<html>
<head>
  <title>Ttt</title>
</head>
<body>
<mylib:dossier>
  <div>
    <label> lastname:
      <mylib:lastname value="Kirill"/>
    </label>
  </div>
  <div style="margin-top: 10px">
    <label>
      <mylib:surname value="Pochta"/>
    </label>
  </div>

  <div style="margin-top: 10px">
    <mylib:Gender value="Male"/>
    <label>Male</label>
    <mylib:Gender value="Female"/>
    <label>Female</label>
  </div>

  <div style="margin-top: 20px">
    <mylib:submit type="submit"/>
    <mylib:submit type="reset"/>
  </div>
  <form method="post" action="Ttt">
    <input type="submit" value="Ttt">
  </form>
</mylib:dossier>
</body>
</html>
