<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Students</title>
	</head>
	<body>
		<h1>Students</h1>
		<table>
			<c:forEach items="${students}" var="item">
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
		<form action="${linkTo[StudentController].add}" method="post">
            <span>Name: </span>
            <input type="input" name="student.name"/>
            <span>Login: </span>
            <input type="input" name="student.login"/>
            <span>Password: </span>
            <input type="input" name="student.password"/>
            <span>Matriculation: </span>
            <input type="input" name="student.matriculation"/>
            <span>Login: </span>
            <input type="input" name="student.email"/>
            <button>Add</button>
        </form>
	</body>
</html>