<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Board</title>

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

            <form:form modelAttribute="boardForm">

            <div class="boardRead">

                <div class="title">
                    <h1>제목: <form:input path="txtSubject" cssStyle="font-size:16px;font-weight: bold;"/></h1>
                </div>

                <div class="readBody">
                    <form:textarea path="txtContent" cssStyle="font-size: 12px;"/>
                </div>

            </div>

            <div class="contentButton">
                <a href="#" onclick="forms[0].submit();" class="button"><span>완료</span></a>
                <a href="<c:url value="/boardlist"/>" class="button"><span>취소</span></a>
            </div>

            </form:form>

        </div>

        

    </div>

</body>

</html>