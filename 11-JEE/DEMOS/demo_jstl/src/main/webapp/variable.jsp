<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2025
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>La balise c:if </h3>
<c:if test="${ isTrue}">
  <p>La condition est vraie.</p>
</c:if>


<h3>La balise c:out</h3>
<p><c:out value="${nameDemo}"/></p>
<p><c:out value="string"/></p>

<h3>La balise c:forEach</h3>
<c:forEach var="prenom" items="${prenoms}" >
    <p>${prenom}</p>
</c:forEach>

<h3>La balise c:import</h3>
<c:import url="/WEB-INF/madiv.html"/>

<h3>La balise c:choose</h3>
<c:choose>
    <c:when test="${isTrue}">
        <p>La condition est vraie.</p>
    </c:when>
    <c:when test="${isFalse}">
        <p>La condition est fausse.</p>
    </c:when>
    <c:otherwise>
        <p>Aucune condition n'est vraie.</p>
    </c:otherwise>
</c:choose>

</body>
</html>
