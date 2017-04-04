<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Musiques</title>

<!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Importation des polices -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    
</head>
<body id="page-top" class="index">
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
                        <a href="fiche"><img class="img-responsive" src="image/profile5.png" width="40" height="40" alt="" title="profile"></a>
                    </li>
                    <li class="page-scroll">
                        <a href="video">Vidéos</a>
                    </li>
                    <li class="page-scroll">
                        <a href="photo">Photos</a>
                    </li>
                    <li class="page-scroll">
                        <a href="musique">Musiques</a>
                    </li>
                    <li class="page-scroll">
                        <a href="upload">Partager</a>
                    </li>
                    <li class="page-scroll">
                        <a href="deconnexion"><img class="img-responsive" src="image/logout2.jpg" width="40" height="40" alt="" title="se deconnecter"></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    
    
    <header>
        <div class="container">
            <div class="row">
            	<div class="intro-text">                      
                        <span> <h1>Musiques</h1> </span>
                        <hr class="star-light">
              	</div>
            	<div class="col-lg-12">
            		
            		<table class="table">
	            		<tr>
	            			<td width="20%"><h4>rap deadpool</h4>
                 			<img class="img-responsive" src="image/musiques/deadpoolrap.jpg" width="200" height="200" alt=""></td>
                 			<td width="30%">
	                 			<a href="http://localhost:8080/webLib/musiques/deadpool1.mp3" download="rapDeadpool.mp3" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger le son
	                    		</a>
	                    		<br/>
	                    		<br/>
                 				<a class="ref">play</a>    
                 				<br/>
                 				<br/>
                 				<audio src="musiques/deadpool1.mp3" controls width="200" height="200"></audio>           				
                 			</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>
	            		</tr>
	            		<tr>
	            			<td width="20%"><h4>shoop-salt-n-pepa</h4>
                 			<img class="img-responsive" src="image/musiques/shoop_deadpool.jpg" width="200" height="200" alt=""></td>
                 			<td width="30%">
	                 			<a href="http://localhost:8080/webLib/musiques/deadpool2.mp3" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger le son
	                    		</a>
	                    		<br/>
	                    		<br/>
                 				<a class="ref">play</a>    
                 				<br/>
                 				<br/>
                 				<audio src="musiques/deadpool2.mp3" controls width="200" height="200"></audio>           				
                 			</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>
	            		</tr>
	            		<tr>
	            			<td width="20%"><h4>François Pérusse</h4>
                 			<img class="img-responsive" src="image/musiques/les2min.jpg" width="200" height="200" alt=""></td>
                 			<td width="30%">
	                 			<a href="http://localhost:8080/webLib/musiques/Achat d'un ordinateur.mp3" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger le son
	                    		</a>
	                    		<br/>
	                    		<br/>
                 				<a class="ref">play</a>    
                 				<br/>
                 				<br/>
                 				<audio src="musiques/Achat d'un ordinateur.mp3" controls width="200" height="200"></audio>           				
                 			</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>
	            		</tr>
	            		
	            	 </table>

             </div>
            <div class="col-lg-12">
             			 <hr class="star-light">
            			 <a href="bonjour"  class="btn btn-outline"><i class="fa"></i> Retour</a>
            			 
            </div>	
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