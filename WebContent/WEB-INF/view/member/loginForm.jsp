<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learning Market : 로그인</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
<link rel="stylesheet" href="https://cdn.inflearn.com/dist/css/MAIN.29d84df994a8cbea6130.css">
</head>
<body>
<div class="modal">
<div class="dimmed">
</div>
<section class="signin_modal">
  <header class="header">
 
  <button type="button">❌</button>
</header>

		<form class="main_form" action="<%=request.getContextPath()%>/member/login.do" method="post">

			<label class="atom_field"> 
			<span class="label visually_hidden">아이디</span> 
			<input class="input id" type="text" autofocus="true" placeholder="아이디" name="mem_id" id="mem_id"> 
			</label> 
			<label class="atom_field"> 
			<span class="label visually_hidden">비밀번호</span> 
			<input class="input pwd" type="password" placeholder="비밀번호" name="mem_pass" id="mem_pass">
			</label>
			<input type="submit" value="로그인" class="atom_button button signin e-confirm">
		</form>

		<div class="sub_form"><p>비밀번호를 잊어버리셨나요?</p> <a class="find_password">비밀번호 찾기</a></div>
  <div class="footer_form">
    <div class="social">
      <a rel="noreferrer noopener" class="button facebook_auth oauth2" data-type="facebook" href="https://facebook.com/dialog/oauth?response_type=code&amp;client_id=1101702136522636&amp;redirect_uri=https%3A%2F%2Fwww.inflearn.com%2Fauth%2Ffacebook&amp;scope=email">
        <i class="fab fa-facebook-f"></i><span>페이스북 로그인</span>
      </a>
      <a rel="noreferrer noopener" class="button google_auth oauth2" data-type="google" href="https://accounts.google.com/o/oauth2/v2/auth?access_type=offline&amp;prompt=consent&amp;scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile&amp;response_type=code&amp;client_id=887875630717-ror9t8ig4obhvokdij07eoochpqbu5kf.apps.googleusercontent.com&amp;redirect_uri=https%3A%2F%2Fwww.inflearn.com%2Fauth%2Fgoogle">
        <i class="fab fa-google"></i><span>구글 로그인</span>
      </a>
      <a rel="noreferrer noopener" class="button github_auth" data-type="github" href="https://github.com/login/oauth/authorize?response_type=code&amp;client_id=5fd8e44b142806d9cbea&amp;redirect_uri=https%3A%2F%2Fwww.inflearn.com%2Fauth%2Fgithub&amp;scope=user%3Aemail">
        <i class="fab fa-github"></i><span>깃허브 로그인</span>
      </a>
      <a rel="noreferrer noopener" class="button apple_auth oauth2" data-type="apple" href="https://appleid.apple.com/auth/authorize?client_id=com.inflab.inflearn.web&amp;redirect_uri=https://www.inflearn.com/auth/apple&amp;response_type=code id_token&amp;scope=email%20name&amp;response_mode=form_post">
        <i class="fab fa-apple"></i><span>애플 로그인</span>
      </a>
    </div>
  </div>
  <div class="sub_form"><p>Learning Market 회원이 아니신가요?</p>
 	<a href="<%=request.getContextPath()%>/member/join.do">회원가입하기</a>
 	</div>
</section>
</div>
</body>
</html>
