<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<title>Questions</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="styles/global.css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>

</head>
<body BACKGROUND="images/demo/body_bg444.jpg" style="background-attachment:fixed;";>

<!-- ####################################################################################################### -->

	
		<header>
		<div class="wrapper">
			<span id="usernav"><a href="index.html">Logout</a>  <a href="profile.html">Profil</a><a href="groupes.html">groupe</a></span>
		</div>
	</header>
	
		

      <div id="comments">
	  <br>
	 
        
        <ul class="commentlist">
		<h2>Liste de questions</h2>
          <li class="comment_odd">
            <div class="author"><img class="avatar" src="images/demo/avatar.gif" width="32" height="32" alt="" /><span class="name"><a href="reponse.html">question1:</a></span> </div>
            
            <p>This is an example of a comment made on a post. You can either edit the comment, delete the comment or reply to the comment. Use this as a place to respond to the post or to share what you are thinking.</p>
          </li>
          <li class="comment_even">
            <div class="author"><img class="avatar" src="images/demo/avatar.gif" width="32" height="32" alt="" /><span class="name"><a href="reponse.html">question2:</a></span></div>
            
            <p>This is an example of a comment made on a post. You can either edit the comment, delete the comment or reply to the comment. Use this as a place to respond to the post or to share what you are thinking.</p>
          </li>
          <li class="comment_odd">
            <div class="author"><img class="avatar" src="images/demo/avatar.gif" width="32" height="32" alt="" /><span class="name"><a href="reponse.html">question3:</a></span> </div>
         
            <p>This is an example of a comment made on a post. You can either edit the comment, delete the comment or reply to the comment. Use this as a place to respond to the post or to share what you are thinking.</p>
          </li>
        </ul>
      </div>
   

      <div id="respond">
        <form action="#" method="post">
		   <h2>Proposez une question</h2>
          <p>
            <input type="text" name="name" id="name" value="" size="22" />
            <label for="name"><small>Nom</small></label>
          </p>
          
   
   
   
    <p>
            <textarea name="comment" id="comment" cols="100%" rows="10"></textarea>
            <label for="comment" style="display:none;"><small>questions</small></label>
          </p>
          <p>
            <input name="submit" type="submit" id="submit" value="Submit question" />
            &nbsp;
            <input name="reset" type="reset" id="reset" tabindex="5" value="Reset question" />
          </p>
     
     </form>
	 </div>
  <p>
       <center>   <a href="chat.html"><input name="submit" type="submit" id="submit" value="retour" style="width:130px"/></a></center>
   
   </p>




</body>
</html>
