<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Streaming</title>
    <body>
        <div class="contenu">
            <h1>${titre}</h1>
            <c:forEach items="${mesFilms}" var="monFilm">
                Film actuel : ${monFilm.titre} <a href="detail_film?id=${monFilm.id}">Detail du film</a>
                <br>
            </c:forEach>
        </div>
    </body>
</html>


