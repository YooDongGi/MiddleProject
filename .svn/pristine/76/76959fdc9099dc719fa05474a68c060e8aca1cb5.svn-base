package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.IMemberService;
import service.MemberServiceImpl;
import vo.MemberVO;
import web.IAction;

public class JoinAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
		String mem_id = request.getParameter("mem_id");
		
		IMemberService service = MemberServiceImpl.getService();

		// joinForm.jsp에서  동일한 id가 없을 떄를 확인한 것을 받아서	
		MemberVO memvo = new MemberVO();
		memvo.setMem_id(mem_id);
		memvo.setMem_pass(request.getParameter("mem_pass"));
		memvo.setMem_nm(request.getParameter("mem_nm"));
		memvo.setNick_name(request.getParameter("nick_name"));
		memvo.setMem_email(request.getParameter("mem_email"));
		memvo.setMem_hp(request.getParameter("mem_hp"));
		 
		service.joinMember(memvo);
		
		HttpSession session = request.getSession();
		session.setAttribute("mem_id", mem_id);
		
		return "/member/mailSend.jsp";
	}

}
