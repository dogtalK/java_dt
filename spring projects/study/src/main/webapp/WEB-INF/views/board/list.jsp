<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
	<title>스프링</title>
</head>
<body>
	<h1>게시판</h1>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>추천/비추천</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="board">
				<tr>
					<td>${board.bo_num}</td>
					<td><a href="<c:url value='/board/detail$&bo_num=${board.bo_num}'/>">${board.bo_title}</a></td>
					<td>${board.bo_me_id }</td>
					<td>${board.bo_views }</td>
					<td>${board.bo_up }/${board.bo_down }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>