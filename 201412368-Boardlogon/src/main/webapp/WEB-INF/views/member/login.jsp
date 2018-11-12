<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="/member/loginPost">
   <input type="text" name="id" size="50">
   <input type="password" name="pwd" size="50">
   <input type="submit">
  </form>
  <br>
  <a href="/member/create">REGISTER</a>

</body>
</html>