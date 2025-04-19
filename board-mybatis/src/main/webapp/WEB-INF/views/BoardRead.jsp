<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>OracleJava Board</title>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<script>

    

    $(function(){
        $("#buttonDelete").click(
                function() {
                    if (confirm("do you want delete?")) {
                        location.href = '<c:url value="/boardDelete?id=${board.id}"/>';    
                    }    
                });
    });

</script>

<link rel="stylesheet" type="text/css" href="<c:url value="/Style/style.css" />"/>

<style type="text/css">

    #textSubject

    {

        width: 678px;

        height: 29px;

    }

    #txtContent

    {

        height: 227px;

        width: 736px;

    }

</style>

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

        <div class="viewDocument">

            <div class="boardRead">

                <div class="title">

                    <h1>${board.subject }</h1>

                </div>

                <div class="dataAndCount">

                    <div class="date" title="등록일">

                        등록일: ${board.regdate }

                    </div>

                    <div class="readCont" title="조회수">

                        조회수: ${board.hit }

                    </div>

                </div>

                <div class="readBody">

                    ${board.content }

                </div>

            </div>

        </div>

        

        <!-- 목록, 수정/삭제버튼 -->

        <div class="contentButton">

            <a href="#" id="buttonDelete" class="button"><span>삭제</span></a>

            <a href="<c:url value="/boardUpdate?id=${board.id}"/>" class="button"><span>수정</span></a>

            <a href="<c:url value="/boardlist"/>" class="button"><span>목록</span></a>

            

        </div>

    </div>

</body>

</html>