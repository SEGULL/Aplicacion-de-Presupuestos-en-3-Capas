<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="col-md-6">
	<br>
	<br>
	<form:form modelAttribute="Tendido" action="actualizar">
		<h2>Actualizar el precio</h2>
		<div class="form-group">
			<label for="exampleInputEmail1">Nombre del tendido</label>
			<form:input path="nombretendido" class="form-control" placeholder="nombre"
				autofocus="autofocus" />
			<label for="exampleInputEmail1">Tipo de servicio</label>
			<form:input path="tiposerviciotendido" class="form-control" placeholder="precio"
				autofocus="autofocus"/>	
			<label for="exampleInputEmail1">Precio</label>
			<form:input path="costotendido" class="form-control" placeholder="precio"
				autofocus="autofocus"/>	
		</div>
		<button type="submit" class="btn btn-primary">
		<i class="fa  fa-save"></i>                        
		Guardar cambios</button>
		<button type="reset" class="btn btn-primary">
		<i  class="fa fa-refresh"></i>
		Cancelar cambios</button>
		<form:hidden path="id" />
	</form:form>
</div>