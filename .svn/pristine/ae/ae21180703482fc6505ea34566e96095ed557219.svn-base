package dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ibatis.config.SqlMapClientFactory;
import vo.DonApplyVO;

public class DonApplyDaoImpl implements IDonApplyDao{

	
	private SqlMapClient smc;
	private static IDonApplyDao dao;
	
	private DonApplyDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static IDonApplyDao getDao() {
		if(dao == null) dao = new DonApplyDaoImpl();
		return dao;
	}
	
	@Override
	public List<DonApplyVO> donapplyList() throws SQLException {
		return smc.queryForList("don.donapplyList");
	}
	@Override
	public int deletedonapply(int no) throws SQLException {
		// TODO Auto-generated method stub
		return smc.delete("don.deletedonapply", no);
	}
	@Override
	public int updatedon(int no) throws SQLException {
		// TODO Auto-generated method stub
		return smc.update("don.updatedon", no);
	}

}
