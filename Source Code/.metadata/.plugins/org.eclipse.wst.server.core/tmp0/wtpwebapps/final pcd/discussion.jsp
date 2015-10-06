<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ include file="/taglibs.jsp"%>
 <%@page import="DAO.*"%>
<%@page import="java.util.*"%>
<%@page import="Domain.*"%>
<% ForumBeanManager fbm = new ForumBeanManager(); %>
 
<stripes:layout-render name="/style.jsp" title="Register">
<stripes:layout-component name="contents">
<table >
<tr>
<td >

<fieldset style="width: 480px;        height: 260px;        overflow: auto;"> 
  <legend>Discussion instantannée</legend>
  
  <%
   List<Discussion> discs=  fbm.listerDiscussion();

 for (Discussion d : discs ){
	 
	 Utilisateur util = fbm.getuseerbyid((int)d.getSender());
	 out.println("<table><tr><td> + "+util.getPseudo() +" : </td> <td> "+d.getMsg()+"</td></tr><tr><td></td><td> vu à "+d.getDate()+"</td></tr></table><hr>");
	
	
 }
 
 %>
  
  
 </fieldset>

</td>
<td  >
<fieldset style="width:100px;        height: 260px;        overflow: auto;">
 <legend>Liste connecté</legend>
 <%
 
 List<UtilisateurConnecter> Users=  fbm.listeruserConnecter();
 for (UtilisateurConnecter u : Users ){
	 Utilisateur uc=(Utilisateur)session.getAttribute("user");
	 if(u.getMail() != uc.getMail()){
	 out.println(" + <stripes:form beanclass='Controllers.DiscussionActionBean' method='post'> <input type='hidden' name='receiver' value='"+u.getIdUtilisateur()+"' /><input type='submit' name='btn_sub' value='"+u.getPseudo()+"' /></stripes:form><br>");
	 }
 }
 
 
 
 
 
 %>

</fieldset>
</td>
</tr>
<tr>


<td >	<stripes:form beanclass="Controllers.DiscussionActionBean" focus="">
			<center>
				<div>
					<table>
						
						<tr>
							<td>message :</td>
							<td><stripes:password name="msg" /><stripes:errors field="pass"/></td>
						
						
	            			<td>
	                			<stripes:submit name="connect" value="Envoyer" />
	           				 </td>
	       				</tr>
					</table>
				</div>
				</center>
			</stripes:form>
</td>

<td>
</td></tr>


</table>
</stripes:layout-component></stripes:layout-render>