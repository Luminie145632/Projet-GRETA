<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire de connexion</title>
</head>
<body>
    <h2>Formulaire de connexion</h2>
    <form action="controller" method="post">
        <label for="login">Login :</label>
        <input type="text" id="login" name="login" required><br>

        <label for="password">Password :</label>
        <input type="password" id="password" name="password" required><br>

        <input type="submit" value="Connexion">
    </form>
</body>
</html>