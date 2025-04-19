<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Board</title>

<link rel="stylesheet" type="text/css" href="<c:url value='/Style/style.css' />" />


</head>

<body>

 

    <div id="container">

        <div class="boardHeader">

            <div class="boardHeaderBorder">

                <h1>게시판</h1>

            </div>

        </div>

        <div class="boardDescription">

            공지사항

        </div>

        <p>총 ${total} 건</p>

        <table cellspacing="0" summary="" class="boardList">

            <thead>

                <tr>
                    <th scope="col" class="no_line"><div>번호</div></th>
                    <th scope="col" class="title"><div>제목</div></th>
                    <th scope="col" class="date"><div>날짜</div></th>
                    <th scope="col" class="reading"><div>조회수</div></th>
                </tr>

            </thead>

            <tbody>

                <c:forEach var="board" items="${list}">

                    <tr class="bg2">
                        <td class="num">${board.id}</td>
                        <td class="title">
                            <a href="<c:url value="/boardRead?id=${board.id}"/>">${board.subject}</a>
                        </td>
                        <td class="date">${board.regdate}</td>
                        <td class="reading">${board.hit}</td>
                    </tr>

                </c:forEach>

            </tbody>

        </table>

        

		<div class="boardBottom">
		    <div class="centerButtonBox">
		        <a href="<c:url value='/boardcreate'/>" class="button"><span>쓰기</span></a>
		    </div>
		</div>


    </div>
</body>
</html>