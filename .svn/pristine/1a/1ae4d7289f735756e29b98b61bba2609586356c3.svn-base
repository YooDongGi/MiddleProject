package lecture.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.IAction;

/**
 * Servlet implementation class LectureInsertForm
 */
public class LectureInsertForm implements IAction {
	private static final long serialVersionUID = 1L;
       
	@Override
	public boolean isRedirect() {
		return false;
	}

	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String mem_no = request.getParameter("mem_no");
		
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("mem_no", mem_no);
		
		return "/lecture/lectureInsert.jsp";
	}

}
