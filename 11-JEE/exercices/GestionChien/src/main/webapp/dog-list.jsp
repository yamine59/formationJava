<%@ page import="org.example.gestionchien.entity.Dog" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@include file="cssImport.jsp"%>
<jsp:useBean id="dogs" type="java.util.List<org.example.gestionchien.entity.Dog>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<div style="height: 80vh; overflow-y: scroll ;scrollbar-width: thin" class="flex justify-content-center items-center m-auto w-50 mt-5 bg-dark m-5 p-5 text-white rounded" >
    <h2 class="text-left">Liste des chiens</h2>
    <hr>
    <table class="table table-dark table-hover table-striped">
        <thead>
            <tr>
                <th scope="col">Nom</th>
                <th scope="col">Race</th>
                <th scope="col">Date de naissance</th>
                <th scope="col">Actions</th>
            </tr>
        </thead>
        <tbody>
            <% for (Dog dog : dogs) { %>
            <tr>
                <td><%= dog.getName() %></td>
                <td><%= dog.getBreed() %></td>
                <td><%= dog.getBirthDate() %></td>


                <td><a href="${pageContext.request.contextPath}/dog/detail?id=<%= dog.getId() %>" class=" btn btn-outline-success">Détails</a></td>
            </tr>
            <% } %>
        </tbody>
    </table>
    <div class="w-100 d-flex justify-content-end">

        <p class="text-center mt-3"><a href="${pageContext.request.contextPath}/dog/create" class="btn btn-outline-success">Ajouter un chien</a></p>
    </div>

</div>
</body>
</html>
