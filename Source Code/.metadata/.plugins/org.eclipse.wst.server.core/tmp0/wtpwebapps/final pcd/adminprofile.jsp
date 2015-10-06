<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<title>Profil</title>
	<link rel="stylesheet" type="text/css" href="styles/global.css" />
</head>

<body>	
	<header>
		<div class="wrapper">
			
			<span id="usernav"><a href="#">Logout</a> - <a href="#">Admin<span><img src="images/demo/user_avatar_s.jpg" /></span></a></span>
		</div>
	</header>
	
	<nav>
		<ul id="n" class="clearfix">
			
			<li class="sel"><a href="#">Profile</a></li>
			<li class="sel"><a href="groupes.jsp">groupes</a></li>
			<li class="sel"><a href="forum.jsp">Forum</a></li>
			
		</ul>
	</nav>
	
	<div id="content" class="clearfix">
		<section id="left">
			<div id="userStats" class="clearfix">
				<div class="pic">
					<a href="#"><img src="images/demo/user_avatar1.jpg" width="150" height="150" /></a>
				</div>
				
				<div class="data">
					<h1>Johnny Appleseed</h1>
					<h3>San Francisco, CA</h3>
				
					
					
			</div>
			
			<h1>About Me:</h1>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
		</section>
		
		<section id="right">
			
			
			<div class="gcontent">
				<div class="head"><h1>Friends List</h1></div>
				<div class="boxy">
					<p>Your friends</p>
					
					<div class="friendslist clearfix">
						<div class="friend">
							<a href="#"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Jerry K." /></a><span class="friendly"><a href="#">Jerry K.</a></span>
						</div>
						
						<div class="friend">
							<a href="#"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Katie F." /></a><span class="friendly"><a href="#">Katie F.</a></span>
						</div>
						
						<div class="friend">
							<a href="#"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Ash K." /></a><span class="friendly"><a href="#">Ash K.</a></span>
						</div>
						
						<div class="friend">
							<a href="#"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Sponge B." /></a><span class="friendly"><a href="#">Sponge B.</a></span>
						</div>
						
						<div class="friend">
							<a href="#"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Frank" /></a><span class="friendly"><a href="#">Frank</a></span>
						</div>
						
						<div class="friend">
							<a href="#"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Alexa S." /></a><span class="friendly"><a href="#">Alexa S.</a></span>
						</div>
					</div>
					
					<span><a href="groupe.html">See all...</a></span>
				</div>
			</div>
		</section>
	</div>
</body>
</html>