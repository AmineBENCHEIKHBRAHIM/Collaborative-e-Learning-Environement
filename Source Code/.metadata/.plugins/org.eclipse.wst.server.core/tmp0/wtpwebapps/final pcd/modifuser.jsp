<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@page import="DAO.ForumBeanManager"%>
<%@page import="java.util.*"%>
<%@page import="Domain.*"%>
<%@page import="java.awt.List"%>

<%
	ForumBeanManager fbm = new ForumBeanManager();
Utilisateur uCourant = (Utilisateur)session.getAttribute("user");
if(fbm.isAdmin(uCourant) == true)
{
%>

<stripes:layout-render name="/style.jsp" title="Update Membre">

<stripes:layout-component name="contents">

<jsp:useBean id="dispforum" scope="page" class="DAO.ForumBeanManager"/>



		<c:choose>
			<c:when test="${Controllers != null}">

				${Controllers.erreur}

			</c:when>
			</c:choose>
	
		<div>
			<p>Complétez les champs suivants :</p>
		</div>
		<stripes:form beanclass="Controllers.ModifActionBean" focus="">
			<div>
				<center>
					<table>
						<stripes:hidden name="iduser" id="q1" value="${Controllers.iduser}" />

						<tr>
							<td>Login/Pseudo :</td>
							<td><stripes:text name="pseudo" value="${Controllers.pseudo}" /><stripes:errors field="pseudo"/></td>
						</tr>

						<tr>
							<td>Adresse e-mail :</td>
							<td><stripes:text name="mail" value="${Controllers.mail}"/><stripes:errors field="mail"/></td>
						</tr>
						<tr>
							<td>Veuillez entrer le nouveau mots de passe</td>
							<td><stripes:password name="mdp1" value=""/></td>
						</tr>
						<tr>
							<td>Veuillez entrer le nouveau mots de passe</td>
							<td><stripes:password name="mdp2" value=""/></td>
						</tr>										
	        			<tr>
	        			
							<td>Role :</td>	 
							<td><select name="droits">
									<%									
						ArrayList<String> Droit = dispforum.listerdroit();

						for(String d : Droit){
						%>
							<option> <%=d%></option>
					
						<%}%>

								</select>
								</td>       			
	        			</tr>
	        			<tr>
	            			<td colspan="2">
	                			<stripes:submit name="edit" value="modif" />
	           				 </td>
	       				</tr>       				
					</table>
				</center>
			</div>
		</stripes:form>
	
	<a href="admin.jsp">Retour à la liste des utilisateurs</a>
	</stripes:layout-component>
	</stripes:layout-render>
<%
}
else
{
%>
<jsp:forward page="/login.jsp" />
<%
}
%>
