<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="recuperacionJsp.model.Country" %>
<%@ page import ="recuperacionJsp.Dao.CountryDao" %>
<%@ page import ="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title>Prueba</title>
</head>
<body>

	<div class="container">
		<div class="starter-template">
			<h1>Prueba</h1>
			<!-- Button -->
			<a href="login.jsp">
			<div class="form-group">
				<div class="col-md-12">
					<button id="singlebutton" name="singlebutton"
						class="btn btn-primary" style="float: right;">Login</button>
				</div>
			</div>
			</a>
			<table class="table">
				<thead>
					<tr>
						<th>Country Id</th>
						<th>Country</th>
					</tr>
				</thead>
				<tbody>
				  <%
				 	CountryDao countryDao = new CountryDao();
				    ArrayList<Country> countries = countryDao.getList();
				    for (Country country: countries){
				  %>
				  	<tr>
				  		<td><%=country.getCountry_Id()%></td>
				  		<td><%=country.getCountry()%></td>
				  	</tr>
				  <%	
				  		
				  	}
				  %>
					
				</tbody>

			</table>
		</div>
	</div>


	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.2/dist/umd/popper.min.js" integrity="sha384-q9CRHqZndzlxGLOj+xrdLDJa9ittGte1NksRmgJKeCV9DrM7Kz868XYqsKWPpAmn" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
</body>
</html>