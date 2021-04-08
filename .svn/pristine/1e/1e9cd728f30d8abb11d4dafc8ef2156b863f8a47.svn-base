<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/Read_Me.css" >
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
            			<a class="dropdown-toggle"   data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span   class="caret"></span></a>
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
<!-- 				<li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li> -->
			</ul>
		</div>
	</nav>

	<div class="band">
		<img class = "rimg" alt="" src="../images/리드미.png"> 

		

		<div id="content">
		 <h1><strong>파이썬 기초부터 인공지능의 세계로✈</strong></h1><br>
		 <p>어느 날 문득 기발한 아이디어가 떠올라서 <em>"아하!"</em> 했던 경험,  있으세요?<br>
		 생각나는 아이디어는 많지만, 막상 구현하는 건 어려워요.😥<br>
		 그러는 사이 어느새 내 아이디어가 현실에 나오고, 많은 사람이 이용하기도 하죠.<em>(저거 내아이디어인데 부들부들😡)</em>
		 <br><br><br>
		 개발자가 없어서? 함께 할 팀원이 없어서? 돈과 시간이 없어서?<br>
		 하지 못하는 이유를 찾는 건 참 쉽고도 많아요.
		 <br><br><br>
		 지금 여러분이 어떤 위치에서 무슨 일을 하고 있는지는 중요하지 않습니다.😌<br>
		 당장 많은 수익을 얻고자 하지 않아도 돼요.🙂<br>
		 "아이디어를 실현 할 수 있는 능력을 쌓는다"라는 거 자체가 강력한 무기가 될 거에요.🥊🥊
		
		</div>

</div>  
        <hr>
        <br><br><br><br><br>





<div class="band2">
		<img class = "rimg" alt="" src="../images/수학.PNG"> 

		

		<div id="content">
		 <h1><strong>여기를 주목해주세요 🔎</strong></h1><br> 
		 <p> 여기, 수학 올림피아드에서 최연소 금상을 받은 천재 개발자가 있어요.<br>
		 tvn 드라마 '스타트업'을 보신 분들은 아시겠지만, 주인공 남도산(남주혁)은 뛰어난 기술력을 보유하고 있음에도  불구하고 여러 위기에 직면합니다.<br>
	
		 그래도 부족했던 지난날을 떠올리며 방향을 잡고 정답을 찾아가는 모습이 그려집니다.<br>
		 <br>
		 날이 갈수록 성장하는 남도산처럼 여러분은 일단 시작해 보세요.<br>
		 <em>Start(시작) +Up(성장), 시작</em>하면 올라갈 수 있어요💪<br>
		 <br>
		 이번 큐레이션은 (아래 특별할인 코드를 놓치지 마세요!!!🌟)<br>
		 반짝이는 청춘의 이야기가 담긴 드라마 (스타트업)에서 나오는 인공지능 기술 강의를 모아봤어요.
		 
		
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