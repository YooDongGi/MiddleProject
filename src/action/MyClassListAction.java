package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IMemberService;
import service.MemberServiceImpl;
import vo.LectureVO;
import vo.MemberVO;
import web.IAction;

public class MyClassListAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		IMemberService service = MemberServiceImpl.getService();
		
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		
		List<LectureVO> classList = service.getmyClassList(mem_no);

		
		request.setAttribute("classList", classList);

		
		return "/memberInfo/myclassList.jsp";
	}

}
