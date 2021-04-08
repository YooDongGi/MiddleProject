<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/List_don.css" type="">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/memberJoinCheck.js"></script>
<script>	
	var id = <%= session.getAttribute("id") %>;
		
	$(function(){
			 $('#reportbtn').on('click', function() {
				$('#rpModal').modal('show');
			});
			 
			 /*			
 			 //제출 버튼을 눌렀을 때
			$('.btn-success').on("submit", function(){
				
				var memId = $("#mem_id").val();
				var memCallmail = $("#mem_callmail").val(); 
				var memNm = $("#mem_nm").val();
				var donConact = $("#don_conact").val(); 
				var memField = $("#mem_field").val(); 
				
	 		}); */
	});

</script>
<style>
#cover {
    width: 550px;
    height: 100%;
	padding: 12px 24px;
	display: flex;
	flex-direction: column;
}
.modal_header h2 {
	font-size: 24px;
	color: #333;
	font-weight: 700;
	margin: 10px;
	line-height: normal;
}
.modal_header .special {
    box-shadow: inset 0 -15px 0 #b6f6d6;
}
.form-group {
    margin-bottom: 20px;
}
.form-group label {
    display: block;
    font-size: 14px;
    font-family: 'Noto Sans KR';
    color: #595959;
    margin-bottom: 8px;
}
input[type=text] {
    padding: 10px 16px;
    border-radius: 4px;
    border: 1px solid #dedede;
    color: #333;
    font-size: 16px;
    width: 100%;
    height: 90%;
}
.form-group textarea {
    padding: 10px 16px;
    border-radius: 4px;
    border: 1px solid #dedede;
    color: #333;
    font-size: 16px;
    width: 100%;
    resize: none;
    min-height: 250px;
}

.modal_footer {
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 10px 0;
    margin-top : 45px;
}
/* .btn-success { */
/*     display: flex; */
/*     align-items: center; */
/*     justify-content: center; */
/*     padding: 12px 32px; */
/*     font-size: 15px; */
/*     font-weight: 700; */
/*     background-color: #1dc078; */
/*     color: #fff; */
/*     box-shadow: 0 0 4px 0 rgba(0,0,0,.24); */
/* } */
btn btn-success
</style>
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
				<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">강의실</a></li>
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
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">소개</a></li>
						<li><a href="<%=request.getContextPath() %>/main/List_don.do">재능기부신청</a></li>
						<li><a href="#">멤버십신청</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>


	<div id="band"> 
		<div id="center">
			<a href="<%=request.getContextPath() %>/board/DonBoard.do?board_no=3">재능기부 게시판</a>
		<br><br>
<!-- 			<input id="reportbtn" type='button' value='재능기부 신청하기' > -->
			<!-- 베너 -->
			<img id="img1" src="../images/지식3.png">
		</div>
		<div class="cont">
			<img id="img" src="../images/재능기부.PNG">
		</div>
		<div class="cont">
			<h2 id="h2">
				<strong>🧩지식공유자가 되어주세요!</strong>
			</h2>
			<img id="img2" src="../images/재능기부2.PNG">
		</div>
	</div>

	 <div class="mySlides">
		<h2>나의 재능에 가치를 기부하세요</h2>
		<input id = "reportbtn" class="btn btn-success" type='button' value='재능기부 신청하기'>
		<div class="dona">
			온라인 강의로만 3억원!(1년간 실 수령액)<br> 나의 재능을 나눠 사람들에게 배움의 기회를 주고, 의미있는
			대가를 가져가세요<br> Learning Market은 나만의 재능으로 의미있는 수익과 공유가 가능한 한국 유일한
			플랫폼입니다.<br> 
		</div>
		<div class="w3-center"></div>
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
	
	<%
					if(memberVo != null) {
	%>
<!-- Modal(재능기부 요청안) -->
	<div id="rpModal" class="modal fade" role="dialog">
		<div class="modal-dialog">
		  <div class="modal-content" id="cover">
		    <div class="modal_header">
		      <h3><button type="button" class="close" data-dismiss="modal">&times;</button></h3>    
					<h2>감사합니다,&nbsp; <%=memberVo.getMem_id() %>님<br> 
					<span class="special">재능기부자가 되기 위해서</span><br> 아래 정보가 필요해요.
					</h2>
			 </div>
				
				<div class="modal-body">
							
					<form name="rpform" id="rpform" method="post" action="<%=request.getContextPath()%>/main/Listdon_apply.do">
						<input type="hidden" id="mem_no" name="mem_no" value="<%= memberVo.getMem_no() %>">
						<div class="form-group">
							<label>아이디</label>
							<input type="text" class="form-control" name="mem_id" value="<%=memberVo.getMem_id()%>" disabled>
						</div>
						<div class="form-group">
							<label>연락받을 이메일</label>
							<input type="text" class="form-control" name="mem_callmail" id="mem_callmail" placeholder="자주 사용하는 이메일을 입력해주세요.">
						</div>
						<div class="form-group">
							<label>나를 소개하는 글</label>
							<textarea class="form-control" rows="5" name="don_conact" id="don_conact" placeholder="지식공유자님을 간단하게 소개해 주세요 :)"></textarea>
						</div>
						<div class="form-group">
					      <label>희망 분야</label>
					        <input type="text" class="form-control" name="mem_field" id="mem_field" placeholder="(예시) IT프로그래밍  /크리에이티브 / 업무스킬">					        
						</div>
						<div class="modal_footer">						
						   <button type="submit" class="btn btn-success">제출</button>
						</div>
					</form>
					
				</div>
			</div>
		</div>
	</div>	
	<%
					}
	%>
</body>
</html>