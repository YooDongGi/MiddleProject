package dao;

import java.sql.SQLException;
import java.util.List;

import vo.DonApplyVO;

public interface IDonApplyDao {
	
	public List<DonApplyVO> donapplyList() throws SQLException;

	public int deletedonapply(int no) throws SQLException;
	
	public int updatedon(int no) throws SQLException;
}