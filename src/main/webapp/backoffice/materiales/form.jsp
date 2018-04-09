<%@page import="com.ipartek.formacion.nidea.controller.backoffice.BackofficeMateriales"%>
<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>

<div class="container">
	<div class="form-group row">
		<a class="btn btn-outline-dark btn-lg" href="backoffice/materiales">Volver</a>
	</div>
	<form action="backoffice/materiales" method="post">
	  <div class="form-group row">
	    <label for="id" class="col-sm-2 col-form-label">ID:</label>
	    <div class="col-sm-2">
	      <input type="text" class="form-control" name="id" readonly value="${material.id}">
	    </div>
	  </div>
	  <div class="form-group row">
	    <label for="nombre" class="col-sm-2 col-form-label">Material</label>
	    <div class="col-sm-5">
	      <input type="text" value="${material.nombre}" class="form-control" name="nombre" placeholder="Introduce el nombre del material" >
	    </div>
	  </div>
	  <div class="input-group ">
	    <label for="precio" class="col-sm-2 col-form-label">Precio</label>
	    <div class="input-group-append">
	      <input type="text" class="form-control" value="${material.precio}" name="precio" placeholder="Introduce el precio">
	      <span class="input-group-text">&euro;</span>
	    </div>
	   
	  </div>
	</div>
	<br>  
	
		<c:if test="${material.id == -1}">
		   <div class="form-group row">
			   <div class="col-sm-12">
			   	  <input type="hidden" name="op" value="<%=BackofficeMateriales.OP_GUARDAR%>"> 	
			      <button type="submit" class="btn btn-primary btn-lg btn-block">Crear</button>
			  </div>
		  </div>
		</c:if>
		  
		<c:if test="${material.id > -1}">  
			  <div class="form-group row">
			    <div class="col-sm-6">
			      <input type="hidden" name="op" value="<%=BackofficeMateriales.OP_GUARDAR%>"> 	
			      <button type="submit" class="btn btn-success btn-lg btn-block">Modificar</button>
			    </div>
			    <div class="col-sm-6">			      
			      <a href="#modalelim" 
			       class="btn btn-danger btn-lg btn-block">Eliminar</a>
			    </div>
			    <div class="modal" tabindex="-1" role="dialog" id="mymodalelim">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>Modal body text goes here.</p>
      </div>
      <div class="modal-footer">
        <a href="backoffice/materiales?id=${material.id}&op=<%=BackofficeMateriales.OP_ELIMINAR%>" 
			       class="btn btn-danger btn-lg btn-block">Eliminar</a>
			    </div>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
			    <div class="col-sm-6">			      
			      <a href="backoffice/materiales?id=${material.id}&op=<%=BackofficeMateriales.OP_ELIMINAR%>" 
			       class="btn btn-danger btn-lg btn-block">Eliminar</a>
			    </div>
			  </div>
		</c:if>	  
	</form>
</div>


<jsp:include page="/templates/footer.jsp"></jsp:include>