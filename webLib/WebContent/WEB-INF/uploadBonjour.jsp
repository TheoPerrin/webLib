<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>uploadBonjour</title>

<!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Importation des polices -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

</head>
    <head>
        <meta charset="utf-8" />
        <title>Envoi de fichier</title>
    </head>
    <body>
    
    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
        
            <!-- Brand and toggle se regroupent pour un meilleur affichage mobile -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="#page-top">WebLib</a>
            </div>

            <!-- Regroupe les liens de navigation, ici uniquement le lien pour nous contacter -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="page-scroll">
                        <a href="Video">Vidéos</a>
                    </li>
                    <li class="page-scroll">
                        <a href="photo">Photos</a>
                    </li>
                    <li class="page-scroll">
                        <a href="musique">Musiques</a>
                    </li>
                    <li class="page-scroll">
                        <a href="UploadRedirection">Partager</a>
                    </li>
                    <li class="page-scroll">
                        <a href="deconnexion">Se déconnecter</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    
    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-text">
                        <span> <h1>Partage avec nous tes fichiers !</h1> </span>
                        <hr class="star-light">
                    </div>
                </div>

            
            <form method="post" action="UploadRedirection">
                      
               	<div class="col-lg-12">
                 		
                 		<table class="table">
                 		<tr>
                 			<td width="30%"><label for="type">Type de fichier</label></td> 
                 			<td width="40%">
                 				<select class="form-control" name="type" size="1"> 
			        			<option value="Video">Vidéo</option> 
			        			<option value="Photo">Photo</option>
								<option value="Musique">Musique</option>
								</select>
							</td>
							<td width="30%"></td>
                 		</tr>
                 		<tr>
                 			<td></td>
                 			<td><input type="submit" class="btn btn btn-success2" value="OK" class="sansLabel" /></td>
                 			<td></td>
                 		</tr>
                 		</table>
                 </div>
             </form>
        	</div>
        	<div class="col-lg-12">
        	<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
        	${form.erreurs['description']}
        	${form.erreurs['fichier']}
        	</div>
        	<div class="col-lg-12">
             			 <hr class="star-light">
            			 <a href="bonjour"  class="btn btn-outline"><i class="fa"></i> Retour</a>
            			 
       		 </div>
        </div>
    </header>  
                
   <!-- Footer -->
    <footer class="text-center">  
    <div class="footer-below">
            <div class="container">
                <div class="row"> 
                    <div class="col-lg-12">
                        Yoann & Théo WebLib 2017
                    </div>
                </div>
            </div>
        </div>
    </footer>
    
    
    
     <!-- jQuery -->
 <script src="vendor/jquery/jquery.min.js"></script>

 <!-- Bootstrap Core JavaScript -->
 <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

 <!-- Plugin JavaScript -->
 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

 <!-- Contact Form JavaScript -->
 <script src="js/jqBootstrapValidation.js"></script>
 <script src="js/contact_me.js"></script>

 <!-- Theme JavaScript -->
 <script src="js/freelancer.min.js"></script>               
                      
    </body>
</html>