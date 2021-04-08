<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/Read_Me2.css">
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat"	rel="stylesheet" type="text/css">
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<% MemberVO memberVo = (MemberVO)session.getAttribute("mVo"); %>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
      		<div class="navbar-header">
            	<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market💻</strong></a>
      		</div>
      		<div class="collapse navbar-collapse" id="myNavbar"></div>
         		<ul class="nav navbar-nav navbar-center">
            		<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li>
            		<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">강의실</a></li>
            		<li class="dropdown">
            			<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span   class="caret"></span></a>
               			<ul class="dropdown-menu">
                  			<li><a href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2">묻고 답하기</a></li>
                  			<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
               			</ul>
               		</li>
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
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>">
						<img src = "../images/바구니.png" width = "30px;" height="25px;"/><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=1">수강바구니</a></li>
						<li><a href="<%=request.getContextPath() %>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=2">위시리스트</a></li>
					</ul>
				</li>
				<%		
					}
				%>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">소개</a></li>
						<li><a href="<%=request.getContextPath() %>/main/List_don.do">재능기부신청</a></li>
						<li><a href="#">멤버십신청</a></li>
					</ul>
				</li>
		</ul>
		</div>
	</nav>


<div class="band">
		 <img class = "rimg" alt="" src="../images/리액트.PNG">


		<div class ="content">
		 <h1 ><strong>리액트, 어디까지 써봤나요? (feat.타입 스크립트)</strong></h1><br>
		 <h2>To. 리액트 입문자와 리액트 숙련자분들께,</h2>
		 <br>
			 <p id = "content1" >Facebook, Instagram, Airbnb 등 세계적인 기업에서도 활발히 사용하고<br>
				 2013년 신생 라이브러리로 출발해 지금은 가장 인기 있는 자바스크립트 개발 라이브러리, <em><strong>'리액트'</strong></em><br>
				 <br>
				 2019년 조사에 따르면 리액트를 사용해 봤고, 앞으로도 쓸 계획이라고<br>
				 응답한 개발자가 <strong><em>71.7%</em></strong> 로, 타 라이브러리/프레임워크 대비 압도적인 비율을 차지했어요.<br>
				 작년보다도 <strong><em>6.9%</em></strong> 나 늘었구요! (링크 출처: 2019.stateofis.com)<br>
				 <br>
				 그리고, 최근 프론트엔드 개발자 사이에서 가장 핫한 언어 <strong><em>'타입스크립트'</em></strong> 까지.
				 <br>
				 끊임없이 성장하고 🌼<br>
				 가치를 증명하고 싶은 🌲<br>
				 개발자라면 배우지 않을 이유가 없어요.<br>
				 <br>
				 거두절미하고 리액트에 더 가까워지고 싶은 여러분을 위해<br>
				 <strong><em>러닝마켓의 좋은 강의</em></strong> 를 소개시켜 드릴게요!<br>
			 <br>
				 오늘도 <strong><em>"러닝마켓"</em></strong>   하세요💐<br>
		 
				 <em>From.</em>러닝마켓
		 
		 	</p>
		</div>
</div>

<div class="band2">
		<div class="content">
		<h4>리액트<strong> "입문자"</strong>  이신가요?</h4><br>
		    
			🥚🐣<br><br>
		<p id="content2"> <br>
		         초심자를 위한 핵심 강의를 듣고 <strong>기초를 단단하게 쌓아보세요.</strong><br>
			그리고, <strong>클론코딩</strong> 강의를 듣고 <strong>실전 연습</strong>을 통해<br>
			배운 이론을 여러분 진짜 지식으로 만드세요!<br><br><br>
	    </p>
		 
		<br><br>
		<hr>
		<h4>리액트<strong> "숙련자" </strong>  이신가요?</h4><br>
			🐥🐤<br><br>
		<p id="content3">
			타입스크립트에 대해 많이 들어 보셨는데<br>
			아직 도입을 안하셨나요?<br>
			특히<strong> 프로젝트 규모가 커지고, 속도를 높야야 할 때</strong> <br>
			C#이나 JAVA와 같이 타입 정의가 필수인 언어에 익숙하다면 자바스크립트에<br> 
			올인하고 싶지 않다면 타입 스크립트를 써야할 때입니다.<br>
			<strong>코드 오류를 줄이고 시간을 아끼세요!</strong>
		</p>
	
				
		 
		 
		 
		
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
				<li><a>커뮤니티</a></li>
				<li>묻고답하기</li>

			</ul>

		</div>
		<br> <br> <br>
		<hr id="hr">

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