<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<script src="../../bootstrap/js/jspdf.debug.js"></script>
<div id="pdf">
<label>EMPSSAPAL  "AÑO DE LA CONSOLIDACION PERU"</label>
<label>===========================================================================================================================================</label>

<label>REPORTE DE PRE SUPUESTO</label>
<br>	
	<table border="8">
		<tr>TITULAR      : Jose mamani</tr>
		<br>
		<tr>FECHA        : 12/12/2015</tr>
		<br>
		<tr>DISTANCIA    : 23</tr>
	</table >
	
<br>
<center>	
	<table border="4">
		<tr>
			<td>CONCEPTO DE:</td>
			<td>UNIDAD DE MEDIDA</td>
			<td>PRECIO UNITARIO</td>
			<td>PRECIO TOTAL</td>
		</tr><tr>
			<td>Costo por Pista (incluye rotura y reposicion de pista)</td>
			<td>Tipo de Pista</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por Excavacion</td>
			<td>Agua</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por Cama de apoyo</td>
			<td>Agua</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por diametros tendido tuberia</td>
			<td>diametro</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por caja medidor</td>
			<td>diametro</td>
			<td>precio unitario</td>
			<td>precio unitario</td>
		</tr>
		<tr>
			<td>Costo por empalme a red</td>
			<td>diametro && tipo de red</td>
			<td>precio unitario</td>
			<td>precio unitario</td>
		</tr>
		<tr>
			<td>Costo por relleno y compactacion</td>
			<td>Agua</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por eliminacion de material excedente</td>
			<td>Agua</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td>Costo por Prueba hidrahulica</td>
			<td>Agua</td>
			<td>precio unitario</td>
			<td>precio unitario por cantidad</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>Costo Total</td>
			<td>23121</td>
		</tr>
	</table>

</div>
</center>
<br>
<br>
<br>
<button  class="btn btn-primary" onclick="demoFromHTML()">Descargar</button>

<div id="bypassme"></div>

<script>
	function demoFromHTML() {
		var pdf = new jsPDF('p', 'pt', 'letter');
		// source can be HTML-formatted string, or a reference
		// to an actual DOM element from which the text will be scraped.
		source = $('#pdf')[0];

		// we support special element handlers. Register them with jQuery-style 
		// ID selector for either ID or node name. ("#iAmID", "div", "span" etc.)
		// There is no support for any other type of selectors 
		// (class, of compound) at this time.
		specialElementHandlers = {
			// element with id of "bypass" - jQuery style selector
			'#bypassme' : function(element, renderer) {
				// true = "handled elsewhere, bypass text extraction"
				return true
			}
		};
		margins = {
			top : 80,
			bottom : 60,
			left : 40,
			width : 522
		};
		// all coords and widths are in jsPDF instance's declared units
		// 'inches' in this case
		pdf.fromHTML(source, // HTML string or DOM elem ref.
		margins.left, // x coord
		margins.top, { // y coord
			'width' : margins.width, // max width of content on PDF
			'elementHandlers' : specialElementHandlers
		},

		function(dispose) {
			// dispose: object with X, Y of the last line add to the PDF 
			//          this allow the insertion of new lines after html
			pdf.save('asdasd.pdf');
		}, margins);
	}
</script>