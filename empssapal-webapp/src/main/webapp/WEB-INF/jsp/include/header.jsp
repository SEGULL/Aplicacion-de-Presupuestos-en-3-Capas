<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<c:set var="authentication" value="${sessionScope['SPRING_SECURITY_CONTEXT'].authentication}" />
<c:set var="user" value="${authentication.details}" />
	<div class="navbar navbar-fixed-top" role="navigation">
<nav class="navbar  navbar-inverse navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="<%=request.getContextPath()%>/home/dashboard.html">Resoluciones</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li <c:if test="${menuHeader eq 'docente'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/docente/dashboard.html"><i class="fa fa-users"></i> Docentes</a></li>
        <li <c:if test="${menuHeader eq 'item'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/item/dashboard.html"><i class="fa fa-indent"></i> Item</a></li>
        <li <c:if test="${menuHeader eq 'resolucion'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/resolucion/dashboard.html"><i class="fa fa-file-text"></i> Resolucion</a></li>
<%--         <li <c:if test="${menuHeader eq 'detalle'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/detalle/dashboard.html"><i class="fa fa-file-text"></i> Detalle</a></li> --%>
<%--         <li <c:if test="${menuHeader eq 'itemresol'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/itemresol/dashboard.html"><i class="fa fa-file-text"></i> Item - Resol.</a></li> --%>
        <li <c:if test="${menuHeader eq 'resolemitida'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/resolemitida/dashboard.html"><i class="fa fa-file-text"></i> Resol. - Emitida</a></li>
        
<%--            <c:forEach items="${user.roles}" var="item"> --%>
<%--              <c:if test="${item eq 'ROLE_ADMIN'}"> --%>
<%--                <li <c:if test="${menuHeader eq 'institution'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/institution/dashboard.html">Institución</a></li> --%>
<%--              </c:if> --%>
<%--            </c:forEach>               --%>
<%--            <c:forEach items="${user.roles}" var="item"> --%>
<%--              <c:if test="${item eq 'ROLE_USER'}"> --%>
<%--                <li <c:if test="${menuHeader eq 'elections'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/elections/dashboard.html">Elecciones</a></li> --%>
<%--              </c:if> --%>
<%--            </c:forEach>               --%>
<%--            <c:forEach items="${user.roles}" var="item"> --%>
<%--              <c:if test="${item eq 'ROLE_CLIENT'}"> --%>
<%--                <li <c:if test="${menuHeader eq 'voto'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/voto/dashboard.html">Voto Electronico</a></li>   --%>
<%--              </c:if> --%>
<%--            </c:forEach> --%>
      

      </ul>

      
 			<div class="col-sm-3 col-md-3 ">
		<form class="navbar-form" role="search">
		<div class="input-group">
			<input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
			<div class="input-group-btn">
				<button class="btn btn-success" type="submit"><i class="fa fa-search"></i></button>
			</div>
		</div>
		</form>
		</div>
      <ul class="nav navbar-nav navbar-right">
       
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
          	${user.userName}
           <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Configucion</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="<%=request.getContextPath()%>/logout"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
           
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
</div>