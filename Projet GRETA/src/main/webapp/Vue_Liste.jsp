<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des comptes</title>
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
	<center><h1>Liste des comptes</h1></center>
	</head><!--  -->
	<form action="Vue_Creation.jsp" method="post">
	<input type="submit" value="Créer un nouvel utilisateur">
	</form>
	<form action="Vue_Connecter.jsp" method="post">
	<input type="submit" value="Deconnexion">
	</form>
	<center>
	<table>
		<tr>
		<th>Login</th>
		<th>Mdp</th>
		</tr>
		<tr>
		<td>login 1</td>
		<td>Mot de Passe 1</td>
		<td><form action="Vue_Modification.jsp" method="get"><input type="submit" value="Modifier"></form></td>
		<td><form action="" method="get"><input type="submit" value="Supprimer"></form></td>
		</tr>
		<tr>
		<td>login 2</td>
		<td>Mot de Passe 2</td>
		<td><form action="Vue_Modification.jsp" method="get"><input type="submit" value="Modifier"></form></td>
		<td><form action="" method="get"><input type="submit" value="Supprimer"></form></td>
		</tr>
		<tr>
		<td>login 3</td>
		<td>Mot de Passe 3</td>
		<td><form action="Vue_Modification.jsp" method="get"><input type="submit" value="Modifier"></form></td>
		<td><form action="" method="get"><input type="submit" value="Supprimer"></form></td>
		</tr>
	</table>
    </center>
  </form>
</body>
</html>