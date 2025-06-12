<%@ page import="org.example.gestionchien.entity.Dog" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../cssImport.jsp"%>
<jsp:useBean id="dogs" type="java.util.List<org.example.gestionchien.entity.Dog>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<div style="height: 90vh" class="flex justify-content-center items-center m-auto w-50 mt-5 bg-dark m-5 p-5 text-white rounded-4" >

    <div class="w-100 d-flex justify-content-between position-sticky">
        <h2 class="text-left">Liste des chiens</h2>
        <p class="text-center mt-3"><a href="${pageContext.request.contextPath}/dog/create" class="btn btn-outline-success"><i class="bi bi-plus-circle"></i> Ajouter un chien</a></p>
    </div>
    <hr>
    <style>
        ::-webkit-scrollbar {
            width: 5px;
            border-radius: 100px;
        }

        ::-webkit-scrollbar-track {
            background: #f1f1f1;
        }

        ::-webkit-scrollbar-thumb {
            background: #888;
            border-radius: 10px;
        }

        ::-webkit-scrollbar-thumb:hover {
            background: #555;
        }
    </style>
    <div style="height: 90%; overflow-y: scroll" >
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
                    <td><%= dog.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) %></td>

                    <td><a href="${pageContext.request.contextPath}/dog/detail?id=<%= dog.getId() %>" class="btn btn-outline-success"><i class="bi bi-eye"></i> Détails</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
