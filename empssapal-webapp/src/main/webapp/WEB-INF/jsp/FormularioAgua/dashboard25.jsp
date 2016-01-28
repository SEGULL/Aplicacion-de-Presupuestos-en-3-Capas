<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<div class="col-md-6">
		<h2>Formulario de 25</h2>
		<div class="form-group">
			<label for="exampleInputEmail1">Titular</label>
			<input type="text" name="interesado" value="" placeholder="Nombre y Apellidos"><br><br>
			<input type="date" name="fecha" value=""><br><br>
			<label for="exampleInputEmail1">Distancia</label>
			<input type="number" name="distancia" placeholder="Distancia">
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
			<input type="text" name="diametroagua" value="1" disabled="disabled"><br><br>
			<input type="text" name="eliminacionexedente" value="1" disabled="disabled"><br><br>
			<input type="text" name="relleno" value="1" disabled="disabled"><br><br>
			<input type="text" name="camaapoyo" value="1" disabled="disabled"><br><br>
			<input type="text" name="pruebahidraulica" value="1" disabled="disabled"><br><br>
			<input type="text" name="excavacion" value="1" disabled="disabled"><br><br>
			
			
		</div>
		<button type="submit" class="btn btn-primary">Siguiente</button>

	<form:form modelAttribute="Agua" action="guardar">
	
	</form:form>
	

</div>




