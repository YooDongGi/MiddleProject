<%@page import="util.Gmail"%>
<%@page import="service.MemberServiceImpl"%>
<%@page import="util.SHA256"%>
<%@page import="service.IMemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.Address"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%
		IMemberService service = MemberServiceImpl.getService();
	
		
		String userID = null;		
		if(session.getAttribute("mem_id") != null) {
			userID = (String) session.getAttribute("mem_id");	
		}
		
		String host = "http://localhost/Test/";		
		String from = "dutlstorgl@gmail.com";
		String to = service.getUserEmail(userID);
		String code = SHA256.getSHA256(to);

		//사용자에게 보낼 메시지
		String subject = "[Learning Market]회원가입을 위한 이메일 인증 메일입니다.";
		String content = "다음 링크에 접속하여 이메일 인증을 진행해주세요. " 
		        + "<a href='" + host + "member/mailcheck.do?code=" + code
				+ "'>이메일 인증하기</a>";

		Properties p = new Properties();
		p.put("mail.smtp.user", from);
		p.put("mail.smtp.host", "smtp.googlemail.com");  // 이메일 발송을 처리해줄 SMTP서버
		p.put("mail.smtp.port", "465"); 				 //TLS 587, SSL 465 
		p.put("mail.smtp.starttls.enable", "true");     // 로그인시 TLS를 사용할 것인지 설정
		p.put("mail.smtp.auth", "true");   			   //SMTP 서버의 인증을 사용
		p.put("mail.smtp.debug", "true");
		p.put("mail.smtp.socketFactory.port", "465"); 
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.sockerFactory.fallback", "false");

		try {
			Authenticator auth = new Gmail();
			Session ses = Session.getInstance(p, auth);
			ses.setDebug(true);
			MimeMessage msg = new MimeMessage(ses);
			msg.setSubject(subject);
			Address fromAddr = new InternetAddress(from);
			msg.setFrom(fromAddr);
			Address toAddr = new InternetAddress(to);
			msg.addRecipient(Message.RecipientType.TO, toAddr);
			msg.setContent(content, "text/html; charset=UTF8");
			Transport.send(msg);
			
		} catch (Exception e) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이메일 인증 오류입니다.')");
			script.println("history.back();");
			script.println("</script>");
		}
		session.setAttribute("mem_id", session.getAttribute("mem_id"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learning Market</title>
</head>
<style>
body{
    background: black;

}


h1{
   font-size: 50px;
   color: black;
   font-weight:400;
   width: 100%;
   height:130px; 
   text-align: center;
  
} 
p{
   font-size: 30px;
   color: black;
   font-weight:400;
   width: 100%;
   height:130px; 
   text-align: center;
}

#center2{
 font-size: 20px;
   color: black;
   font-weight:400;
   width: 100%;
   height:130px; 
   text-align: center;
}
.banner{
   font-size: 50px;
   padding:30px; 
   margin:500px; 
  text-align: center;
   min-width:100% 
}


#center{
 min-height: 500px;
 min-width:  50%;
/*  padding:50px; */
 margin:200px 500px 300px 500px;
 background: white;
border: 1px solid gray;
 display: inline-block;
/*  float: left; */
}


</style>


<body>
<div id="head1">
     

</div>

<div id="center">
    
    <h1>💌 등록 완료</h1>
    <p>이메일 주소 인증메일이 전송되었습니다.<br>
              본 이메일 계정에 들어가서 인증을 완료해주세요</p><br>
     <p id="center2">(인증이 완료 되어야 로그인이 가능합니다.)</p>


</div>


</body>
</html>