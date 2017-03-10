<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>

<c:url value="/owner" var="ownerURL"/>
<c:url value="/" var="mainURL"/>
<c:url value="/people-generator/generate/" var="generateURL"/>
<c:url value="/casino" var="casinoURL"/>

	<nav class="navbar navbar-default">
	<div class="container">
	<div class="row">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${mainURL}">Main Page</a>
    </div> <!-- navbar header collapse -->

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="${ownerURL}">About Me</a></li>
        <li><a href="${casinoURL}">Casino</a></li>
	
        
      </ul>
    </div><!-- /.navbar-collapse -->
	</div><!-- /. row-collapse -->
	</div><!-- /.container -->
	</nav>
	
	<div class="container">
	<div class="row">
	<form action="${generateURL}" method="post">
	How many people You want to generate?<br>
	<input type="number" id="amount" placeholder="write number" name="amount">
	<input type="submit" value="Generate">
	</form>
	</div>
	
	</div>
	
	<div class="container">
	<p><%=request.getAttribute("generatePeople")%></p><br>
	</div>
</body>
</html>