<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ include file="/taglibs.jsp"%>
 
<stripes:layout-render name="/style.jsp" title="Login">
<stripes:layout-component name="contents">


	<c:choose>
			<c:when test="${Controllers != null}">
				<h3>${ Controllers.erreur}</h3>
			</c:when>
			<c:otherwise>
<%
				if(session.getAttribute("Erreur") != null)
				{
%>
					<h3><%= session.getAttribute("Erreur").toString() %></h3>
<%
				}
%>
			</c:otherwise>
	</c:choose>
		<div>
		<p>Entrez nos identifiants pour accéder à votre comptre :</p>
	</div>
			<stripes:form beanclass="Controllers.LoginActionBean" focus="">
			<center>
				<div>
					<table>
						<tr>
							<td>Login :</td>
							<td><stripes:text name="pseudo" value="${Controllers.pseudo}"/><stripes:errors field="pseudo"/></td>
						</tr>
						<tr>
							<td>Mot de passe :</td>
							<td><stripes:password name="pass" /><stripes:errors field="pass"/></td>
						</tr>
	        			<tr>
	            			<td colspan="2">
	                			<stripes:submit name="connect" value="Connection" />
	           				 </td>
	       				</tr>
					</table>
				</div>
				</center>
			</stripes:form>
</stripes:layout-component>
</stripes:layout-render>