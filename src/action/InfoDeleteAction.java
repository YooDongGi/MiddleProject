package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import service.IMemberService;
import service.MemberServiceImpl;
import vo.MemberVO;
import web.IAction;

public class InfoDeleteAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		
		String mem_pass = request.getParameter("mem_pass");
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		
		System.out.println(mem_pass);
		System.out.println(mem_no);
		
		IMemberService service = MemberServiceImpl.getService();
		
		MemberVO memvo = new MemberVO();
		memvo.setMem_pass(mem_pass);
		memvo.setMem_no(mem_no);
		
		int cnt = service.idpwCheck(memvo);
		
		Gson gson = new Gson();
		String result = null;
		
		if(cnt==1){  //비밀번호가 일치하면
			result = gson.toJson("OK");
			service.deletemember(mem_no);
		}else{ // 비밀번호가 일치하지 않을 경우
			result = gson.toJson("Fail");
		}
		
		out.println(result);
		
		return null;
	}

}
