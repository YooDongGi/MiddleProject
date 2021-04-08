package service;

import java.sql.SQLException;
import java.util.List;

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

	@Override
	public List<ReportVO> selectReport(int no) {
			List<ReportVO> list = null;
		
		try {
			list = dao.selectReport(no);
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int updateReport(ReportVO vo) {
			int cnt = 0;
		
		try {
			cnt = dao.updateReport(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int selectReportCnt(int no) {
		int cnt = 0;
		
		try {
			cnt= dao.selectReportCnt(no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int black(int no) {
			int cnt = 0;
		
		try {
			cnt = dao.black(no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteReport(int no) {
		int cnt =0;
		try {
			cnt = dao.deleteReport(no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}
}
