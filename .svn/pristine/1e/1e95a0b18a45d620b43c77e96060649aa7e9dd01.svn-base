<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
	</script>
</head>
<body>
	<!-- Modal -->
	<div id="wModal" class="modal fade" role="dialog">
	  <div class="modal-dialog">

	    <!-- Modal content-->
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	        <h4 class="modal-title">장바구니 담기</h4>
	      </div>
	      <div class="modal-body">
	      	<form id="wform" method="post"  action="<%=request.getContextPath()%> /basket/basketInsert.do"> 
				<label>강의명  </label>  <input type='text' class="txt" id='name' name="writer"><br> 
				<label>제목 </label> <input	type='text' class="txt" id='subject' name="subject"><br> 
				<label>이메일 </label> <input type='text' class="txt" id='mail' name="mail"><br>
				<label>비밀번호 </label> <input type="password" class="txt" id='pass' name="password"><br>
				<label>내용 </label> <br>
				<textarea rows="10" cols="50" name="content" class="txt"></textarea><br> 
				<input type="button" value='확인' id="wsend"><br>
			</form>
	      
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	      </div>
	    </div>

	  </div>
	</div>
</body>
</html>