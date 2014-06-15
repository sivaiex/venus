<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">                                   
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        </div>
        <div class="navbar-collapse collapse">  
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/" />">Home</a></li>
            <li><a href="<c:url value="/getstarted" />">Students</a></li>
            <li><a href="<c:url value="/getstarted" />">Teachers</a></li>
           
          </ul>
        </div>   			      		 
  </div>
</div>