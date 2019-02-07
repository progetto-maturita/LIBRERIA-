<%-- 
    Document   : Registrazione
    Created on : 5-feb-2019, 19.43.04
    Author     : hassa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"  crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"  crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"  crossorigin="anonymous"></script>
	<title>REGISTRAZIONE</title>
    </head>
    <body>
       <header>
       </header>
        <div class="container" style="margin-top: 6%;">
            <div class="content-section">
                <form action="registrazioneNuovoUtente" method="post">
                    <div class="form-group">
                        <label for="Nome">NOME</label>
                        <input type="text" class="form-control" name="nome_txt" placeholder="INSERISCI NOME" required>
                    </div>

                    <div class="form-group">
                         <label for="Cognome">COGNOME</label>
                         <input type="text" class="form-control" name="cognome_txt" placeholder="INSERISCI COGNOME" required>
                    </div>

                    <div class="form-group">
                         <label for="Username">USERNAME</label>
                         <input type="text" class="form-control" name="username_txt" placeholder="INSERISCI USERNAME" required>
                    </div>

                    <div class="form-group">
                         <label for="Email">EMAIL</label>
                         <input type="email" class="form-control" name="email_txt" placeholder="INSERISCI EMAIL" required>
                    </div>

                    <div class="form-group">
                         <label for="data_nascita">DATA DI NASCITA</label>
                         <input type="date" class="form-control" name="data_txt" placeholder="INSERISCI DATA DI NASCITA" required>
                    </div>

                    <div class="form-group">
                         <label for="cf">CODICE FISCALE</label>
                         <input type="text" class="form-control" name="cf_txt" placeholder="INSERISCI CODICE FISCALE" required>
                    </div>

                    <div class="form-group">
                         <label for="nt">NUMERO DI TELEFONO</label>
                         <input type="text" class="form-control" name="telefono_txt" placeholder="INSERISCI NUMERO DI TELEFONO" required>
                    </div>

                    <div class="form-group">
                         <label for="psw">PASSWORD</label>
                         <input type="password" class="form-control" name="password_txt" placeholder="INSERISCI PASSWORD" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Registrati</button>
                </form>
            </div>
            </div>

    </body>
</html>
