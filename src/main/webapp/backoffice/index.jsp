<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp"%>

<h1>Backofiicez</h1>

<% 
//ArrayList<Material> lista=(ArrayList<Material>)request.getAttribute("materiales");
//mejor usamos EL=>Expresion Language =>${}
//Podemos usar cualquier expresion, si no hay expresion pinta la variable
%>
<ol>	
	<c:forEach items="${materiales}" var="material">
		<c:if test="${material.precio<=6}">
			<li>${material.nombre} - ${material.precio} &euro;</li>
		</c:if>
		
		<c:if test="${material.precio>6 && material.precio<25}">
			<li>${material.nombre} - <span class="text-primary">${material.precio} &euro;</span></li>
		</c:if>
		
		<c:if test="${material.precio>=25}">
			<li>${material.nombre} - <span class="text-danger">${material.precio} &euro;</span></li>
		</c:if>
		
	</c:forEach>
</ol>

<jsp:include page="/templates/footer.jsp"></jsp:include>