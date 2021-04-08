package lecture.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.IAction;

public class ClassUpdateForm implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 실제 처리할 내용을 기술하고
		// 처리가 끝난 후에 보여줄 View페이지를 반환하면 된다.
		request.setCharacterEncoding("utf-8");
		
		String class_list = request.getParameter("Class_list");
		String Lec_title = request.getParameter("Lec_title");
		String class_nm = request.getParameter("Class_nm");
		String video = request.getParameter("Video");

		
		
		request.setAttribute("class_list", class_list);
		request.setAttribute("Lec_title", Lec_title);
		request.setAttribute("class_nm", class_nm);
		request.setAttribute("video", video);

		
		
		return "/lecture/classUpdate.jsp";
	}

}
