package dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ibatis.config.SqlMapClientFactory;
import vo.BasketVO;
import vo.MyclassVO;

public class BasketDaoImpl implements IBasketDao {

	private SqlMapClient smc;
	private static IBasketDao dao;
	
	private BasketDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IBasketDao getDao() {
		if(dao == null) dao = new BasketDaoImpl();
		return dao;
	}
	
	@Override
	public List<BasketVO> getBasketList(BasketVO vo) throws SQLException {
		return smc.queryForList("basket.getBasketList", vo);
	}

	@Override
	public int insertBasket(BasketVO vo) throws SQLException {
		String st = (String) smc.insert("basket.insertBasket", vo);
		int cnt = 0;
		if(st == null) cnt = 1; 
		return cnt;
	}

	@Override
	public int getBasketCount(BasketVO vo) throws SQLException {
		return (int) smc.queryForObject("basket.getBasketCount", vo);
	}

	@Override
	public int moveBasket(BasketVO vo) throws SQLException {
		return smc.update("basket.moveBasket", vo);
	}

	@Override
	public int deleteBasket(BasketVO vo) throws SQLException {
		return smc.delete("basket.deleteBasket", vo);
	}

	@Override
	public int insertMyclass(MyclassVO mvo) throws SQLException {
		return (int) smc.insert("basket.insertMyclass", mvo);
	}

	
}
