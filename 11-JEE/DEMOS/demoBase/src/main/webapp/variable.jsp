<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 10/06/2025
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="leprenom" class="java.lang.String" scope="request"/>
<jsp:useBean id="lesprenoms" type="java.util.ArrayList<java.lang.String>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>affichage des variable</h1>

<h2> Bonjour ${lenom}  , ${leprenom}</h2>


<% for (String p : lesprenoms) { %>
    <h2><%= p %></h2>
    <p> <%= new Date() %> </p>
    <p> <%= LocalDateTime.now() %> </p>
<% } %>

<%@include file="WEB-INF/madiv.jsp"%>

</body>
</html>
