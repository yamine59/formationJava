<%@ page import="org.example.exchat.model.Cat" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">

<jsp:useBean id="catList" type="java.util.List<org.example.exchat.model.Cat>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body class="m-5">
<%@include file="../accueil.jsp"%>
<h4 class="text-center">Les chats</h4>
<table class="table table-striped table-hover table-centered ">
    <thead>
    <tr>
        <th scope="col">Nom</th>
        <th scope="col">Race</th>
        <th scope="col">Nourriture préférée</th>
        <th scope="col">Date de naissance</th>
    </tr>
    </thead>
    <tbody>
    <% if (catList.isEmpty()) {%>
    <tr>
        <td colspan="4" class="text-center">Aucun chat enregistré</td>
    </tr>
    <% } %>
    <% for (int i = catList.size() - 1; i >= 0; i--) {%>
    <tr>
        <td><%= catList.get(i).getName()%></td>
        <td><%= catList.get(i).getBreed()%></td>
        <td><%= catList.get(i).getFavouriteFood()%></td>
        <td><%= catList.get(i).getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%></td>
    </tr>
    <% } %>
    </tbody>
</table>

<button type="button" class="btn btn-primary w-100 text-center mt-5" onclick="window.location.href = 'add'">Ajouter un chat</button>

</body>
</html>
