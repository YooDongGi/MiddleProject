<%@page import="vo.LectureVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!String detail_cont = null; %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<style>
		div{
		    margin: 50px 100px 50px 300px;
		}
		
		form{
		   margin-left: 30px;
		   margin: 100px 50px 20px 30px;
		}
		
		label {
			display: inline-block;
			width: 200px;
			height: 30px;
			font-size: 20px;
			font-weight: bold;
		}
		
		textarea {
			height: 800px;
		}
		
		select{
		    margin-left: 5px;
		}
		
		#sub{
		margin-left: 200px;
		
		}
</style>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript"></script>
</head>
<body>
<% detail_cont = (String)request.getAttribute("detail_cont");
detail_cont = detail_cont.replaceAll("<br>","\r\n");%>
	<form action="<%=request.getContextPath()%>/lecture/lectureUpdate.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="lec_title" value="<%=request.getAttribute("Lec_title") %>">
		<input type="hidden" name="mem_no" value="<%=request.getAttribute("mem_no")%>">
		<div>
		<label>강좌명:</label> <input type="text" name="lec_nm" value="<%=request.getAttribute("lec_nm")%>"><br>
		<label>소개:</label> <input type="text" name="intro" value="<%=request.getAttribute("intro")%>"><br>
		<label>결제금액:</label><input type="text" name="price" value="<%=request.getAttribute("price")%>"><br>
		<label>강의상세내용:</label><br>
		<textarea id="story" name="detail_cont" rows="300" cols="100"><%=detail_cont%></textarea><br>
		<label>소개영상 :</label> 
		<input type="file" name="file"><br>
		<input id = "sub" type="submit" value="수정하기">
		<input type="hidden" name="preview_video" value="<%=request.getAttribute("preview_video") %>">
		</div>
	</form>
</body>
</html>