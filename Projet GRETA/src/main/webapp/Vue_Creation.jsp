<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire de Cr�ation</title>
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
	<center><h1>Cr�ation du compte d'un nouvel utilisateur</h1></center>
	</head>
	<form action="/Controller_Ajout" method="post">
	<center>
    <label for="name">Login :</label>
    <br>
    <input type="text" id="name" name="login" placeholder="Cr�er votre login">
    <br>
	<br>
    <label for="password">Mot de Passe :</label>
    <br>
    <input type="password" id="password" name="password" placeholder="Cr�er votre mot de passe" required>
	<br>
	<br>
    <input type="submit" value="Valider">
    </center>
  </form>
</body>
</html>