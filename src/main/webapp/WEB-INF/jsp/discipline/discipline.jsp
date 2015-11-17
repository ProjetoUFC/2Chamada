<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplines</title>
    </head>
    <body>
        <h1>Disciplines</h1>
        <table>
            <c:forEach items="${disciplines}" var="item">
                <tr>
                	<td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.identification}</td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <form action="${linkTo[DisciplineController].add}" method="post">
            <span>Name: </span>
            <input type="input" name="user.name"/>
            <span>Identification: </span>
            <input type="input" name="user.identification"/>
            <button>Add</button>
        </form>
    </body>
</html>
