<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page import="avaliacao.Modulo"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<h3 style="text-align:center">Modulos</h3>
	<br>
	<table class="table" width="50%">
		<tr>
			<th>
				Modulo
			</th>
			<th>
				Titular
			</th>
			<th>
				Auxiliar
			</th>
			<th>
				data inicio
			</th>
		</tr>
		
		<c:forEach var="modulo" items="${modulos}">
				<tr>
					<td><c:out value="${modulo.nome}"></c:out>  </td>
					<td><c:out value="${modulo.instrutorTitular}"></c:out>  </td>
					<td><c:out value="${modulo.instrutorAuxiliar}"></c:out>  </td>
					<td><c:out value="${modulo.dataInicio}"></c:out>  </td>
				</tr>
		</c:forEach>
	</table>

</body>
</html>