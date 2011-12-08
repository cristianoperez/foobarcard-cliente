<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Cartão</h1>

<c:if test="${empty cartao}">
	No records found!
</c:if>

<c:if test="${!empty cartao}">
	<table style="border: 1px solid #333">
		<tr>
		<td style="width: 150px;">Número do cartão</td>
		<td>${cartao.numeroCartao}</td>
		</tr>
		
		<tr>
		<td>Data expiração</td>
		<td>${cartao.dataExpiracao}</td>
		</tr>
		
		<tr>
		<td>Limite</td>
		<td>R$ ${cartao.limite}</td>
		</tr>
	</table>
</c:if>

</body>
</html>