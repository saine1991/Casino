
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>

<c:url value="/" var="mainURL"/>
<c:url value="/people-generator" var="peoplegeneratorURL"/>
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
        <li><a href="${peoplegeneratorURL}">People generator</a></li>
        <li><a href="${casinoURL}">Casino</a></li>
	
        
      </ul>
    </div><!-- /.navbar-collapse -->
	</div><!-- /. row-collapse -->
	</div><!-- /.container -->
	</nav>

	<div class="container">
		<table>
		<tr>
		<th>First name</th>
		<td><%=request.getAttribute("ownerFirstName")%></td>
	</tr>
	<tr>
		<th>Last name</th>
		<td><%=request.getAttribute("ownerLastName")%></td>
	</tr>
	<tr>
		<th>Age</th>
		<td><%=request.getAttribute("ownerAge")%></td>
	</tr>
	<tr>
		<th>Days left to birthday</th>
		<td><%=request.getAttribute("daysLeft")%></td>
	</tr>
	</table>
</div>

<div class="container footer2">
	<footer class="footer3">
	<p>By @Adam Skimina 2017</p>
	</footer>
	</div>

</div>
	
</body>
</html>