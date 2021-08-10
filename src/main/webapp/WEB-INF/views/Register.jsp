<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navlink.jsp"></jsp:include>
<div>
<s:form action="${pageContext.request.contextPath}/user/add" method="post" modelAttribute="user">
  <div class="mb-3">
  <s:input path="userid" placeholder="Enter UserName" class="form-control"/>
  </div>
  <div class="mb-3">
  <s:input path="email" placeholder="Enter Email" class="form-control"/>
  </div>
  <div class="mb-3">
  <s:password path="password" placeholder="****" class="form-control"/>
  </div>
  <div class="mb-3">
  <s:input path="contact" placeholder="Enter Contact number" class="form-control" />
  </div>
  <div>
   <button type="submit" class="btn btn-success">Register</button>
   <button type="reset" class="btn btn-warning">Reset</button>
  </div>
  
  
<!--   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
   -->
 </s:form>
</div>
</body>
</html>