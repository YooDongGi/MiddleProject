<%@page import="vo.MemberVO"%>
<%@page import="vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="../css/List_com.css">
	<style>
		
	</style>
	<script>
		
		var board_no = "";
		$(function() {
			board_no = $("#board_no").val();
			$('#addbtn').on('click', function() {
				console.log($("#board_no").val());
				location.href = "<%=request.getContextPath()%>/board/BoardAddForm.do?board_no=" + board_no;
			})
		})
	</script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<% MemberVO memberVo = (MemberVO)session.getAttribute("mVo"); %>
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
		<div class="mySlides"><br>
	        <span class="dona">묻고 답해요</span><br>
	        <span class="dona">함께하는 러닝마켓 커뮤니티 </span><br>
	        <span class="dona">모르면 묻고, 해답을 찾아보세요 </span><br>
    	</div>
 
 
		<div id="left">
			<h2><strong>커뮤니티</strong></h2><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2" style="color: black">📬묻고 답하기</a><br><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1" style="color: black">📝공지사항</a><br><br>
		</div>
	 
	 	<div>
			<form action="<%=request.getContextPath()%>/board/Search.do" class="search">
				<input type="hidden" id="board_no" name = "board_no" value="<%=request.getAttribute("board_no")%>"></input>
				<label for="gsearch"></label>
				
				<input type="search" id="gsearch"  placeholder="검색🔍" name="gsearch">
				<input type="submit" class="btn btn-info" value="🔍">
			</form><br><br>
		</div>
		
		<div id = "center"><br>
			<% if(memberVo != null) { %>
				<span id = "abc"><input id = "addbtn" type = "button" value = "등록" ></span><br>
			<% } %>
			
			<hr>
			<div id = "cont">
		 		<table class = "BList">
					<tr>
						<th>글 번호 </th>
						<th class = "title">제목</th>
						<th>작성자</th>
					</tr>
					<%
						List<PostVO> qnalist = (List<PostVO>)request.getAttribute("list");
						int count = qnalist.size();
						
						for(PostVO postVo : qnalist){
					%>
							<tr>
								<td><%=count %></td>
								<td class = "title">
									<a href="<%=request.getContextPath()%>/board/BoardView.do?board_no=<%=postVo.getBoard_no() %>&post_no=<%=postVo.getPost_no()%>">
										<%=postVo.getPost_title()%>
									</a>							
								</td>
								<td><%=postVo.getNick_name() %></td>
							</tr>
					<%		
							count--;
						}
					%>
				</table>
			</div>
	 	</div>
	 	<div id="right">
			<img  class="list" src="../images/커뮤니티.png" >
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