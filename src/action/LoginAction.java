package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.IMemberService;
import service.MemberServiceImpl;
import vo.MemberVO;
import web.IAction;

public class LoginAction implements IAction {

	@Override
	public boolean isRedirect() {
	
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String memID = request.getParameter("mem_id");
		String memPW = request.getParameter("mem_pass");
		
		PrintWriter out = response.getWriter();
		MemberVO memvo = new MemberVO();
		memvo.setMem_id(memID);
		memvo.setMem_pass(memPW);

		IMemberService service = MemberServiceImpl.getService();

		if(service.idCheck(memID) == 0){   // 아에 없는 회원이면 아이디가 없으면
			out.println("<script>");
			out.println("alert('입력한 아이디가 존재하지 않습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return null;
			
		}else if(!memPW.equals(service.pwCheck(memID))){ // 비밀번호가 다르면
			out.println("<script>");
			out.println("alert('비밀번호가 일치하지 않습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return null;
			
		}else { // 입력한 아이디와 비밀번호가 일치하면
			memvo = service.getMember(memID);
			
			if(memvo.getState() != 1) {
				out.println("<script>");
				out.println("alert('활성화되지않은 아이디입니다.');");
				out.println("history.go(-1);");
				out.println("</script>");
				out.close();
				
				return null;
				
			}
			HttpSession session = request.getSession();
			// 공유(session) 설정
			session.setAttribute("mVo", memvo);
//			session.setAttribute("no", memvo.getMem_no());
//			session.setAttribute("id", memvo.getMem_id());
//			session.setAttribute("nickname", memvo.getNick_name());
		}

		return "/main.do";

	}

}
