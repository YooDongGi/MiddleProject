package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dao.IMemberDao;
import dao.MemberDaoImpl;
import vo.DonApplyVO;
import vo.LectureVO;
import vo.MemberVO;

public class MemberServiceImpl implements IMemberService {

	private IMemberDao dao;
	private static IMemberService service;
	
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getDao();
	}
	
	public static IMemberService getService() {
		if(service == null) service = new MemberServiceImpl();
		return service;
	}


	@Override
	public MemberVO getMember(String mem_id) {
		MemberVO vo = null;
		
		try {
			vo = dao.getMember(mem_id);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("getMember 에러 : " + e);
		}
		return vo;
	}

	@Override
	public int idCheck(String mem_id) {
		int result = 0;
		
		try {
			result = dao.idCheck(mem_id);
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("idCheck 에러 : " + e);
		}
		return result;
	}
	
	@Override
	public int nickCheck(String nick_name) {
		int result = 0;
		try {
			result = dao.nickCheck(nick_name);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return result;
	}

	
	@Override
	public String pwCheck(String mem_id) {
		String passwd = "";
		
		try {
			passwd = dao.pwCheck(mem_id);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("passwdCheck 에러 : " + e);
		}
		return passwd;
	}

	@Override
	public String joinMember(MemberVO vo) {
		String result = null;
		try {
			result = dao.joinMember(vo);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("joinMember 에러 : " + e);
		}
		return result;
	}

	@Override
	public String getUserEmail(String mem_id) {
		String getmail = null;
		try {
			getmail = dao.getUserEmail(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return getmail;
	}

	@Override
	public int mailCheck(String mem_id) {
		int result = 0;
		try {
			result = dao.mailCheck(mem_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public int nickUpdate(MemberVO vo) {
		int result = 0;
		try {
			result = dao.nickUpdate(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<LectureVO> getmyClassList(int mem_no) {
		List<LectureVO> classlist = null;
		try {
			classlist = dao.getmyClassList(mem_no);
			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return classlist;
	}

	@Override
	public int idpwCheck(MemberVO vo) {
		int cnt = 0;
		try {
			cnt = dao.idpwCheck(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deletemember(int mem_no) {	
		int cnt = 0;		
		try {
			cnt = dao.deletemember(mem_no);
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int insertdonapply(DonApplyVO donvo) {
		int result = 0;
		try {
			result = dao.insertdonapply(donvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		List<MemberVO> list = null;
		
		try {
			list = dao.getAllMemberList();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<MemberVO> blackmemberList() {
		
		List<MemberVO> list = null; 
		
		try {
			list = dao.blackmemberList();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<MemberVO> getAllTList() {
		
		List<MemberVO> list = null;
		
		try {
			list = dao.getAllTList();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<MemberVO> donMemberList() {
		
		List<MemberVO> list = null;
		
		try {
			list = dao.donMemberList();
		} catch (SQLException e) {
			list = null;
			e.printStackTrace();
		}
		
		return list;
	}
	
	@Override
	public List<LectureVO> tClassList(int mem_no) {
		List<LectureVO> list = null;
		try {
			list = dao.tClassList(mem_no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int tClassCnt(int mem_no) {
		int cnt = 0;
		try {
			cnt = dao.tClassCnt(mem_no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<LectureVO> getProfit(int mem_no) {
		List<LectureVO> profitlist = null;
		try {
			profitlist = dao.getProfit(mem_no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return profitlist;
	}
}
