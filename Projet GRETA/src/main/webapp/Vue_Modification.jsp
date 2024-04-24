<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification de compte</title>
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
	<form action="Vue_Connecter.jsp" method="post">
	<input type="submit" value="Deconnexion">
	</form>
	<head>
	<center><h1>Modification de votre compte</h1></center>
	</head>
	<form action="Vue_Liste.jsp" method="get">
	<center>
    <label for="name">Login :</label>
    <br>
    <input type="text" id="name" name="name" placeholder="Remplacement de votre ancien login">
    <br>
    <br>
    <label for="password">Mot de Passe :</label>
    <br>
    <input type="password" id="password" name="password" placeholder="Remplacement de votre ancien mot de passe" required>
	<br>
	<br>
    <input type="submit" value="Enregistrement des modifications">
    </center>
  </form>
</body>
</html>
