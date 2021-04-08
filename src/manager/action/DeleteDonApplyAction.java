package manager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.DonApplyServiceImpl;
import service.IBoardService;
import service.IDonApplyService;
import service.IReportService;
import service.ReportServiceImpl;
import vo.MemberVO;
import vo.PostVO;
import vo.ReportVO;
import web.IAction;

public class DeleteDonApplyAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		
		IDonApplyService service = DonApplyServiceImpl.getService();
		service.deletedonapply(mem_no);


		return "/manager/donmemberList.do";
		
	}

}
