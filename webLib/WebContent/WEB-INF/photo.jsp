<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Photos</title>

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
                        <a href="Video">Vidéos</a>
                    </li>
                    <li class="page-scroll">
                        <a href="photo">Photos</a>
                    </li>
                    <li class="page-scroll">
                        <a href="musique">Musiques</a>
                    </li>
                    <li class="page-scroll">
                        <a href="uploadRedirection">Partager</a>
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
            <div class="col-lg-12">
                    <div class="intro-text">                      
                        <span><h1>Photos</h1></span>
                        <hr class="star-light">
                    </div>
                </div>
            	<div class="col-lg-12">
            	
            		<table class="table">
	            		<tr>
	            			<td width="20%"><h4>deadpool</h4>
                 			<img src="image/wallpaper/reduite/deadpool_petite.jpg" 
                 			onmouseout="javascript:this.src='image/wallpaper/reduite/deadpool_petite.jpg'" 
                 			onmouseover="javascript:this.src='image/wallpaper/agrandi/deadpool_grande.jpg'" class="CtreTexte" /></td>
                 			<td width="30%">
	                 			<br/>
	                 			<br/>
	                 			<a href="http://localhost:8080/webLib/image/wallpaper/normale/deadpool.jpg" download="deadpool.jpg" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger l'image
	                    		</a>  
	                    		</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>		
	            		</tr>
	            		<tr>
	            			<td width="20%"><h4>marvel</h4>
	                 			<img src="image/wallpaper/reduite/marvel_petite.jpg" 
	                 			onmouseout="javascript:this.src='image/wallpaper/reduite/marvel_petite.jpg'" 
	                 			onmouseover="javascript:this.src='image/wallpaper/agrandi/marvel_grande.jpg'" class="CtreTexte" /></td>
	                 		<td width="30%">
	                 			<br/>
	                 			<br/>
	                 			<a href="http://localhost:8080/webLib/image/wallpaper/normale/marvel.jpg" download="marvel.jpg" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger l'image
	                    		</a>
	                    		    				
                 			</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>		
	            		</tr>
	            		<tr>
	            			<td width="20%"><h4>marvel</h4>
	                 			<img src="image/wallpaper/reduite/marvel2_petite.jpg" 
	                 			onmouseout="javascript:this.src='image/wallpaper/reduite/marvel2_petite.jpg'" 
	                 			onmouseover="javascript:this.src='image/wallpaper/agrandi/marvel2_grande.jpg'" class="CtreTexte" /></td>
                 			<td width="30%">
	                 			<br/>
	                 			<br/>
	                 			<a href="http://localhost:8080/webLib/image/wallpaper/normale/marvel2.jpg" download="marvel2.jpg" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger l'image
	                    		</a>      				
                 			</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>		
	            		</tr>
	            		<tr>
	            			<td width="20%"><h4>marvel</h4>
	                 			<img src="image/wallpaper/reduite/marvel3_petite.jpg" 
	                 			onmouseout="javascript:this.src='image/wallpaper/reduite/marvel3_petite.jpg'" 
	                 			onmouseover="javascript:this.src='image/wallpaper/agrandi/marvel3_grande.jpg'" class="CtreTexte" /></td>
	                 		<td width="30%">
	                 			<br/>
	                 			<br/>
	                 			<a href="http://localhost:8080/webLib/image/wallpaper/normale/marvel3.jpg" download="marvel3.jpg" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger l'image
	                    		</a>      				
                 			</td>
                 			<td width="50%"><h4>Description</h4>
                 			</td>		
	            		</tr>
	            		<tr>
	            			<td width="20%"><h4>marvel</h4>
	                 			<img src="image/wallpaper/reduite/marvel4_petite.jpg" 
	                 			onmouseout="javascript:this.src='image/wallpaper/reduite/marvel4_petite.jpg'" 
	                 			onmouseover="javascript:this.src='image/wallpaper/agrandi/marvel4_grande.jpg'" class="CtreTexte" /></td>
	                 		<td width="30%">
	                 			<br/>
	                 			<br/>
	                 			<a href="http://localhost:8080/webLib/image/wallpaper/normale/marvel4.jpg" download="marvel4.jpg" class="btn btn-xs btn-outline">
	                        	<i class="fa fa-download"></i> Télécharger l'image
	                    		</a>      				
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