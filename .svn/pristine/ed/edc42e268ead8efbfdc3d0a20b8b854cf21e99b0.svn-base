package manager.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.IMemberService;
import service.MemberServiceImpl;
import vo.MemberVO;
import web.IAction;

public class TeacherListAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		IMemberService service = MemberServiceImpl.getService();
		
		List<MemberVO> Tlist = service.getAllTList();
		
		request.setAttribute("Tlist", Tlist);
		
		
		return "/manager/teacherList.jsp";
	}

}
