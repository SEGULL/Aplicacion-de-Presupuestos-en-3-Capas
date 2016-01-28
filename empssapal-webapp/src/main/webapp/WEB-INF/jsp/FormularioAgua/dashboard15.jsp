<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
		
<!-- 		<button  -->
<%-- 				type="submit" href='<c:redirect>../FormularioAgua/Reporte</c:redirect>' class="btn btn-primary" >Siguiente --%>
<!-- 		</button> -->
		
      <div class="col-md-6">
			<h2>Formulario de 15</h2>
			<div class="form-group">
			<br>
			<br>
			<label for="exampleInputEmail1">Titular</label>
			<input type="text" name="interesado" value="" placeholder="Nombre y Apellidos">
			<br>
			<br>
			<input type="date" name="fecha" value="">
			<br>
			<br>
			<label for="exampleInputEmail1">Distancia</label>
			<input type="number" name="distancia" value="" placeholder="Distancia">
			<br>
			<br>
			<div class="form-group">
							<label for="exampleInputEmail1">Vereda</label> 
							<form:select path="veredas" cssClass="form-control"
 								items="${veredas}" itemLabel="nombrevere" itemValue="id"> 
 							</form:select> 
			</div>
			
			<div class="form-group">
							<label for="exampleInputEmail1">Tipo de Pista</label> 
							<form:select path="pistas" cssClass="form-control"
 								items="${pistas}" itemLabel="nombrepista" itemValue="id"> 
 							</form:select> 
			</div>
			<div class="form-group">
							<label for="exampleInputEmail1">Tipo de empalme a red</label> 
							<form:select path="empalmeres" cssClass="form-control"
 								items="${empalmeres}" itemLabel="tipoempalme" itemValue="id"> 
 							</form:select> 
			</div>
			<br>
		
			<input type="text"  name="IdDiametroAgua" value="1" disabled="disabled"><br><br>
			<input type="text"  name="IdEliminacion" value="1" disabled="disabled"><br><br>
			<input type="text"  name="IdRelleno" value="1" disabled="disabled"><br><br>
			<input type="text"  name="IdCama" value="1" disabled="disabled"><br><br>
			<input type="text"  name="IdPruebaHidraulica" value="1" disabled="disabled"><br><br>
			<input type="text"  name="IdEscavacion" value="1" disabled="disabled"><br><br>
		</div>
		<button type="submit" class="btn btn-primary" >Siguiente</button>
			<form:form modelAttribute="FormularioAgua" action="guardar" >
			</form:form>
	</div>



