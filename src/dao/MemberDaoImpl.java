package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import ibatis.config.SqlMapClientFactory;
import util.BuildedSqlMapClient;
import vo.DonApplyVO;
import vo.LectureVO;
import vo.MemberVO;

public class MemberDaoImpl implements IMemberDao {
	private SqlMapClient smc;
	private static IMemberDao dao;
	
	private MemberDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IMemberDao getDao() {
		if(dao == null) dao = new MemberDaoImpl();
		return dao;
	}

	@Override
	public MemberVO getMember(String mem_id) throws SQLException {
		return (MemberVO) smc.queryForObject("member.getmember", mem_id);
	}
	
	@Override
	public int idCheck(String mem_id) throws SQLException {
		return (Integer) smc.queryForObject("member.idcheck", mem_id);
	}
	
	@Override
	public int nickCheck(String nick_name) throws SQLException {
		return (Integer) smc.queryForObject("member.nickcheck", nick_name);
	}
	
	@Override
	public String pwCheck(String mem_id) throws SQLException {
		return (String)smc.queryForObject("member.passwdcheck", mem_id);
	}

	@Override
	public String joinMember(MemberVO vo) throws SQLException {
		return (String)smc.insert("member.joinmember", vo);
	}

	@Override
	public String getUserEmail(String mem_id) throws SQLException {
		return (String) smc.queryForObject("member.getusermail" ,mem_id);
	}

	@Override
	public int mailCheck(String mem_id) throws SQLException {
		return smc.update("member.mailcheck", mem_id);
	}

	@Override
	public int nickUpdate(MemberVO vo) throws SQLException {
		return smc.update("member.nickupdate", vo);
	}
	
	@Override
	public List<LectureVO> getmyClassList(int mem_no) throws SQLException {
		return smc.queryForList("member.getmyclassList", mem_no);
	}


	@Override
	public int idpwCheck(MemberVO vo) throws SQLException {
		return (Integer) smc.queryForObject("member.idpwcheck", vo);
	}

	@Override
	public int deletemember(int mem_no) throws SQLException {
		return smc.update("member.deletemember", mem_no);
	}

	@Override
	public int insertdonapply(DonApplyVO donvo) throws SQLException {
		String st = (String) smc.insert("member.insertdonapply", donvo);
		int cnt = 0;
		if(st == null) cnt = 1;
		
		return cnt;
	}

	@Override
	public List<MemberVO> getAllMemberList() throws SQLException {
		return smc.queryForList("member.getAllMemberList");
	}

	@Override
	public List<MemberVO> blackmemberList() throws SQLException {
		return smc.queryForList("member.blackList");
	}

	@Override
	public List<MemberVO> getAllTList() throws SQLException {
		return smc.queryForList("member.getAllTList");
	}

	@Override
	public List<MemberVO> donMemberList() throws SQLException {
		return smc.queryForList("member.donMemberList");
	}
	
	@Override
	public List<LectureVO> tClassList(int mem_no) throws SQLException {
		return smc.queryForList("member.tclassList",mem_no);
	}

	@Override
	public int tClassCnt(int mem_no) throws SQLException {
		return (Integer) smc.queryForObject("member.tclasscnt",mem_no);
	}

	@Override
	public List<LectureVO> getProfit(int mem_no) throws SQLException {
		return smc.queryForList("member.getprofit", mem_no);
	}
}
