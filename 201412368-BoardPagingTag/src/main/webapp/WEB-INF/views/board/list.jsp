<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> //jstl : java standard tag libary
<%@taglib prefix="jk" tagdir="/WEB-INF/tags"%> //태그 라이브러리 
<html>
	<head>
		<meta charset="UTF-8">
    <!-- Bootstrap -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../../../resources/bootstrap-4.1.3-dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
		<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<c:set var="seq" value="${(page-1)*10}" scope="page"/>  //초기값
		<c:forEach var="item" items="${items}">
			<tr>
			<c:set var="seq" value="${seq+1}" scope="page"/> //반복으로 인한 증가값 seq를 1씩증가시키는 것  
				<td>${item.no}</td>
				<td>${item.writer}
				<td><a href='<c:url value="/board/read?no=${item.no}"/>'>${item.title}</a></td>
				<td>${item.content}</td>
				<td>${item.createDate}</td>
				<td>${item.readCount}</td>
			</tr>
		</c:forEach>
		</table>						
		 <jk:paging totalPageCount="${totalPageCount}" nowPage="${page}"/><br> //현재 페이지 번호를 뵤여주는 코드 ,totalpagecount,page값을 totalpagecount,nowPage에 전달 
		<a href='<c:url value="/board/create"/>'>CREATE | </a>
		<a href='<c:url value="/member/logout"/>'>LOGOUT</a>
		</div>
    <!-- Bootstrap -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="../../../resources/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script>
	</body>
</html>