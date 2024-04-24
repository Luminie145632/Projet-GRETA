<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire de Connexion</title>
<style>
    form {
      margin: 50px;
      font-family: Arial, sans-serif;
    }

    label {
      display: block;
      font-weight: bold;
    }

    input[type=text] {
      width: 300px;
      padding: 10px;
      border: 1px solid #ccc;
    }

    input[type=submit] {
      width: 200px;
      padding: 10px;
      background-color: #0099ff;
      color: white;
      border: none;
      cursor: pointer;
    }

    input[type=submit]:hover {
      background-color: #0077cc;
    }
  </style>
</head>
<body>
	<head>
	<center><h1>Se connecter à votre compte</h1></center>
	</head>
	<center>
    <label for="name">Login :</label>
    <br>
    <input type="text" id="name" name="login" placeholder="Taper votre login" required>
    <br>
	<br>
    <label for="password">Mot de Passe :</label>
    <br>
    <input type="password" id="password" name="password" placeholder="Taper votre mot de passe" required>
	<br>
	<br>
    <form action="/test/Controler_connecter" method="post"><input type="submit" value="Valider"></form>
    </center>
  
</body>
</html>