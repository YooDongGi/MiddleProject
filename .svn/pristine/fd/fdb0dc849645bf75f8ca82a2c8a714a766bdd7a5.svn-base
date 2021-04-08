package manager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IReportService;
import service.ReportServiceImpl;
import vo.ReportVO;
import web.IAction;

public class UpdateReportAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int report_no = Integer.parseInt(request.getParameter("report_no"));
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		
		ReportVO vo = new ReportVO();
		vo.setReport_status(9);
		vo.setReport_no(report_no);
		
		IReportService service = ReportServiceImpl.getService();
		service.updateReport(vo);
		
		int cnt = service.selectReportCnt(mem_no);
		
		if(cnt == 3) {
			service.black(mem_no);
		}
		
		System.out.println(cnt);

		return "/manager/Accept.do";
		
	}

}
