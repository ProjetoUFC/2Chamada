<%@ page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Users</title>
	</head>
	<body>
		<h1>Users</h1>
		<table>
			<c:forEach items="${users}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.login}</td>
                    <td>${item.email}</td>
                    <td>${item.matriculation}</td>
                </tr>
            </c:forEach>
		</table>
		<br/>
		<form action="${linkTo[UserController].add}" method="post">
            <span>Name: </span>
            <input type="input" name="user.name"/>
            <span>Login: </span>
            <input type="input" name="user.login"/>
            <span>Password: </span>
            <input type="input" name="user.password"/>
            <span>Matriculation: </span>
            <input type="input" name="user.matriculation"/>
            <span>Login: </span>
            <input type="input" name="user.email"/>
            <button>Add</button>
        </form>
	</body>
</html>