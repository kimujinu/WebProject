<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
    <!-- Bootstrap -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../../../resources/bootstrap-4.1.3-dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<table class="table table-striped"> <!--  -->
<thead><!-- 제목행 -->
<tr>
<th>번호</th>
<th>작성자</th>
<th>제목</th>
<th>내용</th>
<th>작성일</th>
<th>조회수</th>
</tr>
</thead>
<c:forEach var="item" items="${items}">
<tr>
<td>${item.no}</td>
<td>${item.writer}
<td><a href='<c:url value="/board/read?no=${item.no}"/>'>${item.title}</a></td>
<td>${item.content}</td>
<td>${item.createDate}</td>
<td>${item.readCount}</td>
</tr>
</c:forEach>
</table>
<a href='<c:url value="/board/create"/>'>CREATE</a>
</div>
    <!-- Bootstrap -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> <!-- jquery 링크 -->
    <script src="resources/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script> <!-- javascrpit 링크 -->
</body>
</html>

 