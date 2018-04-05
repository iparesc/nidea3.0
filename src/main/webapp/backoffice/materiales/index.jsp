<%@page import="com.ipartek.formacion.nidea.controller.backoffice.BackofficeMateriales"%>
<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp"%>

<h1>Backoffice de Materiales</h1>

<% 
//ArrayList<Material> lista=(ArrayList<Material>)request.getAttribute("materiales");
//mejor usamos EL=>Expresion Language =>${}
//Podemos usar cualquier expresion, si no hay expresion pinta la variable
%>
<% /*
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
*/%>
Buscador
<form action="backoffice/materiales" method="get">
	<input type="hidden" name="op" value="<%=BackofficeMateriales.OP_BUSQUEDA%>">
	<input type="text" name="search" required placeholder="Nombre del Material">
	<input type="submit" value="Buscar">	
</form>
<table class="table table-striped">
  <thead>
    <tr>
    
      <th scope="col">id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Precio</th>
     
    </tr>
  </thead>
  <tbody>
    
     <c:forEach items="${materiales}" var="material"> 
	<tr> 
      <td>${material.id}</td>
      <td><a href="backoffice/materiales?id=${material.id}&op=<%=BackofficeMateriales.OP_MOSTRAR_FORMULARIO%>">${material.nombre}</a></td>
      <td>${material.precio}&euro;</td>
     </tr>
      </c:forEach>
   
    
  </tbody>
</table>

<jsp:include page="/templates/footer.jsp"></jsp:include>