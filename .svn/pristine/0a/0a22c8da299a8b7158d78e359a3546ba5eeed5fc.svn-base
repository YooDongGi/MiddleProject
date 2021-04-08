<%@page import="vo.BasketVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.MemberVO"%>
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
	<script>
	</script>
	
	
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<%
		MemberVO memberVo = (MemberVO)session.getAttribute("mVo");
	%>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market💻</strong></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar"></div>
			<ul class="nav navbar-nav navbar-center">
				<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li> <!-- 메인으로 올라가는 버튼 -->
				<li><a href="#myPage2">강의실</a></li>
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
					} else {
				%>
				<li><a href="<%=request.getContextPath() %>/memberInfo/mypageForm.do">마이페이지</a></li>
				<%		
					}
				%>
				<li><a href="#contact">재능기부</a></li>
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
						<li><a href="#">공지사항</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">소개</a></li>
						<li><a href="#">재능기부신청</a></li>
						<li><a href="#">멤버십신청</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>

<!-- Container (The Band Section) -->

<div id="band"> 
		<div class="mySlides"><br>
		<% if(request.getAttribute("state").equals(1) ) {
		%>
			수강바구니
		<%} else {%>
			위시리스트
		<% } %>
    	</div>
 
 
<!-- 		<div id="left">
		</div> -->
<div class="middle">
	<br><br>
	<div id="order_main" class=" ">
		<div id="columns">
			<div class="column is-8" style="min-width:100%;" >
			
			
			
			<%
					List<BasketVO> list = (List<BasketVO>)request.getAttribute("list");
					for(BasketVO basketVo : list) {
			%>
				<div class="box product_item_list" id="order_carts">
					<div class="product_item_middle">
						<div class="columns product_item">
							<div class="column is-3 thumbnail_middle">
								<div class="image is_thumbnail">
									<img id="lecture_img" src="<%=basketVo.getImage() %>" alt="">
								</div>
							</div>
							<div class="column content_middle">
								<div class="product_title">
								<%=basketVo.getLec_nm() %>
									<div>
										<span></span>
									</div>
								</div>
								<div class="product_meta">
									<div class="product_amount">
										<span>₩ <%=basketVo.getPrice() %></span>
									</div>
									<div class="is-right is-grouped-right">
										<button class="button is-small move_to_wish" fxd-data="{&quot;course_id&quot;:324437,&quot;cart_id&quot;:1058596,&quot;pay_price&quot;:55000}">
											<a href="<%=request.getContextPath()%>/basket/Basketmove.do?mem_no=<%=memberVo.getMem_no() %>&lec_title=<%=basketVo.getLec_title() %>&state=<%=basketVo.getState() %>">
											<% if(request.getAttribute("state").equals(1) ) { %>
							
												위시리스트로 이동
					
											<% } else { %>
											수강바구니로 이동
										<% }%>
										</a> 
										</button>
										<button class="button is-small remove_from_cart"
											fxd-data="{&quot;course_id&quot;:324437,&quot;cart_id&quot;:1058596,&quot;pay_price&quot;:55000}">
											<a href="<%=request.getContextPath() %>/basket/BasketDelete.do?mem_no=<%=memberVo.getMem_no() %>&lec_title=<%=basketVo.getLec_title() %>&state=<%=basketVo.getState() %>">바구니에서 삭제</a>
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			
			<%
					}
			%>
			</div>
			
		<div id="right" style="min-width:250px;" >	
		<% if(request.getAttribute("state").equals(1) ) {
		%>
		<div class="column is-4">
          <form class="card checkout_form">
            <div class="card-content">
              <div class="total_amount_middle" id="order_total_price">
                <div class="total_amount"><h2>구매하기</h2></div>
              </div>
              
				<div class="field">
				  <label class="label">이름</label>
				  <input type="text" class="input user_name" name="name" value="이름을 입력하시오." required="">
				</div>
				<div class="field">
				  <label class="label">전화번호(-제외 숫자만)</label>
				  <input type="text" class="input user_tel" name="tel" value="전화번호를 입력하시오." required="">
				</div>
				<div class="field">
				  <label class="label">이메일 주소</label>
				  <input type="email" class="input user_email" minlength="5" name="email" value="이메일을 입력하시오." required="">
				</div>
				<div class="field">
				  <label class="checkbox" style="margin:25px 30px;">
				    <input type="checkbox" required="">
				      (필수) 구매조건 및 개인정보취급방침 동의 <a href="#" class="has-text-info show_me_the_terms">(보기)</a>
				    <div class="please_agree">
				      <span class="has-text-danger">구매조건 및 결제대행 서비스 약관 동의하여야 합니다.</span>
				    </div>
				  </label>
				      <a href="<%=request.getContextPath() %>/basket/basketAllBuy.do?mem_no=<%=memberVo.getMem_no()%>">결제하기</a>
				</div>
				
         </div>
            
            <footer class="card-footer">
            </footer>
          </form>
        </div>	
        <%} %>
        </div>
</div>		
</div>	
</div>  <!-- band태그 끝! -->
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