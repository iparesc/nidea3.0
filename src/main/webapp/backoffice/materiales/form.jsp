<%@page import="com.ipartek.formacion.nidea.controller.backoffice.BackofficeMateriales"%>
<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>

SOY UN FORMULARIO 
MUY CHULO ;-P
<form>
<div class="form-group row">
			<label class="col-sm-4 col-form-label">ID</label>
			<input type="number" id="id" class="col-sm-2 form-control" value="${id_material}">
		</div>
	</form>

${material.nombre};
${material.precio};


<jsp:include page="/templates/footer.jsp"></jsp:include>