package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import service.IMemberService;
import service.MemberServiceImpl;
import vo.MemberVO;
import web.IAction;

public class UpdateInfoAction implements IAction{

	@Override
	public boolean isRedirect() {
	
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");

		String mem_id = request.getParameter("mem_id");
		String nick_name = request.getParameter("nick_name");
		IMemberService service = MemberServiceImpl.getService();
		
		MemberVO vo = new MemberVO();
		vo.setMem_id(mem_id);
		vo.setNick_name(nick_name);
		
		int cnt = service.nickUpdate(vo);
		
		System.out.println(cnt);
		
		Gson gson = new Gson();
		String result = null;
		
		if(cnt==1){  //변경 성공하면
			result = gson.toJson("OK");
		}else{ // 중복되지 않을 경우
			result = gson.toJson("Fail");
		}
		
		PrintWriter out = response.getWriter();
		out.println(result);
		response.flushBuffer();
		
		return null;  
	}
}