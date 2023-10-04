<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List</title>
<link  type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" />
</head>
<body>



	<div id="wrapper">
		<div id="header">

			<h2>CRM - Customer Relation Manager</h2>
		</div>
	</div>



	<div id="container">

		<div id="content">


  <!--  Add customer button   -->
  
  <input type="button" value="Add Customer" 
   onclick="window.location.href='showFormForAdd'; return false; " class="add-button"
   />

     
			<table>

				<tr>

					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>

				</tr>
				<c:forEach var="tempCustomer" items="${customers}">

        <!-- ---    construct url with if to update and delete -->
                <c:url var="updateLink" value="/customer/showFormForUpdate">
                
                   <c:param name="customerID" value="${tempCustomer.id}"  />
                </c:url>
                <c:url var="deleteLink" value="/customer/delete">
                
                   <c:param name="customerID" value="${tempCustomer.id}"  />
                </c:url>
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${updateLink}" >Update </a>| 
						<a href="${deleteLink}" onClick="if(!(confirm('Are You sure you want to Delete this Customer'))) return false"> Delete </a>
						</td>
                        
					</tr>


				</c:forEach>









			</table>

		</div>


	</div>



</body>
</html>