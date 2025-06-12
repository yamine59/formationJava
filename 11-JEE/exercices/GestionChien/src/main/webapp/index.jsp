<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="cssImport.jsp"%>
</head>
<body>

</h1>
<br/>
<div class="container">
    <div class="">
        <div class="col-md-12 d-flex justify-content-center flex-column gap-5">
            <h1 class="text-center">Bienvenue sur la gestion des chiens</h1>
            <a href="${pageContext.request.contextPath}/dog/create" class="btn btn-outline-success">Ajouter un chien</a>
            <a href="${pageContext.request.contextPath}/dog/list" class="btn btn-outline-info">Liste des chiens</a>
        </div>
    </div>
</div>
</body>
</html>