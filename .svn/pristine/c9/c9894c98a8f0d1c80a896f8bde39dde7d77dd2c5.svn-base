package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IReportService;
import service.ReportServiceImpl;
import vo.ReportVO;
import web.IAction;

public class BoardReportAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		int post_no = Integer.parseInt(request.getParameter("post_no"));
		String reason =request.getParameter("rpCont");
		
		ReportVO vo = new ReportVO();
		vo.setPost_no(post_no);
		vo.setMem_no(mem_no);
		vo.setReason(reason);
		
		IReportService service = ReportServiceImpl.getService();
		
		service.insertReport(vo);
		
		
		return "/board/BoardView.do?board_no="+board_no+"&post_no="+post_no;
	}

}
