<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp"%>

<%
	// Scriplet < %  ...   % >
	// varias sentencias 
	String nombre = "pepe";
	String hora = "10:78";
	
	//Lanza adrede un NullPointerException y nos mostrara una pagina error
	
	String nulo=null;
	nulo.length();
	
	

%>

<h2>Hello <%=nombre%></h2>
<p><%=hora%></p>

<a href="generar-mesa"> ¿Quieres Comprar una Mesa ?</a>


<jsp:include page="templates/footer.jsp"></jsp:include>