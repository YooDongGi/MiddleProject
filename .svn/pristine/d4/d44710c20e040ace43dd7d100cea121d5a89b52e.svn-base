<%@page import="vo.PostVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

	<script>
		var board_no = "";
		$(function() {
			board_no = $("#board_no").val();
			$('#addbtn').on('click', function() {
				console.log($("#board_no").val());
				location.href='<%=request.getContextPath()%>/board/donBoardAddForm.do?board_no='+board_no;
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


	<div id="band">
		<div id="center">
			<!-- 베너 -->
			<div id="btn">
			<form action="<%=request.getContextPath()%>/board/DonBoard.do" method="post">
			</form>
			</div>
		</div>
	

	
		<div id="center">
		<div class="mySlides"><br>
	        <span class="dona">재능기부 게시판</span><br>
    	</div>
    	<%
    		if(memberVo.getAut() == 2) {
    	%>
    	<span id = "abc"><input id = "addbtn" type = "button" value = "글쓰기" ></span><br>
    	<% } %>
		<hr>

			<div class = "don_cont">

			<table class = "table table-hover">
					<thead>
					<tr>
						<th>글 번호 </th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
					</tr>
					<thead>
					<tbody>
					<%
						List<PostVO> noticelist = (List<PostVO>)request.getAttribute("list");
						int count = noticelist.size();
						
						for(PostVO postVo : noticelist){
					%>
							<tr>
								<td><%=count %></td>
								<td>
									<a href="<%=request.getContextPath()%>/board/DonBoardView.do?board_no=<%=postVo.getBoard_no() %>&post_no=<%=postVo.getPost_no()%>">
										<%=postVo.getPost_title()%>
									</a>
								</td>
								<td><%=postVo.getNick_name() %></td>
								<td><%=postVo.getPost_date() %></td>
							</tr>
					<%
							count--;
						}
					%>
					<tbody>
				</table>
			<hr/>
				
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