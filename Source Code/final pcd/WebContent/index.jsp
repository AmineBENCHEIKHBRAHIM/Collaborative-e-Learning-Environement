<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="EN" lang="EN" dir="ltr">
<head profile="http://gmpg.org/xfn/11">
<title>Site d'e-learning ENSI</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>
</head>
<body>

<div class="wrapper col0">
  <div id="topbar">
    <div id="slidepanel">
      <div class="topbox">
        <h2>Apprendre la g�nie logicielle <br> <center>en ligne</center></h2>
        <p>Bienvenue � notre environnement d'apprentissage collaboratif o� vous allez avoir l'opportunit� d'acqu�rir de nouvelles connaissances en g�nie logiciel,d'�tre en contact avec vos professeurs et vos amis.</p>
       
      </div>
     
  
		<div class="topbox last">
		<h2>Sign Up</h2>
		<form action="Register" method="post">
		<fieldset>
		<legend>Sign Up</legend>
		
		 <label for="signname">Username:
              <input type="text" name="username" id="username" value="" />
            </label>
            <label for="signpass">Password:
              <input type="password" name="pass" id="pass" value="" />
            </label>
            <label for="signmail">mail:
			 <input type="text" name="email" id="email" value=""/>
			 </label>
			 
			 <label for="signnom">nom:
			 <input type="text" name="nom" id="nom" value=""/>
			 </label>
			 <label for="signprenom">prenom:
			 <input type="text" name="prenom" id="prenom" value=""/>
			 </label>
			 
			
            <p>
              <input type="submit" name="pupillogin" id="pupillogin" value="submit" />
              &nbsp;
              <input type="reset" name="pupilreset" id="pupilreset" value="Reset" />
			  
            </p>
          </fieldset>
        </form>
      </div>
	      <div class="topbox last">
        <h2> Login</h2>
        <form action="ValidateLogin" method="post">
          <fieldset>
            <legend>Login Form</legend>
            <label for="pupilname">Username:
              <input type="text" name="username" id="username" value="" />
            </label>
            <label for="pupilpass">Password:
              <input type="password" name="pass" id="pass" value="" />
            </label>
            <label for="pupilremember">
              <input class="checkbox" type="checkbox" name="pupilremember" id="pupilremember" checked="checked" />
              Remember me</label>
            <p>
              <input type="submit" name="pupillogin" id="pupillogin" value="Login" />
              &nbsp;
              <input type="reset" name="pupilreset" id="pupilreset" value="Reset" />
			  
            </p>
			
          </fieldset>
        </form>
		</div>
	  
	  
      <br class="clear" />
    </div>
    <div id="loginpanel">
      <ul>
        <li class="left">Login ici  &raquo;</li>
        <li class="right" id="toggle"><a id="slideit" href="#slidepanel">Administration</a><a id="closeit" style="display: none;" href="#slidepanel">Close Panel</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col1">
  <div id="header">
    <div id="logo">
      <h1><a href="#">Site d'aprentissage de GL � l'ENSI</a></h1>
      <p>bienvenue � la meilleure �cole d'informatique en tunisie</p>
    </div>
    <div id="topnav">
      <ul>
        <li class="active"><a href="index.html">Acceuil</a></li>
		<li><a href="#"></a></li>
        
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <div id="featured_slide">
    <div class="featured_box"><a href="#"><img src="images/demo/11.jpg" alt="" /></a>
      <div class="floater">
        <h2>1. Pr&eacute;sentation g&eacute;n&eacute;rale </h2>
        <p>Bienvenue Cher ENSIEN !!</p>
        <p>L'ENSI est l'&eacute;cole d'informatique la plus prestigieuse de la Tunisie.Vous &ecirc;tes tr&egrave;s chanceux de pouvoir y acc&eacute;der. </p>
        <p>Vous devez profiter &agrave; fond de ces 3 ann&eacute;es pour vous former aussi bien techniquement et associativement .</p>
        <p class="readmore"><a href="#">Continuer Lecture  &raquo;</a></p>
      </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/01.jpg" alt="" /></a>
      <div class="floater">
        <h2>2. Cursus Universitaire</h2>
        <p>Le cursus universitaire � l'ENSI s'�tale sur 6 semestres : 3 semestres de tronc commun , 2 semestre de sp�cialit� et un semestre de stage PFE.</p>
        <p class="readmore"><a href="#">Continuer Lecture &raquo;</a></p>
      </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/02.jpg" alt="" /></a>
      <div class="floater">
        <h2>3. Coop�rations</h2>
        <p>L'ENSI,profitant de son statut hautement reconnu � l'�chelle internationale, a su nouer un r�seau de coop�rations avec les plus prestigieuses �coles fran�aises : 
		* Des doubles diplomations avec l'Ecole centrale de Lille et l'�cole t�l�com sud paris.
		* Des mast�res avec l'ENSIMAG et l'ENSEIRB</p>
        <p class="readmore"><a href="#">Continuer Lecture &raquo;</a></p>
      </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/04.jpg" alt="" /></a>
      <div class="floater">
        <h2>4. Vie Associative</h2>
        <p>L'ENSI abrite un r�seau de Clubs tr�s actif.Citons Netlinks,ENSI JUNIOR ENTREPRISE,CLUB MUSIQUE,CLUB MICROSOFT,CLUB OPENSOURCE,CLUB SECURITE, et la liste est longue.Ces clubs participent � la r�alisation d'�v�nements et proposent des formations � leur membres.</p>
        <p class="readmore"><a href="#">Continuer Lecture &raquo;</a></p>
      </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/03.jpg" alt="" /></a>
      <div class="floater">
        <h2>5. Visite Virtuelle</h2>
        <p>Cette partie sera disponible d�s que le projet Netlinks : Visite virtuelle ENSI sera termin�.Veuillez ne pas perdre patience.</p>
        <p class="readmore"><a href="#">Continuer Lecture &raquo;</a></p>
      </div>
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
  <div id="homecontent">
    <div class="fl_left">
      <div class="column2">
        <ul>
          <li>
            <h2>ENSI en Bref </h2>
            <div class="imgholder"><img src="images/demo/15.jpg" alt="" width="240" height="130"/></div>
            <p>L'&eacute;cole a &eacute;t&eacute; cr&eacute;&eacute;e en 1984 par le d&eacute;cret N&deg;13 du 18 septembre 1984 pour former des ing&eacute;nieurs<br />
            et pour contribuer &agrave; la recherche scientifique.</p>
            <p>Formation de haut niveau scientifique et technologique flexible et orient&eacute;e vers le march&eacute; de l'emploi tant national qu'international.</p>

          </li>
          <li class="last">
            <h2>ENSI de Demain </h2>
            <div class="imgholder"><img src="images/demo/17.png" alt="" width="240" height="130"/></div>
            <p>5 Sp�cialit�s seront offerts aux �tudiants de l'ENSI:</p>
            <p>* ILSI </p>
			<p>* IF</p>
			<p>* RSR</p>
			<p>* SLE</p>
			<p>* II</p>
			<p>* ISID</p>
            
          </li>
        </ul>
        <br class="clear" />
      </div>
      <div class="column2">
        <h2>Pour plus d'infos � propos de l'ENSI !</h2>
        <img class="imgl" src="images/demo/16.jpg" alt="" height="100" width="100"/>
        <p>Pour obtenir plus d'infos � propos de l'�cole nationale des sciences de l'informatique : </p>
        <p>Veuillez visiter le site officiel de l'ENSI :</p><p> <a href="http://www.ensi.rnu.tn">www.ensi.rnu.tn</a></p>
        <p>Vous �tes le bienvenue parmi nous !!</p>
       
      </div>
    </div>
 

</body>
</html>
