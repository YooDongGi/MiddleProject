<%@page import="service.MemberServiceImpl"%>
<%@page import="service.IMemberService"%>
<%@page import="java.util.List"%>
<%@page import="vo.LectureVO"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%





%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../css/List_com.css">
<link rel="stylesheet" href="../css/mypage.css">
<link rel="stylesheet" href="../css/out.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<%
	MemberVO memberVo = (MemberVO)session.getAttribute("mVo");
	MemberVO teachernm = (MemberVO)request.getAttribute("teachernm");
%>
<script type="text/javascript">
$(function(){ 
	   var chkMemId = "";  // 중복 체크할 때의 ID가 저장될 변수
	   
	   // 탈퇴하기 클릭
	   $("#btnDelete").on("click", function(){
	      var passwd = $("#mem_pass").val();     // 입력한 비밀번호 가져오기
	   	 var mem_no = $('#mem_no').val();
	      $.ajax({
	         url : "<%=request.getContextPath()%>/memberInfo/Infodelete.do",
	         method : "post",
	         data : { "mem_pass" : passwd , "mem_no" : mem_no},
	         dataType : "json",
	         success : function(result){
	            if(result) {
	            	
	            	if(result=="OK"){   
						alert("탈퇴 완료!");
						location.href = "<%=request.getContextPath()%>/member/logoutForm.do";
					}else{ // 중복될 때
						alert("비밀번호가 올바르지 않습니다!");
					}
	            }
	         },
	         error : function(xhr){
	            alert("상태 : " + xhr.status);
	         }
	      });
	      
	   })
})
</script>
<title>Learning Market : 회원탈퇴</title>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
<input type="hidden" id="mem_no" value="<%=memberVo.getMem_no()%>"></input>
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
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2">묻고 답하기</a></li>
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
					</ul>
				</li>
				
				<li><a href="<%=request.getContextPath() %>/memberInfo/mypageForm.do">마이페이지</a></li>
				<li><a href="<%=request.getContextPath() %>/main/List_don.do">재능기부</a></li>
				<li><a href="<%=request.getContextPath()%>/member/logoutForm.do">로그아웃</a></li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>">
						<img src = "./images/바구니.png" width = "30px;" height="25px;"/><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=1">수강바구니</a></li>
						<li><a href="<%=request.getContextPath() %>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=2">위시리스트</a></li>
					</ul>
				</li>
				
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
<!-- Container (The Band Section) 회원 마이페이지 -->
<div id="band"> 
		<div class="mySlides" style="height: 80px;"><br>
	        <span class="dona">마이페이지</span><br>
    	</div>
 

<aside id="left">
  <div class="menu_container">
  
    <p class="menu-label">프로필관리</p>
    <ul class="menu-list">
      <li>
        <a href="<%=request.getContextPath() %>/memberInfo/mypageForm.do" class="btn_wrap ">
          <span>프로필설정</span>
        </a>
      </li>
    </ul>
    
    <p class="menu-label">학습 관리</p>
    <ul class="menu-list">
      <li>
        <a href="<%=request.getContextPath() %>/memberInfo/myclasslist.do?mem_no=<%=memberVo.getMem_no() %>" class="btn_wrap ">
          <span>강의 목록</span>
        </a>
      </li>
      <li>
        <a href="/my-questions" class="btn_wrap ">
          <span>수강평 목록</span>
        </a>
      </li>
    </ul>
    
    <p class="menu-label">수강신청 관리</p>
    <ul class="menu-list">
      <li>
        <a href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=1" class="btn_wrap ">
          <span>수강 바구니</span>
        </a>
      </li>
      <li>
        <a href="/coupons" class="btn_wrap ">
          <span>멤버십</span>
        </a>
      </li>
      <li>
        <a href="<%=request.getContextPath() %>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=2" class="btn_wrap ">
          <span>위시리스트</span>
        </a>
      </li>
    </ul>
    
    <p class="menu-label">
      <a href="<%=request.getContextPath() %>/memberInfo/Infodeleteform.do" class="btn_wrap ">회원탈퇴</a>
    </p>
  
  </div>
 </aside>


<div id="center"><br>
	<div class="tabs">
      <ul>
         <li class="is-active"><a href="">탈퇴</a></li>
      </ul>
    </div>
    
    
        <div class="optional" style="margin-left: 50px;">
        <hr>
          <div class="notice">
            <h3 style="color:red;">탈퇴 안내 사항</h3><br>
            <p>Learning Market 서비스에 만족하지 못하셨나요? 탈퇴 전에 아래 유의사항을 꼭 읽어주세요</p>
            <p>🙇🏻&zwj;♂️ 감사합니다 🙇🏻&zwj;♀️</p><br>
            <p>1. 회원이 작성한 콘텐츠(동영상, 게시물, 댓글 등)는 자동적으로 삭제되지 않으며, 만일 삭제를 원하시면 탈퇴 이전에 삭제가 필요합니다.</p>
            <p>2. 탈퇴 후 동일한 메일로 재가입이 가능하지만, 탈퇴 한 계정과 연동되지 않습니다.</p>
            <p>3. 탈퇴 후 연동된 소셜 계정 정보도 사라지며, 소셜 로그인으로 기존 계정 이용이 불가능합니다.</p>
            <p>4. 현재 비밀번호를 입력하고 탈퇴하기를 누르시면 위 내용에 동의하는 것으로 간주됩니다.</p>
          </div>
          <input class="input" type="password" id="mem_pass" placeholder="현재 비밀번호">
          <small class="invalid on_error">비밀번호를 확인해주세요.</small>
          <div class="button_container">
            <button id="btnDelete" class="button">탈퇴하기</button>
          </div>
        </div>
    
	<div id="right">
<!-- 			<img  class="list" src="../images/커뮤니티.png" > -->
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
			<hr style="color: white">
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