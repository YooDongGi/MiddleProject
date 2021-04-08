package service;

import java.util.List;

import vo.DonApplyVO;

public interface IDonApplyService {
	
	public List<DonApplyVO> donapplyList();
	
	public int deletedonapply(int no);
	
	public int updatedon(int no);
}
