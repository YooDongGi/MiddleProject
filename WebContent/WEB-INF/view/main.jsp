<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="./css/main.css">
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function(){
			// Initialize Tooltip
			$('[data-toggle="tooltip"]').tooltip(); 
			// Add smooth scrolling to all links in navbar + footer link
			$(".navbar a, footer a[href='#myPage']").on('click', function(event) {
				// Make sure this.hash has a value before overriding default behavior
				if (this.hash !== "") {
					// Prevent default anchor click behavior
					event.preventDefault();
					// Store hash
					var hash = this.hash;
					// Using jQuery's animate() method to add smooth page scroll
					// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
					$('html, .contents').animate({
						scrollTop: $(hash).offset().top
						}, 900, function(){
							// Add hash (#) to URL when done scrolling (default click behavior)
							window.location.hash = hash;
					});
				} // End if
			});
// 			$('#dapplybtn').on('click' , function() {
<%-- 				href = "<%=request.getContextPath() %>/main/List_don.do" --%>
// 			})
		})
	</script>
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
				<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li> <!-- 메인으로 올라가는 버튼 -->
				<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">강의실</a></li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span class="caret"></span></a>
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
					} else if(memberVo.getAut() == 1){       //강사로 로그인 할 때 -> 강사 마이페이지 이동
				%>
				<li><a href="<%=request.getContextPath() %>/teacherInfo/teacherform.do">마이페이지</a></li>
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
						<img src = "./images/바구니.png" width = "30px;" height="25px;"/><span class="caret"></span></a>
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
				<!-- <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li> -->
			</ul>
		</div>
	</nav>
	<!-- Container (The Band Section) -->

	<div id="band">
	<!--   --------------------------------------------------------------------------------------------------- -->
	<!-- 롤링베너  -->
		<script>
			$(document).ready(function() {
				var $banner = $(".banner").find("ul");
				var $bannerWidth = $banner.children().outerWidth();//이미지의 폭
				var $bannerHeight = $banner.children().outerHeight(); // 높이
				var $length = $banner.children().length;//이미지의 갯수
				var rollingId;

				//정해진 초마다 함수 실행
				rollingId = setInterval(function() {
					rollingStart();
				}, 4000);//다음 이미지로 롤링 애니메이션 할 시간차
				
				function rollingStart() {
					$banner.css("width", $bannerWidth * $length + "px");
					$banner.css("height", $bannerHeight + "px");
					//alert(bannerHeight);
					//배너의 좌측 위치를 옮겨 준다.
					$banner.animate({
						left : -$bannerWidth + "px"
						}, 1500, function() { //숫자는 롤링 진행되는 시간이다.
							//첫번째 이미지를 마지막 끝에 복사(이동이 아니라 복사)해서 추가한다.
							$(this).append("<li>" + $(this).find("li:first").html() + "</li>");
						
							//뒤로 복사된 첫번재 이미지는 필요 없으니 삭제한다.
							$(this).find("li:first").remove();
							//다음 움직임을 위해서 배너 좌측의 위치값을 초기화 한다.
							$(this).css("left", 0);
							//이 과정을 반복하면서 계속 롤링하는 배너를 만들 수 있다.
							});
					}
			});
		</script>

		<div class="contents">
			<div class="banner">
				<ul>
					<li><img src="./images/베너1.png" width="340" height="210px"></li>
					<li><img src="./images/베너2.png" width="340" height="210px"></li>
					<li><img src="./images/베너3.png" width="340" height="210px"></li>
					<li><img src="./images/베너4.png" width="340" height="210px"></li>
				</ul>
			</div>
		</div>
	</div>
	
	<!--   --------------------------------------------------------------------------------------------------- -->
	<!-- 강좌목록 -->
	<div id="category">
		<h3><strong>여기서 시작해보세요!</strong> <sub style="color: red">ready!! </sub></h3>
		 	<img class="list" src="./images/목록1.png" width="270" height="450px">
		 	<img  class="list" src="./images/목록2.png" width="270" height="450px">
		 	<img  class="list" src="./images/목록3.png" width="270" height="450px">
		 	<img  class="list" src="./images/목록4.png" width="270" height="450px">
		 	<img  class="list" src="./images/목록5.png" width="270" height="450px">
	</div>
	<div id="catagory2">
          <h3><strong>읽어보기!</strong> <sub style="color:blue">read me!!</sub></h3> 
          <a href="<%=request.getContextPath() %>/main/Read.do?no=1"><img class="list2" src="./images/읽어보기1.png"></a>
          <a href="<%=request.getContextPath() %>/main/Read.do?no=2"><img class="list2" src="./images/읽어보기2.png"></a>
   	</div>
	
	<!--   --------------------------------------------------------------------------------------------------- -->

	<div id="intro">
		<h6>
			<strong>370,170명이 러닝 마켓과 함께합니다.</strong>
		</h6>
			학교에서 배우기 어렵거나 큰 비용을 <br> 지불해야만 배울 수 있는 전문적인 지식들을 제공합니다. <br>
			오픈 플랫폼의 이점을 통해 다양성과 경제성을 모두 높입니다.
		<input type='button' value='수강평 더보기' id="@" style="color: black">
	</div>
	
	<div id="outro">
          <img class="list3" src="./images/베너5.png">
	</div>

	<div class="w3-content" style="max-height: 190px">
		<div class="mySlides" style="width: 100%">

			<h2 >나의 지식에 가치를 기부하세요</h2>
			<div class="dona">온라인 강의로만 3억원!(1년간 실 수령액)<br> 
			나의 지식을 나눠 사람들에게 배움의 기회를 주고, 의미있는 대가를 가져가세요<br>
			Learning Market은 지식으로 의미있는 수익과 공유가 가능한 한국 유일한 플랫폼입니다.<br> 
				<div class="w3-center">
					<div class="w3-section">
						<button class="w3-btn btn-secondary" onclick="plusDivs(-1)">❮ Prev</button>
						<button class="w3-btn btn-primary" onclick="plusDivs(1)">Next ❯</button>
					</div>
				</div>
				<a href="<%=request.getContextPath() %>/main/List_don.do"><input type='button' value='재능기부 신청하기' id="dapplybtn" style="color:black"></a>
			</div>
		</div>
		
		<div class="mySlides mydona" style="width: 100%">
			<h2>멤버십 할인 혜택을 누려보세요</h2>
			<div class="dona">러닝 마켓 멤버십 활용하기!<br> 
			당신의 주머니가 가벼워지는 지름길<br>
			멤버십을 통해 당신이 누릴 수 있는 더 많은 혜택을 받아가세요<br> 
				<div class="w3-center">
					<div class="w3-section">
						<button class="w3-btn btn-secondary" onclick="plusDivs(-1)">❮ Prev</button>
						<button class="w3-btn btn-primary" onclick="plusDivs(1)">Next ❯</button>
					</div>
				</div>
				<input type='button' value='멤버십 신청하기' id="mapplybtn" style="color:black">
			</div>
		</div>
	</div>

	<!--   --------------------------------------------------------------------------------------------------- -->
	<!-- 재능기부, 멤버십 베너 -->
	<script>
		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function currentDiv(n) {
			showDivs(slideIndex = n);
		}

		function showDivs(n) {
			var i;
			var x = document.getElementsByClassName("mySlides");
			var dots = document.getElementsByClassName("demo");
			if (n > x.length) {
				slideIndex = 1
			}
			if (n < 1) {
				slideIndex = x.length
			}
			;
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(" w3-red", "");
			}
			x[slideIndex - 1].style.display = "block";
// 			dots[slideIndex-1].className += " w3-red"; // 오류나서 주석처리했는데 아무런 이상이 없음
		}
	</script>
	
	<!--   --------------------------------------------------------------------------------------------------- -->

	<!-- Footer -->
	<br><br>
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
	<!--   --------------------------------------------------------------------------------------------------- -->

</body>
</html>