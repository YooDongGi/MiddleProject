package dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ibatis.config.SqlMapClientFactory;
import vo.PostVO;
import vo.ReplyVO;
import vo.ReportVO;

public class BoardDaoImpl implements IBoardDao{

	private SqlMapClient smc;
	private static IBoardDao dao;
	
	private BoardDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static IBoardDao getDao() {
		if(dao == null) dao = new BoardDaoImpl();
		return dao;
	}
	
	@Override
	public List<PostVO> getAllQnA() throws SQLException {
		
		return smc.queryForList("post.getAllQnA");
	}
	@Override
	public List<PostVO> getAllNotice() throws SQLException {
		return smc.queryForList("post.getAllNotice");
	}
	@Override
	public PostVO getBoardView(int post_no) throws SQLException {
		return (PostVO) smc.queryForObject("post.getBoardView", post_no);
	}
	@Override
	public List<ReplyVO> getReplyView(int post_no) throws SQLException {
		return smc.queryForList("post.getReplyView", post_no);
	}
	@Override
	public int insertBoard(PostVO vo) throws SQLException {
		return (int) smc.insert("post.insertBoard", vo);
		
	}
	@Override
	public int deleteBoard(int post_no) throws SQLException {
		return smc.delete("post.deleteBoard", post_no);
	}
	@Override
	public int updateBoard(PostVO vo) throws SQLException {
		return smc.update("post.updateBoard", vo);
	}
	@Override
	public int insertReply(ReplyVO vo) throws SQLException {
		return (int) smc.insert("post.insertReply", vo);
	}
	@Override
	public int deleteReply(int reply_no) throws SQLException {
		return smc.delete("post.deleteReply", reply_no);
	}
	@Override
	public List<PostVO> boardSearch(PostVO vo) throws SQLException {
		return smc.queryForList("post.boardSearch" , vo);
	}
	@Override
	public List<PostVO> getAllDon() throws SQLException {
		return smc.queryForList("post.getAllDon");
	}
	@Override
	public int updateDonBoard(PostVO vo) throws SQLException {
		return smc.update("post.updateDonBoard", vo);
	}

}
