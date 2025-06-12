<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2025
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="dog" type="org.example.gestionchien.entity.Dog" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../cssImport.jsp"%>
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6 bg-dark text-white p-4 rounded">
            <form action="${pageContext.request.contextPath}/dog/update" method="post">
                <h2 class="text-left">Modifier le chien</h2>
                <HR>
                <input type="hidden" name="id" value="<%= dog.getId() %>">
                <div class="mb-3">
                    <label for="name" class="form-label">Nom :</label>
                    <input type="text" id="name" name="name" class="form-control" value="<%= dog.getName() %>">
                </div>
                <div class="mb-3">
                    <label for="breed" class="form-label">Race :</label>
                    <input type="text" id="breed" name="breed" class="form-control" value="<%= dog.getBreed() %>">
                </div>
                <div class="mb-3">
                    <label for="birthdate" class="form-label">Date de naissance :</label>
                    <input type="date" id="birthdate" name="birthdate" class="form-control" value="<%= dog.getBirthDate() %>">
                </div>
                <div class="w-100 d-flex justify-content-between">
                    <a href="${pageContext.request.contextPath}/dog/list" class="btn btn-outline-success">Retour</a>
                    <button type="submit" class="btn btn-outline-success">Valider les modifications</button>

                </div>

            </form>


            <form action="${pageContext.request.contextPath}/dog/delete" method="post">
                <input type="hidden" name="id" value="<%= dog.getId() %>">
                <div class="w-100 d-flex justify-content-right mt-5 ">
                    <button type="submit" class="btn btn-outline-danger text-center">Supprimer le chien</button>
                </div>
            </form>
        </div>

    </div>
</div>

</body>
</html>
