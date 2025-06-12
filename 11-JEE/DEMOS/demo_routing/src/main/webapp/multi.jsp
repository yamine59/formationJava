<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="pathInfo" class="java.lang.String" scope="request" />
<jsp:useBean id="prenom" type="java.lang.String" scope="request" />

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Servlet multi-routes</h1>
<p>le path info est : ${pathInfo}</p>
<p>Prenom : <%= prenom %></p>
</body>
</html>
