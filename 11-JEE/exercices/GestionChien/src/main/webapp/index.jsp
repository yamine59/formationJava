<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="cssImport.jsp"%>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<div class="container">
    <div class="row">
        <div class="col-md-12 d-flex justify-content-center">
            <a href="${pageContext.request.contextPath}/dog/create" class="btn btn-outline-success">Ajouter un chien</a>
            <a href="${pageContext.request.contextPath}/dog/list" class="btn btn-outline-info mx-3">Liste des chiens</a>
        </div>
    </div>
</div>
</body>
</html>