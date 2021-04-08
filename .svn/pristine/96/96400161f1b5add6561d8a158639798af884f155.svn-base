<%@page import="vo.MemberVO"%>
<%@page import="vo.LectureVO"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%!String category = null;%>
<%!String dif = null;%>
<%!List<LectureVO> lectureList;%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="../css/List_lec.css">
	
</head>


	<script type="text/javascript">
		document.onkeydown = function(e) {
			var evtK = (e) ? e.which : window.event.keyCode;
			var isCtrl = ((typeof isCtrl != 'undefiend' && isCtrl) || ((e && evtK == 17) || (!e && event.ctrlKey))) ? true : false;
  
			if((isCtrl && evtK == 82) || evtK == 116) {
				if(e) { evtK = 505; } else { event.keyCode = evtK = 505; }
  			}
  
  			if(evtK == 505) {

   				// 자바스크립트에서 현재 경로는 받아내는 메소드로 대치.
   				location.reload(location.href);
   			return false;
  			}
 		}
		var mem_no = "";
		$(function() {
			mem_no = $("#mem_no").val();
			$('#addbtn').on('click', function() {
// 				console.log($("#board_no").val());
				location.href = "<%=request.getContextPath()%>/lecture/lectureInsertForm.do?mem_no=" + mem_no;
			})
		})
	</script>

</head>



<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<% MemberVO memberVo = (MemberVO)session.getAttribute("mVo"); %>
	<input type = "hidden" id = "mem_no" value = "<%=memberVo.getMem_no() %>"/>
	<nav class="navbar navbar-default navbar-fixed-top">
  		<div class="container-fluid">
    		<div class="navbar-header">
      			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>                        
      			</button>
      			<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market💻</strong></a>
      
    		</div>
    		<div class="collapse navbar-collapse" id="myNavbar"></div>
      		<ul class="nav navbar-nav navbar-center">
        		<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li>
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
        		<li class="dropdown">
				 	<a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE <span class="caret"></span></a> 
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

	<!-- Container (The Band Section) -->
	<div class="mySlides">
		<h2><span>코딩, 체계적인 구조화로 끝낸다.</span></h2>
		<span class="banner">강좌 관련자료 이외에도 다양한 자료 및 정보를 제공해 드립니다. </span><br> 
		<span class="banner">* 게시판 성격에 맞지 않는 글은 1:1 문의로 이동될 수 있으며, 욕설,비방글은 삭제될 수 있습니다. </span><br>
	</div>
 
  	<div class="isotope_filters inited"><br>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do" style="color: black">All</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=java"  class="theme_button">자바</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=mysql"  class="theme_button">mysql</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=html"  class="theme_button">HTML</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=javaScript"  class="theme_button">javaScript</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=jquery"  class="theme_button">jquery</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=css"  class="theme_button">css</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=python"  class="theme_button">python</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=spring"  class="theme_button">spring</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=Linux"  class="theme_button">Linux</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=c"  class="theme_button">C언어</a>
 	</div>

	<div id="band"><br>
 		<div id="center">
			<div id="cont">
				<h1><strong>강의목록</strong></h1>
				<hr id=List> 
				<%
					category = (String)request.getAttribute("cate");
					if(category != null){
				%>
						<form class="bt" action="<%=request.getContextPath()%>/lecture/lectureDif.do" method="post">
							<input type="hidden" name = "cate" value="<%=category %>">
							<input type="hidden" name = "dif" value="초급">
							<button>초급</button>
						</form>
						<form class="bt" action="<%=request.getContextPath()%>/lecture/lectureDif.do" method="post">
							<input type="hidden" name = "cate" value="<%=category %>">
							<input type="hidden" name = "dif" value="중급">
							<button>중급</button>
						</form>
			
			
						
				<%
					}
				%>
				<% if(memberVo != null && (memberVo.getAut() == 1 || memberVo.getAut() == 9)) { %>
					<span id = "abc" ><input id = "addbtn" type = "button" value = "등록" ></span><br>
				<% } %>			

				<hr id = List>
				<%
				// 서블릿에서 만들어서 보낸 데이터를 보여준다.
				lectureList = (List<LectureVO>)request.getAttribute("lectureList");

				int count = 0;
				for(LectureVO vo : lectureList){
					count++;
					if(memberVo != null) {
				%>

				<div class = "lecture" style=" cursor: pointer;" onclick="location.href='<%=request.getContextPath()%>/lecture/lecture.do?Lec_title=<%=vo.getLec_title() %>'">
				<%  } else {%>
				
				<div class = "lecture" style=" cursor: pointer;" onclick="location.href='<%=request.getContextPath()%>/member/loginForm.do'">
				<% } %>
				<!-- 	<img id="lec_img"src="../image/shopping.jpg">  -->
					<img id="lec_img"src="<%=vo.getImage()%>"> 
					<h3><%=vo.getLec_nm() %></h3>	<!-- 강좌명 -->
					<p id="pri">💸<%=vo.getPrice() %>원</p>	<!-- 가격 -->
<!-- 					&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <button id="add">강좌소개 더보기</button> -->
				</div>
	
				<%
					if(count != 0 && count % 3 == 0){
				%>
				<br><br>
				<% 
					}
				}
				%>

 				</div>
				<div id="right"></div>
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


</body>
</html>