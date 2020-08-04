<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
				Inicio
			</th>
		</tr>
		
		<c:forEach var="modulo" items="${modulo}">
				<tr>
					<td><c:out value="${modulo.descNome}"></c:out>  </td>
					<td><c:out value="${modulo.descInstrutorTitular}"></c:out>  </td>
					<td><c:out value="${modulo.descInstrutorAuxiliar}"></c:out>  </td>
					<td><fmt:formatDate value="${modulo.dataInicio}" pattern="dd/MM/yyyy"/> </td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>