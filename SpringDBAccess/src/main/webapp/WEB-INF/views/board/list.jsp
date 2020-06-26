<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${bList.size() <= 0}">
		<p>게시물이 존재하지 않습니다.</p>
	</c:if>
	
	<c:if test="${bList.size() > 0}">

	<h2>게시글 목록</h2>
	
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>비고</td>
		</tr>
		
		<%-- 컨트롤러가 가져온 게시글 데이터를 반복해서 출력하세요. --%>
		<%-- 게시글 갯수가 0개일 경우 목록 대신 "게시물이 존재하지 않습니다." 출력 --%>
		<%-- 비고란에는 [삭제] 글만 써놓으세요. --%>
		<c:forEach var="article" items="${bList}">
			<tr>
				<td>${article.boardNo}</td>
				<td>
					<a href="/db/board/content?boardNo=${article.boardNo}">${article.title}</a>
				</td>
				<td>${article.writer}</td>
				<td>
					<a href="/db/board/delete?boardNo=${article.boardNo}">[삭제]</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<br>
	
	<form action="/db/board/searchList">
		<input type="text" name="keyword" placeholder="작성자 이름을 입력하세요.">
		<input type="submit" value="검색">
	</form>
	
	</c:if>
	
	<p>
		<a href="/db/board/write">게시글 작성하기</a>
	</p>

</body>
</html>