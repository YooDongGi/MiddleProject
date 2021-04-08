package action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.IMemberService;
import service.MemberServiceImpl;
import util.SHA256;
import vo.MemberVO;
import web.IAction;

public class MailCheckAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}
	
//	member/mailcheck.do  -> 이메일인증 누른후 , 페이지 이동
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return "/member/mailCheck.jsp";
	}

}
