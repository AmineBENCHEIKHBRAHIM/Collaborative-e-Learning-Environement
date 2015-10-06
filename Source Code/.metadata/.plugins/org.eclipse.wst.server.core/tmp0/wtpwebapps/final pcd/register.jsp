<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ include file="/taglibs.jsp"%>
 
<stripes:layout-render name="/style.jsp" title="Register">
<stripes:layout-component name="contents">

		<c:choose>
			<c:when test="${Controllers != null}">
				${Controllers.erreur}
			</c:when>
			</c:choose>
	
		<div>
			<p>Complétez les champs suivants et enregistrez-vous :</p>
		</div>
		<stripes:form beanclass="Controllers.RegisterActionBean" focus="">
			<div>
				<center>
					<table>
						<tr>
							<td>Login/Pseudo :</td>
							<td><stripes:text name="pseudo" /><stripes:errors field="pseudo"/></td>
						</tr>
						<tr>
							<td>Mot de passe :</td>
							<td><stripes:password name="pass" /><stripes:errors field="pass"/></td>
						</tr>
						<tr>
							<td>Adresse e-mail</td>
							<td><stripes:text name="mail" /><stripes:errors field="mail"/></td>
						</tr>									
	        			<tr>
	        			
	            			<td colspan="2">
	                			<stripes:submit name="create" value="create" />
	           				 </td>
	       				</tr>       				
					</table>
				</center>
			</div>
		</stripes:form>

</stripes:layout-component>
</stripes:layout-render>