<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>

<c:url value="/" var="mainURL" />
<c:url value="/owner" var="ownerURL" />
<c:url value="/people-generator" var="peoplegeneratorURL" />
<c:url value="/casino/hl" var="hlURL" />
<c:url value="/casino/number" var="numberURL" />

<nav class="navbar navbar-default">
	<div class="container">
		<div class="row">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${mainURL}">Main</a>
			</div>
			<!-- navbar header collapse -->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="${ownerURL}">About Me</a></li>
					<li><a href="${peoplegeneratorURL}">People generator</a></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /. row-collapse -->
	</div>
	<!-- /.container -->
</nav>

<div class="container">
	<div class="row">
		<p class="p1">Welcome to Casino!</p>
	</div>
	<div class="row">
		<p class="p2">User: <%=request.getAttribute("email")%></p>
	</div>
	<div class="row">
		<p class="p2">Coins: <%=request.getAttribute("coins")%></p>
	</div>
</div>

<div class="col-md-6">
	<!-- <div class="container"> -->
		<div class="row dice">
			<img src="${pageContext.servletContext.contextPath}/images/<%=request.getAttribute("numberRolled")%>.png">
		</div>
	<!-- </div> -->
</div>

<div class="col-md-6">
	<!-- <div class="container"> -->
		<div class="row">
		
			<p>Bet on specific number or select High/Low</p>
			<form action="${hlURL}" method="post">
			<p>Bet: </p>
			<input type="number" min="10" name="betamount1" id="betamount1" value="betamount" placeholder="min 10 coins">
				<input type="radio" name="bet" id="hl1" value="H" checked>H 
				<input type="radio" name="bet" id="hl2" value="L">L
				<input type="submit" value="Play!">
			</form>

			<form action="${numberURL}" method="post">
			<p>Bet: </p>
			<input type="number" min="10" name="betamount2" id="betamount2" value="betamount" placeholder="min 10 coins">
				<input type="number" min="1" max="6" id="number" name= "number" placeholder="1-6"
					value="number"> 
					<input type="submit" value="Play!">
			</form>

		</div>
		<div class="row">
	<p>Number rolled: <%=request.getAttribute("numberRolled")%></p><br>
	<p>Win High/Low: <%=request.getAttribute("winHL")%></p><br>
	<p>Win Number:<%=request.getAttribute("winNumber")%></p>
	</div>
	<!-- </div> -->
</div>

<%-- <div class="row">
	<p>Number rolled: <%=request.getAttribute("numberRolled")%></p><br>
	<p>Win High/Low: <%=request.getAttribute("winHL")%></p><br>
	<p>Win Number:<%=request.getAttribute("winNumber")%></p>
	</div> --%>

<%-- 
<%@ include file="/WEB-INF/include/footer.jsp"%> --%>
