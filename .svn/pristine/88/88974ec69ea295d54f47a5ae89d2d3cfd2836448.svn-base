package dao;

import java.sql.SQLException;
import java.util.List;

import vo.PostVO;
import vo.ReplyVO;

public interface IBoardDao {

	
	/**
	 * 공지사항 전체 조회
	 * @return	공지사항 전체 내용
	 */
	public List<PostVO> getAllNotice() throws SQLException;
	
	/**
	 * 질문 답하기 게시판의 모든 게시글 조회
	 * @return		질문 답하기 게시판의 모든 게시글
	 */
	public List<PostVO> getAllQnA() throws SQLException; 
	
	/**
	 * 게시글 번호에 맞는 게시글 내용을 불러오는 메소드
	 * @param post_no	게시글 번호
	 * @return			게시글 내용
	 */
	public PostVO getBoardView(int post_no) throws SQLException;
	
	/**
	 * 게시글 번호에 맞는 댓글을 불러오는 메소드
	 * @param post_no	게시글 번호
	 * @return			댓글
	 */
	public List<ReplyVO> getReplyView(int post_no) throws SQLException;
	
	/**
	 * 게시글을 작성하는 메소드
	 * @param vo	게시글 내용
	 * @return		성공 여부
	 */
	public int insertBoard(PostVO vo) throws SQLException;
	
	/**
	 * 게시글을 삭제하는 메소드
	 * @param post_no	삭제할 게시글 번호
	 * @return			성공 여부
	 */
	public int deleteBoard(int post_no) throws SQLException;
	
	/**
	 * 게시글을 수정하는 메소드
	 * @param vo	수정할 게시글 내용
	 * @return		성공 여부
	 */
	public int updateBoard(PostVO vo) throws SQLException;
	
	
	/**
	 * 댓글을 작성하는 메소드
	 * @param vo	댓글 내용
	 * @return		성공 여부
	 */
	public int insertReply(ReplyVO vo) throws SQLException;
	
	/**
	 * 댓글을 삭제하는 메소드
	 * @param reply_no		삭제할 댓글 번호
	 * @return				성공 여부
	 */
	public int deleteReply(int reply_no) throws SQLException;
	
	/**
	 * 제목으로 게시글을 검색하는 메소드
	 * @param post_title	입력받은 제목
	 * @return				찾은 게시글
	 */
	public List<PostVO> boardSearch(PostVO vo) throws SQLException;
	
	
	
	public List<PostVO> getAllDon() throws SQLException;
	
	public int updateDonBoard(PostVO vo) throws SQLException;
}
