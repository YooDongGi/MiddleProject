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
			<input type='button' value='재능기부 신청하기'
				onclick="location.href='../main/apply_don.jsp'" class="btn btn-default">
			</form>
			</div>
			<div id="btn2">
			<form action="<%=request.getContextPath()%>/board/DonBoard.do" method="post">
			<input type="hidden" name="board_no" value="3">
			<input type="submit" value="재능기부 게시판" class="btn btn-default"> 
			</form>
			</div>
		<img id="img1" src="../images/지식3.png">
		</div>

<form action="<%=request.getContextPath()%>/board/donBoardAdd.do" method="post" enctype="multipart/form-data">
	<input type="hidden" name="board_no" value="3">
	<input type="hidden" name="mem_no" value="<%=memberVo.getMem_no()%>">
제목:	<input type="text" name="post_title" class="form-control mt-4 mb-2"
		placeholder="제목을 입력해주세요." required
	>
내용:<div class="form-group">
		<textarea class="form-control" rows="10" name="post_cont"
			placeholder="내용을 입력해주세요" required
		></textarea>
	</div>
 파일 업로드:<input type="file" name="file"><br>
  

	<button type="submit" class="btn btn-secondary mb-3">입력완료</button>
</form>
		
			<div class="mySlides">

		<h2>나의 지식에 가치를 기부하세요</h2>
		<div class="dona">
			온라인 강의로만 3억원!(1년간 실 수령액)<br> 나의 지식을 나눠 사람들에게 배움의 기회를 주고, 의미있는
			대가를 가져가세요<br> Learning Market은 지식으로 의미있는 수익과 공유가 가능한 한국 유일한
			플랫폼입니다.<br> <input class="btn btn-success" type='button'
				value='재능기부 신청하기'>
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