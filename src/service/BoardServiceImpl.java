package service;

import java.sql.SQLException;
import java.util.List;

import dao.BoardDaoImpl;
import dao.IBoardDao;
import vo.PostVO;
import vo.ReplyVO;

public class BoardServiceImpl implements IBoardService {

	private IBoardDao dao;
	private static IBoardService service;
	
	private BoardServiceImpl() {
		dao = BoardDaoImpl.getDao();
	}
	
	public static IBoardService getService() {
		if(service == null) service = new BoardServiceImpl();
		
		return service;
	}
	
	
	
	@Override
	public List<PostVO> getAllQnA() {

		List<PostVO> list = null;
		
		try {
			list = dao.getAllQnA();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
				
		return list;
	}

	@Override
	public List<PostVO> getAllNotice() {
		
		List<PostVO> list = null;
		
		try {
			list = dao.getAllNotice();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public PostVO getBoardView(int post_no) {
		
		PostVO vo = null;
		
		try {
			vo = dao.getBoardView(post_no);
		} catch (SQLException e) {
			vo = null;
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public List<ReplyVO> getReplyView(int post_no) {
		
		List<ReplyVO> list = null;
		
		try {
			list = dao.getReplyView(post_no);
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int insertBoard(PostVO vo) {
		
		int cnt = 0;
		try {
			cnt = dao.insertBoard(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteBoard(int post_no) {
		
		int cnt = 0;
		
		try {
			cnt = dao.deleteBoard(post_no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateBoard(PostVO vo) {
		
		int cnt = 0;
		
		try {
			cnt = dao.updateBoard(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int insertReply(ReplyVO vo) {
		
		int reply_no = 0;
		
		try {
			reply_no = dao.insertReply(vo);
		} catch (SQLException e) {
			reply_no = 0;
			e.printStackTrace();
		}
		
		return reply_no;
	}

	@Override
	public int deleteReply(int reply_no) {
		
		int cnt = 0;
		
		try {
			cnt = dao.deleteReply(reply_no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<PostVO> boardSearch(PostVO vo) {
		List<PostVO> list = null;
		
		try {
			list = dao.boardSearch(vo);
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<PostVO> getAllDon() {
		List<PostVO> list = null;
		
		try {
			list = dao.getAllDon();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int updateDonBoard(PostVO vo) {
		int cnt = 0;
		
		try {
			cnt = dao.updateDonBoard(vo);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}



	

}
