package manager.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DonApplyServiceImpl;
import service.IDonApplyService;
import service.IMemberService;
import service.MemberServiceImpl;
import vo.DonApplyVO;
import vo.MemberVO;
import web.IAction;

public class DonMemberListAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		
		IMemberService service = MemberServiceImpl.getService();
		
		List<MemberVO> donmemberlist = service.donMemberList();
		
		
		IDonApplyService service2 = DonApplyServiceImpl.getService();
		if(service2.donapplyList()!=null) {
			List<DonApplyVO> donapplylist = service2.donapplyList();
			request.setAttribute("donapplylist", donapplylist);
		}
		request.setAttribute("donmemberlist", donmemberlist);
		
		return "/manager/donList.jsp";
	}

}
