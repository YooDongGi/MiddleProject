<%@page import="vo.MemberVO"%>
<%@page import="vo.ReplyVO"%>
<%@page import="vo.PostVO"%>
<%@page import="java.util.List"%>
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

	<%
		MemberVO memberVo = (MemberVO)session.getAttribute("mVo");
				PostVO postVo = (PostVO)request.getAttribute("boardView");
	
	%>
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
 
 
		<div id="left" >
			<h2><strong>커뮤니티</strong></h2><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2" style="color: black">📬묻고 답하기</a><br><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1" style="color: black">📝공지사항</a><br><br>
		</div>
	 
		<div id = "center"><br>
			<span id = "abc">
				<% if(memberVo != null){ 
				if(memberVo.getMem_no() == postVo.getMem_no()) { %>
				<input type = "button" value = "수정" id = "Updatebtn">	
				<input type = "button" value = "삭제" id = "Deletebtn">
				<% }  else {%>
				<input type = "button" value = "신고" id = "reportbtn">
				<% } }%>
			</span><br>
			
			<hr>
			<div id = "cont">
			
			<h1><%=postVo.getPost_title() %></h1>
			<hr style = "border: solid 1px black;">
			작성자 : <%=postVo.getNick_name() %> &nbsp; &nbsp; &nbsp;  작성일 : <%=postVo.getPost_date() %>
			<br><br>
			<%=postVo.getPost_cont()%>
			</div>
			<div id = "re">
			<%
				if(memberVo != null){
			%>
		 		<form id = "replyAddform" method = "post"  action="<%=request.getContextPath() %>/board/ReplyAdd.do?board_no=<%=request.getAttribute("board_no")%>&post_no=<%=request.getAttribute("post_no")%>">
					<h3>댓글 작성</h3>
					<input type="hidden" id="mem_no" name="mem_no" value = "<%=memberVo.getMem_no() %>"/>
		 			<textarea rows = "5" cols = "80" id = "reply_cont" name = "reply_cont" ></textarea>
		 			<input type = "submit" value = "댓글 등록" id = "replyAdd">
				</form>
			<%	} %>
		 		<hr>
			 	<h4>댓글 목록</h4>
			 	
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

	<!-- 신고 모달 창 -->
	<div id="rpModal" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">신고 사유</h4>
				</div>
				<div class="modal-body">
					<form id = "rpform" method = "post" action = "<%=request.getContextPath() %>/board/BoardReport.do">
						<input type="hidden" id="board_no" name = "board_no" value = "<%=postVo.getBoard_no() %>"/> 
						<input type="hidden" id="mem_no" name = "mem_no" value = "<%=postVo.getMem_no() %>"/>​
						<input type="hidden" id="post_no" name = "post_no" value="<%=request.getAttribute("post_no")%>"/>
						<label>신고 사유</label><br>
						<textarea rows = "10" cols = "50" id = "rpCont" name="rpCont"></textarea>
						<input type = "submit" id="rpSend" value = "전송">
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
