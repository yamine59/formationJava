<%@ page import="org.example.exchat.model.Cat" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body style="display: flex; justify-content: center; align-items: center" class="m-5">
<div style="border: 1px solid black; border-radius: 10px; padding: 20px" class="w-20">
  <%@include file="../accueil.jsp"%>
  <h4 class="text-center">Ajouter un chat</h4>
  <form action="${pageContext.request.contextPath}/cat/add" method="post" class="row g-3">
    <div class="col-md-12">
      <label class="form-label">Nom :</label>
      <input type="text" name="name" class="form-control" required>
    </div>
    <div class="col-md-12">
      <label class="form-label">Sa race :</label>
      <input type="text" name="breed" class="form-control" required>
    </div>
    <div class="col-md-12">
      <label class="form-label">Sa nourriture préférée :</label>
      <input type="text" name="favouriteFood" class="form-control" required>
    </div>
    <div class="col-md-12">
      <label class="form-label">Sa date de naissance :</label>
      <input type="date" name="birthdate" class="form-control" required>

    </div>
    <div class="col-12">
      <button type="submit" class="btn btn-primary w-100 text-center" >Ajouter</button>
    </div>

  </form>
</div>

</body>
</html>
