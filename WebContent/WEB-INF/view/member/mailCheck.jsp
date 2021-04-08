<%@page import="service.MemberServiceImpl"%>
<%@page import="util.SHA256"%>
<%@page import="service.IMemberService"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");
	String code = request.getParameter("code");

	IMemberService service = MemberServiceImpl.getService();

	String userID = null;
	if(session.getAttribute("mem_id") != null) {
		userID = (String) session.getAttribute("mem_id");
	}

	if(userID == null) {

		PrintWriter script = response.getWriter();

		script.println("<script>");
		script.println("alert('로그인을 해주세요.');");
		script.println("location.href = 'loginForm.do'");
		script.println("</script>");
		script.close();
		return;

	}

	String userEmail = service.getUserEmail(userID);

	boolean rightCode = (new SHA256().getSHA256(userEmail).equals(code)) ? true : false;

	if(rightCode == true) {

		service.mailCheck(userID);

		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('인증에 성공했습니다.');");
		script.println("location.href = '/Test/member/loginForm.do'");
		script.println("</script>");
		script.close();		
		return;

	} else {

		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('유효하지 않은 코드입니다.');");
		script.println("</script>");
		script.close();		
		return;
	}
    
%>