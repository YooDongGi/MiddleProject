package service;

import java.util.List;

import vo.DonApplyVO;
import vo.LectureVO;
import vo.MemberVO;

public interface IMemberService {

	public MemberVO getMember(String mem_id);
	
	public int idCheck(String mem_id);
	
	public int nickCheck(String nick_name);
	
	public String pwCheck(String mem_id);
	
	public String joinMember(MemberVO vo);
	
	public String getUserEmail(String mem_id);
	
	public int mailCheck(String mem_id);
	
	public int nickUpdate(MemberVO vo);
	
	public List<LectureVO> getmyClassList(int mem_no); 
		
	public int idpwCheck(MemberVO vo);
	
	public int deletemember(int mem_no);
	
	public int insertdonapply(DonApplyVO donvo);
	
	public List<MemberVO> getAllMemberList();
	
	public List<MemberVO> blackmemberList();
	
	public List<MemberVO> getAllTList();
	
	public List<MemberVO> donMemberList();
	
	public int tClassCnt(int mem_no);
	
	public List<LectureVO> tClassList(int mem_no);
	
	public List<LectureVO> getProfit(int mem_no); 
}
