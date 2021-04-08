<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
%>
<script type="text/javascript">

$(function() {
	var upDateNick = "";  // 중복 체크할 때의 ID가 저장될 변수
	$('.nicksubmit').on('click',function(){
		var nickName = $("#nick_name").val();
		var id = $("#mem_id").val();
		
			$.ajax({
				url : "<%=request.getContextPath()%>/memberInfo/UpdateInfo.do",
				method : "post",
				data : { "nick_name" : nickName , "mem_id" : id },
				dataType : "json",
				success : function(result){
					
					if(result=="OK"){   //변경이 성공되면
						upDateNick = nickName;  // 변경된 회원닉네임을 전역변수에 저장
						alert("변경 완료!");
						$('#nick_name').text(upDateNick);
						
					}else{ // 중복될 때
						alert("변경 실패!");
						upDateNick = "";
					}
				},
				error : function(xhr){
					alert("상태 : " + xhr.status);
				}
			});
			
		});
	
});


</script>
<style>
</style>
<title>Learning Mark : 마이페이지</title>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	
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
          <strong><span>프로필설정</span></strong>
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
    
    <p class="menu-label"><a href="<%=request.getContextPath() %>/memberInfo/Infodeleteform.do" class="btn_wrap ">회원탈퇴</a></p>
  
  </div>
 </aside>


<div id="center"><br>
	<div class="tabs">
      <ul>
         <li class="is-active"><a href="">프로필 설정</a></li>
      </ul>
    </div>

<div class="profile_edit_container">
      <div class="profile_edit">
        <form class="field profile_upload">
          <div class="file is-boxed">
            <label class="file-label">
              <input type="file" class="file-input" name="profile_image">
              <span class="file-cta">
                <img class="thumbnail_image" src="https://cdn.inflearn.com/public/main/profile/default_profile.png" alt="suyeon Kim님의 프로필">
              </span>
            </label>            
          </div>
           <small class="warning"></small>
        </form>
  	<div class="right">
          <label for="nick_name" class="label input_label">
            <span>아이디</span>          
          </label>        
            <input id="mem_id" type="text" class="input" value="<%=memberVo.getMem_id() %>" disabled>
		</div>

        <div class="right">
          <label for="nick_name" class="label input_label">
            <span>닉네임</span>          
          </label>        
            <input id="nick_name" type="text" class="input" value="<%=memberVo.getNick_name()%>"  placeholder="변경할 닉네임을 입력해주세요">  
		</div>

	</div>
	<div class="button_container">
	<button type="button" class="nicksubmit button" value="저장하기">저장하기</button>
   </div>    
</div>    

<div class="email_edit">
        <label for="email_change" class="label input_label">
          <span>이메일</span>
          <small>(※ 이메일 변경 후 재인증 필요)</small>
        </label>
        <div class="edit_container">
          <input id="email_change" type="email" class="input" value="<%=memberVo.getMem_email()%>" placeholder="변경할  이메일을 입력해주세요">
          
          <small class="invalid"></small>
          <div class="button_container">
           <button type="button" class="mailsubmit button" value="저장하기">저장하기</button>
          </div>
        </div>
</div>

<div class="password_edit">
        <div class="password_edit_wrapper">
          <label for="new_password" class="label input_label"><span>비밀번호</span></label>        
        </div>
        
        <div class="send_password_wrapper">
          <span>비밀번호를 새롭게 발급받아보세요!</span>
          <button class="button is-primary e-send-password">발급 받기</button>
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