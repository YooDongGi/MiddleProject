<%@page import="vo.ReplyVO"%>
<%@page import="vo.PostVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%
				PostVO postVo = (PostVO)request.getAttribute("boardView");
	%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/List_don.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="../css/List_com.css" type="text/css">

	<script>
		var board_no = "";
		$(function() {
			board_no = $("#board_no").val();
			$('#addbtn').on('click', function() {
				console.log($("#board_no").val());
				location.href='<%=request.getContextPath()%>/board/donBoardAddForm.do?board_no='+board_no;
			})
		})
		
		var id = <%= session.getAttribute("id") %>;
		$(function(){
			$('#Deletebtn').on('click', function(){
				location.href = "<%=request.getContextPath()%>/board/BoardDelete.do?board_no=<%=request.getAttribute("board_no")%>&post_no=<%=request.getAttribute("post_no")%>";
			})
			$('#Updatebtn').on('click', function() {
				location.href = "<%=request.getContextPath()%>/board/BoardUpdateForm.do?board_no=<%=request.getAttribute("board_no")%>&post_no=<%=request.getAttribute("post_no")%>";
			})
			$('#reportbtn').on('click', function() {
				$('#rpModal').modal('show');
			})
			
			$('#rpSend').on('click', function() {
				$('#rpModal').modal('hide');
				alert("신고 접수 되었습니다.");
				$('#rpform rpCont').val("");
			})
		})

	</script>
	
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<%MemberVO memberVo = (MemberVO)session.getAttribute("mVo");%>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning	Market💻</strong></a>

			</div>
			<div class="collapse navbar-collapse" id="myNavbar"></div>
			<ul class="nav navbar-nav navbar-center">
				<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li>
				<li><a href="#mylecture">강의실</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2">묻고 답하기</a></li>
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
					</ul></li>
				<%
					if(memberVo == null) {
				%>
				<li><a href="<%=request.getContextPath() %>/member/loginForm.do">마이페이지</a></li>
				<%
					} else if (memberVo.getAut() == 9){
				%>
				<li><a href="<%=request.getContextPath() %>/manager/memberList.do">관리페이지</a></li>
				<% 
					} else {
				%>
				<li><a href="<%=request.getContextPath() %>/memberInfo/mypageForm.do">마이페이지</a></li>
				<%		
					}
				%>
				<li><a href="<%=request.getContextPath() %>/main/List_don.do">재능기부</a></li>
				<%
					if(memberVo == null) {
				%>
				<li><a href="<%=request.getContextPath()%>/member/loginForm.do">로그인</a></li>
				<li><a href="<%=request.getContextPath()%>/member/joinForm.do">회원가입</a></li>
				<%
					} else {
				%>
				<li><a href="<%=request.getContextPath()%>/member/logoutForm.do">로그아웃</a></li>
				<li><a href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>">장바구니</a></li>
				<%		
					}
				%>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">공지사항</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">소개</a></li>
						<li><a href="">재능기부신청</a></li>
						<li><a href="#">멤버십신청</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
			<!-- 베너 -->

	<div id="band">
		<div class="mySlides"><br>
    	</div>
	
		<div id = "center" style="border: solid 2px green;"><br>
			
			
			<hr><span id = "abc">
				<% if(memberVo != null){ 
				if(memberVo.getMem_no() == postVo.getMem_no()) { %>
				
			<form action="<%=request.getContextPath()%>/board/donBoardUpdateForm.do" method="post" id="up">
				<input type="hidden" name="board_no" value="3">
				<input type="hidden" name="post_no" value="<%=postVo.getPost_no()%>">
				<input type="hidden" name="post_cont" value="<%=postVo.getPost_cont()%>">
				<input type="hidden" name="post_title" value="<%=postVo.getPost_title() %>">
				<input type="hidden" name="do_video" value="<%=postVo.getDo_video()%>">
				<input type="submit" value="수정"> 
			</form>
				<input type = "button" value = "삭제" id = "Deletebtn">
				<% } 
				}%>
			</span>
			<br>
			
			<hr>
			<div class = "don_cont">
			
			<h1><%=postVo.getPost_title() %></h1>
			<hr style = "border: solid 1px black;">
			작성자 : <%=postVo.getNick_name() %> &nbsp; &nbsp; &nbsp;  작성일 : <%=postVo.getPost_date() %>
			<hr>
			<%=postVo.getPost_cont()%><br><br><br><br><br><br>
			<%if(postVo.getDo_video()!=null){%>
			<div class = "don_cont">
			   <video muted autoplay loop>
      			<source src="http://192.168.42.37/Test/donvideo/<%=postVo.getDo_video()%>" type="video/mp4">
    			</video>
    			</div><br>
			<%}%>
			</div>
			
			<div id = "re">
			
			<%
				if(memberVo != null){
			%>
			<hr>
		 		<form id = "replyAddform" method = "post"  action="<%=request.getContextPath() %>/board/ReplyAdd.do?board_no=<%=request.getAttribute("board_no")%>&post_no=<%=request.getAttribute("post_no")%>" style="margin-left: 150px;">
					<h3>댓글 작성</h3>
					<input type="hidden" id="mem_no" name="mem_no" value = "<%=memberVo.getMem_no() %>"/>
		 			<textarea rows = "5" cols = "80" id = "reply_cont" name = "reply_cont"></textarea>
		 			<br><input type = "submit" value = "댓글 등록" id = "replyAdd">
				</form>
			<%	} %>
		 		<hr>
 		
			 	<h4 id = "replys">댓글 목록
			 	<table class = "BList">
			 		<tr>
			 			<th>번호</th>
						<th class = "title">내용</th>
						<th>작성자</th>
						<th>작성일</th>
						<th></th>
					</tr>
			 	<%
			 		List<ReplyVO> list = (List<ReplyVO>)request.getAttribute("replyView");
			 		int count = list.size();
			 		for(ReplyVO replyVo : list) {
			 	%>
			 		<tr>
			 			<td><%=count %></td>
			 			<td class = "title" ><%=replyVo.getReply_cont() %></td>
			 			<td><%=replyVo.getNick_name() %></td>
			 			<td class = "date"><%=replyVo.getReply_date() %>
			 			<%
							if(memberVo != null && replyVo.getMem_no() == memberVo.getMem_no()){
						%>
			 			<td class = "ox"><a href = "<%=request.getContextPath() %>/board/ReplyDelete.do?board_no=<%=request.getAttribute("board_no")%>&post_no=<%=request.getAttribute("post_no")%>&reply_no=<%=replyVo.getReply_no() %>">x</a></td>
			 			<% } else {%>
			 			<td class = "ox"></td>
			 			<% } %>
			 		</tr>
			 	<%		
			 			count--;
			 		}
			 	%>
			 	</table>
			 	</h4>
			</div>
	 	</div>
	</div>
		




	<!-- Footer -->
	<footer class="footer">
		<div class="ul">
			<ul>
				<li>러닝마켓</li>
				<li>LM소개</li>

			</ul>
		</div>
		<div class="ul">
			<ul>
				<li><a>고객센터</a></li>
				<li>이용약관</li>
				<li>개인정보취급방침</li>
			</ul>

		</div>

		<div class="ul">
			<ul>
				<li><a src="">커뮤니티</a></li>
				<li>묻고답하기</li>

			</ul>

		</div>

		<br> <br> <br> <br>
		<p class="made">
			Learning Made By <a href="https://www.w3schools.com"
				data-toggle="tooltip" title="Visit w3schools">대덕인재개발원</a>
			(주)Learning Market 사업자 정보<br> (주)Learning Market | 대표자 : 유동기
			|사업자번호 : 000-0000-0000 사업자 정보 확인 | 개인정보보호책임자 : 유동기 | 통신판매업
			:2020-중구대흥동 A-0001<br> 주소 : 대전광역시 중구 대흥동 500 영민빌딩 4층 402호 | 이메일
			: Learning Market@korea.com<br>
		</p>

	</footer>
</body>
</html>