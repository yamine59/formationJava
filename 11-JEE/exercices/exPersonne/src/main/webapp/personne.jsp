<%@ page import="org.example.expersonne.entity.Personne" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 09:10
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="personnes" type="java.util.List<org.example.expersonne.entity.Personne>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>list des personnes</h1>


<table class="table table-striped">
    <thead>
    <tr>
        <th>Nom</th>
        <th>nom</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <% for (Personne p : personnes) { %>
    <tr>
        <td><%= p.getNom() %></td>
        <td><%= p.getPrenom() %></td>
        <td><%= p.getAge() %></td>
    </tr>
    <% } %>
    </tbody>
</table>


</body>
</html>
