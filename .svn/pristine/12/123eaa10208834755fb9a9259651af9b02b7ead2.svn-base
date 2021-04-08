package manager.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IReportService;
import service.ReportServiceImpl;
import vo.ReportVO;
import web.IAction;

public class AcceptAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		

		IReportService service = ReportServiceImpl.getService();
		
		if(service.selectReport(1)!=null) {
		List<ReportVO> bereportlist = service.selectReport(1);
		request.setAttribute("bereportlist", bereportlist);
		}
		
		
		if(service.selectReport(9)!=null) {
		List<ReportVO> afreportlist = service.selectReport(9);
		request.setAttribute("afreportlist", afreportlist);
		}
		
		
		
		return "/manager/accept.jsp";
	}

}
