<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
	<title>스프링</title>
</head>
<body>
	<h1>게시글 상세</h1>
	<h3>제목 : ${board.bo_title}</h3>
	<h4>작성자 : ${board.bo_me_id}</h4>
	<h4>조회수 : ${board.bo_views}</h4>
	<hr>
	<div>${board.bo_contents}</div>
</body>
</html>