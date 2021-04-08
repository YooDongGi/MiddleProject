package dao;

import java.sql.SQLException;
import java.util.List;

import vo.ReportVO;

public interface IReportDao {

	/**
	 * 게시글을 신고하는 메소드
	 * @param vo	신고할 게시글 정보
	 * @return		성공여부
	 */
	public int insertReport(ReportVO vo) throws SQLException;
	
	public List<ReportVO> selectReport(int no) throws SQLException;
	
	public int updateReport(ReportVO vo) throws SQLException;
	
	public int selectReportCnt(int no) throws SQLException;
	
	public int black(int no) throws SQLException;
	
	public int deleteReport(int no) throws SQLException;
}
