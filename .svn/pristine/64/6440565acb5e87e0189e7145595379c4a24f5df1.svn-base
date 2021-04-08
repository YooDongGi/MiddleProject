package service;

import java.sql.SQLException;

import dao.IReportDao;
import dao.ReportDaoImpl;
import vo.ReportVO;

public class ReportServiceImpl implements IReportService{

	private IReportDao dao;
	private static IReportService service;
	
	private ReportServiceImpl() {
		dao = ReportDaoImpl.getDao();
	}
	
	public static IReportService getService() {
		if(service ==null) service = new ReportServiceImpl();
		
		return service;
	}
	
	@Override
	public int insertReport(ReportVO vo) {
		
		int cnt = 0;
		
		try {
			cnt = dao.insertReport(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	
}
