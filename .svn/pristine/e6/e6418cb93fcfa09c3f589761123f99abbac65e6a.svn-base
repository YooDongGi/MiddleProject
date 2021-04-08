package service;

import java.sql.SQLException;
import java.util.List;

import dao.BasketDaoImpl;
import dao.IBasketDao;
import vo.BasketVO;
import vo.MyclassVO;

public class BasketServiceImpl implements IBasketService {

	private IBasketDao dao;
	
	private static IBasketService service;
	
	private BasketServiceImpl() {
		dao = BasketDaoImpl.getDao();
	}
	
	public static IBasketService getService() {
		if(service == null) service = new BasketServiceImpl();
		return service;
	}

	@Override
	public List<BasketVO> getBasketList(BasketVO vo) {
		
		List<BasketVO> list = null;
		
		try {
			list = dao.getBasketList(vo);
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int insertBasket(BasketVO vo) {
		
		int cnt = 0;
		
		try {
			cnt = dao.insertBasket(vo);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int getBasketCount(BasketVO vo) {
		
		int cnt = 0;
		
		try {
			cnt = dao.getBasketCount(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int moveBasket(BasketVO vo) {
		
		int cnt = 0;
		
		try {
			cnt = dao.moveBasket(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteBasket(BasketVO vo) {
		
		int cnt = 0;
		
		try {
			cnt = dao.deleteBasket(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int insertMyclass(MyclassVO mvo) {
		int cnt = 0;
		try {
			cnt = dao.insertMyclass(mvo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}
}
