package service;

import java.sql.SQLException;
import java.util.List;

import dao.BoardDaoImpl;
import dao.DonApplyDaoImpl;
import dao.IBoardDao;
import dao.IDonApplyDao;
import vo.DonApplyVO;
import vo.PostVO;
import vo.ReplyVO;

public class DonApplyServiceImpl implements IDonApplyService {

	private IDonApplyDao dao;
	private static IDonApplyService service;
	
	private DonApplyServiceImpl() {
		dao = DonApplyDaoImpl.getDao();
	}
	
	public static IDonApplyService getService() {
		if(service == null) service = new DonApplyServiceImpl();
		
		return service;
	}
	
	

	@Override
	public List<DonApplyVO> donapplyList() {
			List<DonApplyVO> list = null;
		
		try {
			list = dao.donapplyList();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
				
		return list;
	}

	@Override
	public int deletedonapply(int no) {
			int cnt = 0;
		
		try {
			cnt = dao.deletedonapply(no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	@Override
	public int updatedon(int no) {
			int cnt = 0;
		
		try {
			cnt = dao.updatedon(no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

}
