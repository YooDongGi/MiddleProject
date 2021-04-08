package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.IMemberService;
import service.MemberServiceImpl;
import vo.DonApplyVO;
import web.IAction;

public class ListDonApplyAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		
		String mem_callmail = request.getParameter("mem_callmail");
		String don_conact = request.getParameter("don_conact");
		String mem_field = request.getParameter("mem_field");
	
		IMemberService service = MemberServiceImpl.getService();
			
		DonApplyVO donvo = new DonApplyVO();
		donvo.setMem_no(mem_no);
		donvo.setMem_callmail(mem_callmail);
		donvo.setDon_conact(don_conact);
		donvo.setMem_field(mem_field);
		
		int result = service.insertdonapply(donvo);
		
		PrintWriter out = response.getWriter();
		if(result != 1){   // 결과값이 1이 아니면
			
			out.println("<script>");
			out.println("meta charset='UTF-8'");
			out.println("alert('다시 입력해주세요.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return null;			
		} else {			
			out.println("<script>");
			out.println("alert('재능기부자 신청이 완료 되었습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}
		
		return "/main/List_don.do";
	}

}
