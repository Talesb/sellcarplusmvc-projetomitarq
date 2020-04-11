<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>carro</title>
</head>

<body>
	<div class="container-fluid">
		<a href="/vendas" class="btn btn-light mb-2"> Voltar</a>
		<form action="/venda" method="post">
			<div class="form-group">
				<label for="exampleFormControlSelect1">Cliente:</label> <select
					class="form-control" id="exampleFormControlSelect1"
					name="clienteId">
					<c:forEach var="item" items="${clientes}">
						<option value="${item.id}">${item.nome}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Porcentagem de Desconto</label> <input
					type="number" class="form-control" name="porcentagemDesconto"
					id="porcentagemDesconto">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Data de Retirada</label> <input
					type="text" class="form-control" data-mask="00/00/0000"
					name="dataRetirada" id="dataRetirada">
			</div>



			<ul class="list-group">
				<c:forEach var="veiculo" items="${veiculos}">
					<li class="list-group-item">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="veiculoIds"
								value="${veiculo.id}" id="defaultCheck_${veiculo.id}"> <label
								class="form-check-label" for="defaultCheck_${veiculo.id}">
								${veiculo.nome}</label>
						</div>
					</li>
				</c:forEach>
			</ul>

			<!-- 			<div class="form-check"> -->
			<%-- 					<c:forEach var="veiculo" items="${veiculos}"> --%>
			<%-- 				<input class="form-check-input" type="checkbox" name="veiculoIds" value="${veiculo.id}" --%>
			<%-- 					id="defaultCheck_${veiculo.id}">  --%>
			<!-- 				<label class="form-check-label" -->
			<%-- 					for="defaultCheck_${veiculo.id}"> ${veiculo.nome}</label> --%>
			<%-- 					</c:forEach> --%>


			<button type="submit" class="btn btn-primary mt-2">Cadastrar</button>
		</form>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src='<c:url value="/js/jquery.mask.js"/>'></script>
</body>

</html>