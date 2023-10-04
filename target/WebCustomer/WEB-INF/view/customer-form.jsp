<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>

<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet" />
</head>
<body>

	<div id="wrapper">

		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>

		</div>

	</div>


	<div id="container">

		<h3>Save Customer</h3>

		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">
			
			<form:hidden path="id"/>

			<table>
				<tbody>
					<tr>
						<td><label>First Name </label></td>
						<td><form:input path="firstName"></form:input></td>

					</tr>


					<tr>
						<td><label>Last Name </label></td>
						<td><form:input path="lastName"></form:input></td>

					</tr>

					<tr>
						<td><label>Email Id </label></td>
						<td><form:input path="email"></form:input></td>

					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"></input></td>


					</tr>

				</tbody>



			</table>


		</form:form>
		
		<div style="clear; both;"></div>
		<p>
		
		     <a href="${pageContext.request.contextPath}/customer/list"> Back to Customer List</a>
		</p>
		
	</div>




</body>
</html>