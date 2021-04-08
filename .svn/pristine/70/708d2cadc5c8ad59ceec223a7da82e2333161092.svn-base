<%@page import="vo.MemberVO"%>
<%@page import="vo.ReplyVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title><meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="../css/List_com.css">
	<style>
	</style>
	<script>
		
	
		$(function() {
			$("#BoardAddform").on("submit", function(){
				var title = $("#post_title").length;
				var content = $("#post_cont").length;
				if(title == 0 || content == 0 ){
					alert("입력한 내용이 없습니다");
					return false;  // 서버로의 전송을 취소한다.
				}
				return true;  // 서버로 전송작업을 수행한다.
			});
		})
		
	</script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<%MemberVO memberVo = (MemberVO)session.getAttribute("mVo");%>
	<input type="hidden" id="board_no" value="<%=request.getAttribute("board_no")%>"></input>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market💻</strong></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar"></div>
			<ul class="nav navbar-nav navbar-center">
				<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li> <!-- 메인으로 올라가는 버튼 -->
				<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">강의실</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span class="caret"></span></a>
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



	<!-- Container (The Band Section) -->

	<div id="band"> 
 
 
		<div id="left">
			<h2><strong>커뮤니티</strong></h2><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2" style="color: black">📬묻고 답하기</a><br><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1" style="color: black">📝공지사항</a><br><br>
		</div>
	 
		<div id = "center">
			<br><br><br>
				<%
					PostVO postVo = (PostVO)request.getAttribute("postVo");
				%>	
				<form id = "BoardAddform" method = "post"  action="<%=request.getContextPath() %>/board/BoardUpdate.do?board_no=<%=request.getAttribute("board_no")%>&post_no=<%=postVo.getPost_no()%>">
					<label>제 목 </label><br>
					<input type='text' id='post_title' name="post_title" size="80%" value="<%=postVo.getPost_title() %>"><br>​<br>
					<label>내용</label><br>
					<textarea rows = "10" cols = "80"  id = "post_cont" name="post_cont" ><%=postVo.getPost_cont() %></textarea><br>
					<input type = "submit" value = "등록">
				</form>
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
				<li><a>공지사항</a></li>
				<li>묻고답하기</li>
			</ul>
			<hr style="color:white">
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
