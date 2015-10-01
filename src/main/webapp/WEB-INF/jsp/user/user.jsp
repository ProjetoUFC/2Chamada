<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>

<h1>Cadastro</h1>

<form action="${linkTo[UserController].add}" method="post">
            <span>Name: </span>
            <input type="input" name="user.nome"/>
            <span>Login: </span>
            <input type="input" name="user.login"/>
            <span>Password: </span>
            <input type="input" name="user.password"/>
            <span>E-mail: </span>
            <input type="input" name="user.email"/>
            <button>Add</button>
        </form>


</body>
</html>