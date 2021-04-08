package dao;

import java.sql.SQLException;

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

	
}
