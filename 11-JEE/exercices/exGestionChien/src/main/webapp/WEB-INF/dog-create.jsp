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
</head>
<body>
<div>
    <form action="dog/create" method="post">
        <label> Entrer le nom du chien
            <input type="text" name="name">
        </label>
        <label> Entrer le race
            <input type="text" name="breed">
        </label>
        <label> Entrer la date de naissance
            <input type="text" name="birthdate">
        </label>
        <button type="submit">Envoyer</button>
    </form>
</div>
</body>
</html>
