<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!String class_nm = null; %>
<%!String nm = null; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

form{
margin-top: 150px;

}

div{
    border: 2px solid salmon;
	border-radius: 5px;;
	width: 600px;
	height: 700px;
	margin: auto;
	padding : 10px;
	font-size:50px;
	font-weight: bold;
}


label{
    
	display: inline-block; 
	text-align: right;
	font-size: 20px;
	margin-left: 100px;
}



#bu{
   margin-left: 200px;
}

</style>
</head>
<body>
	<%class_nm = (String)request.getAttribute("class_nm");
	if(class_nm.contains("0.0.")){
		nm = class_nm.substring(class_nm.lastIndexOf("0.0.")+1);
	}else{
		nm = class_nm.substring(class_nm.lastIndexOf(".")+1);
	}%>
	


	<form action="<%=request.getContextPath()%>/lecture/classUpdate.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="class_list" value="<%=request.getAttribute("class_list") %>">
		<input type="hidden" name="Lec_title" value="<%=request.getAttribute("Lec_title") %>">
		<input type="hidden" name="video" value="<%=request.getAttribute("video") %>">
		<div>
		이전 명칭 : <%=request.getAttribute("class_nm") %><br>
		<label>대분류</label>
		<select name="Main" >
			  <option value="1." selected>1</option>
			  <option value="2.">2</option>
			  <option value="3.">3</option>
			  <option value="4.">4</option>
			  <option value="5.">5</option>
			  <option value="6.">6</option>
			  <option value="7.">7</option>
			  <option value="8.">8</option>
			  <option value="9.">9</option>
			  <option value="10.">10</option>
			  <option value="11.">11</option>
			  <option value="12.">12</option>
		</select><br>
		
				<label>중분류</label>
		<select name="Middle" >
			  <option value="0." selected>중단원 시작</option>
			  <option value="1.">1</option>
			  <option value="2.">2</option>
			  <option value="3.">3</option>
			  <option value="4.">4</option>
			  <option value="5.">5</option>
			  <option value="6.">6</option>
			  <option value="7.">7</option>
			  <option value="8.">8</option>
			  <option value="9.">9</option>
			  <option value="10.">10</option>
			  <option value="11.">11</option>
			  <option value="12.">12</option>
		</select><br>
		
				<label>소분류</label>
		<select name="Subclass" >
			  <option value="0." selected>소단원 시작</option>
			  <option value="1.">1</option>
			  <option value="2.">2</option>
			  <option value="3.">3</option>
			  <option value="4.">4</option>
			  <option value="5.">5</option>
			  <option value="6.">6</option>
			  <option value="7.">7</option>
			  <option value="8.">8</option>
			  <option value="9.">9</option>
			  <option value="10.">10</option>
			  <option value="11.">11</option>
			  <option value="12.">12</option>
		</select><br>
		<label>단원명 및 시간대:</label> <input type="text" name="class_nm" value="<%=nm %>"><br>
		<label>동영상 :</label> <input type="file" name="file"><br>
		<input id = "bu" type="submit" value="작성완료">
		</div>
		</form>
		<br>

	<% 
	

	
	%>
</body>
</html>