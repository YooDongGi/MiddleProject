package manager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IReportService;
import service.ReportServiceImpl;
import web.IAction;

public class DeleteReportAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int report_no = Integer.parseInt(request.getParameter("report_no"));

		IReportService service = ReportServiceImpl.getService();
		
		int cnt = service.deleteReport(report_no);

		return "/manager/Accept.do";
		
	}

}
