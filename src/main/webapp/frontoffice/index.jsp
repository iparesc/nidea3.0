<%@include file="/templates/head.jsp"%>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp"%>

<div id="login2">

  <form class="form-signin" action="login2" method="post">     

      <div class="form-label-group">
        <input type="text" class="form-control"
               name="id" 
               placeholder="id" 
               required autofocus>
               
        <label for="id">ID</label>
      </div>

      <div class="form-label-group">
        <input type="text" 
               name="usuario" 
               class="form-control" 
               placeholder="usuario" required>
               
        <label for="usuario">Usuario</label>
      </div>
     
      <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      
    </form>

</div>
