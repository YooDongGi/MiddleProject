package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.IAction;

public class DonBoardUpdateFormAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		String post_no = request.getParameter("post_no");
		String post_title = request.getParameter("post_title");
		String post_cont = request.getParameter("post_cont");
		String do_video = request.getParameter("do_video");
		
		
		request.setAttribute("post_no",post_no);
		request.setAttribute("board_no",board_no);
		request.setAttribute("post_title", post_title);
		request.setAttribute("post_cont", post_cont);
		request.setAttribute("do_video", do_video);

		return "/board/DonBoardUpdateForm.jsp";
	}

}
