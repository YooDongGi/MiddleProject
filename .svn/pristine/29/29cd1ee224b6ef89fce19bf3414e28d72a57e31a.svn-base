package dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ibatis.config.SqlMapClientFactory;
import vo.ReportVO;

public class ReportDaoImpl implements IReportDao {

	private SqlMapClient smc;
	private static IReportDao dao;
	
	private ReportDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IReportDao getDao() {
		if(dao == null) dao = new ReportDaoImpl();
		return dao;
	}
	
	@Override
	public int insertReport(ReportVO vo) throws SQLException {
		return (int) smc.insert("report.insertReport", vo);
	}

	@Override
	public List<ReportVO> selectReport(int no) throws SQLException {
		return smc.queryForList("report.selectReport", no);
	}

	@Override
	public int updateReport(ReportVO vo) throws SQLException {
		return smc.update("report.updateReport", vo);
	}

	@Override
	public int selectReportCnt(int no) throws SQLException {
		
		return (int) smc.queryForObject("report.selectReportCnt",no);
	}
	
	@Override
	public int black(int no) throws SQLException {
		return (int) smc.update("report.black", no);
	}

	@Override
	public int deleteReport(int no) throws SQLException {
		// TODO Auto-generated method stub
		return (int) smc.delete("report.deleteReport", no);
	}

}
