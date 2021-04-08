package lecture.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.IAction;

public class ClassInsertForm implements IAction {
	private static final long serialVersionUID = 1L;
       
	@Override
	public boolean isRedirect() {
		return false;
	}

	public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String Lec_title = request.getParameter("Lec_title");
		System.out.println(Lec_title);
		
		request.setAttribute("Lec_title", Lec_title);
		
		return "/lecture/classInsert.jsp";
	}

}