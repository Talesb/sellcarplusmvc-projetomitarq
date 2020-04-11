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

<title>caminhao</title>
</head>

<body>
	<div class="container-fluid">
		<a href="/veiculo/caminhoes" class="btn btn-light mb-2"> Voltar</a>
		<form action="/veiculo/caminhao" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Nome</label> <input type="text"
					class="form-control" id="nome" name="nome"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Ano</label> <input type="number"
					class="form-control" id="ano" name="ano"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Cor</label> <input type="text"
					class="form-control" id="cor" name="cor"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Potencia</label> <input
					type="number" class="form-control" id="potencia" name="potencia"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Preco</label> <input type="number"
					class="form-control" id="preco" name="preco"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Marca</label> <input type="text"
					class="form-control" id="marca" name="marca"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Tara</label> <input type="number"
					class="form-control" id="tara" name="tara"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Lotacao</label> <input type="number"
					class="form-control" id="lotacao" name="lotacao"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Peso bruto total</label> <input
					type="number" class="form-control" id="pesoBrutoTotal"
					name="pesoBrutoTotal" aria-describedby="emailHelp">
			</div>



			<button type="submit" class="btn btn-primary">Cadastrar</button>
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