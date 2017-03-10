<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>

<c:url value="/owner" var="ownerURL"/>
<c:url value="/people-generator" var="peoplegeneratorURL"/>
<c:url value="/casino" var="casinoURL"/>

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
				<a class="navbar-brand" href="${ownerURL}">About me</a>
			</div>
			<!-- navbar header collapse -->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="${peoplegeneratorURL}">People generator</a></li>
					<li><a href="${casinoURL}">Casino</a></li>
					

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
		<div class="col-md-6">
			<div class="image">
				<img class="scroll"
					src="http://www.freeiconspng.com/uploads/scroll-png-0.png"
					alt="scroll">
				<h2>
					Welcome on my site</br>
					</br>You can try out tools</br>
					</br>placed in the right tabs</br>
				</h2>
			</div>
		</div>
		<div class="col-md-6">
			<div class="center">
				<img class="genie"
					src="http://vignette4.wikia.nocookie.net/disney/images/2/2f/Genie_KHREC.png/revision/latest?cb=20140609044516"
					alt="Genie">
			</div>
			<!-- center collapse -->
		</div>
	</div>
	<!-- row collapse -->
</div>
<!-- container collapse -->

<%@ include file="/WEB-INF/include/footer.jsp"%>
