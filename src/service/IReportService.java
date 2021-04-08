package service;

import java.util.List;

import vo.ReportVO;

public interface IReportService {

	/**
	 * 게시글을 신고하는 메소드
	 * @param vo	신고할 게시글 정보
	 * @return		성공여부
	 */
	public int insertReport(ReportVO vo);
	
	public List<ReportVO> selectReport(int no);
	
	public int updateReport(ReportVO vo);
	
	public int selectReportCnt(int no);
	
	public int black(int no);
	
	public int deleteReport(int no);
}
