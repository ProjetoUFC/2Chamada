<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
	<h1>Preencha os campos</h1>
	<!-- <table>
            <c:forEach items="${user}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.matriculation}</td>
                    <td>${item.login}</td>
                    <td>${item.password}</td>
                    <td>${item.email}</td>
                </tr>
            </c:forEach>
	</table>
	<br/> -->
	<form action="${linkTo[UserController].add}" method="post">
            <span>Name: </span>
            <input type="input" name="user.name"/>
            <span>Matriculation: </span>
            <input type="input" name="user.matriculation"/>
            <span>Login: </span>
            <input type="input" name="user.login"/>
            <span>Password: </span>
            <input type="input" name="user.password"/>
            <span>e-mail: </span>
            <input type="input" name="user.email"/>
            <button>Add</button>
	 </form>
</body>
</html>