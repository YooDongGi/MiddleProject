package lecture.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.IAction;

public class LectureUpdateForm implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String Lec_title = request.getParameter("Lec_title");
		String mem_no = request.getParameter("Mem_no");
		String intro = request.getParameter("Intro");
		String lec_nm = request.getParameter("Lec_nm");
		String price = request.getParameter("Price");
		String detail_cont = request.getParameter("Detail_cont");
		String preview_video = request.getParameter("Preview_video");
		
		
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("Lec_title", Lec_title);
		request.setAttribute("mem_no", mem_no);
		request.setAttribute("intro", intro);
		request.setAttribute("lec_nm", lec_nm);
		request.setAttribute("price", price);
		request.setAttribute("detail_cont", detail_cont);
		request.setAttribute("preview_video", preview_video);
		
		
		return "/lecture/update.jsp";
	}

}
