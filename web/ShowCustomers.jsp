<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-13
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table class="table">
    <thead>
    <tr class="d-flex">
        <th class="col-3"> Name</th>
        <th class="col-3"> Birth</th>
        <th class="col-3"> Address</th>
        <th class="col-3">Img</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items='${requestScope["customers"]}' var="customer">
    <tr>
        <td>${customer.getName()}</td>
        <td>${customer.getDateOFBirth()}</td>
        <td>${customer.getAddress()}</td>
        <td><img src="${customer.getImg()}" width="42" height="42" ></td>

    </tr>
    </c:forEach>


</table>

</body>
</html>
