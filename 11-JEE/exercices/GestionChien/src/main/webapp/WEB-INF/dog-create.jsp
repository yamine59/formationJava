<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
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
            <form action="${pageContext.request.contextPath}/dog/create" method="post">
                <h2 class="text-center">Ajouter un chien</h2>
                <div class="mb-3">
                    <label for="name" class="form-label">Nom :</label>
                    <input type="text" id="name" class="form-control" name="name" required >
                </div>
                <div class="mb-3">
                    <label for="breed" class="form-label">Race :</label>
                    <input type="text" id="breed" class="form-control" name="breed" required>
                </div>
                <div class="mb-3">
                    <label for="birthdate" class="form-label">Date de naissance :</label>
                    <input type="date" id="birthdate" class="form-control" name="birthdate" required>
                </div>
                <div class="w-100 d-flex justify-content-end">

                <button type="submit" class="btn  btn-outline-success gap-2" >Envoyer</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
