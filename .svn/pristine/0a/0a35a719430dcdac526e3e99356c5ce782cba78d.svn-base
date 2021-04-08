package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import service.IMemberService;
import service.MemberServiceImpl;
import web.IAction;

public class IdCheckAction implements IAction {

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
		
		int cnt = service.idCheck(mem_id);
		int cnt2 = service.nickCheck(nick_name);
		
		Gson gson = new Gson();
		String result = null;
		
		if(cnt==1){ // 중복되는 경우
			result = gson.toJson("Fail");
		}else{ // 중복되지 않을 경우
			result = gson.toJson("OK");
		}
		
		if(cnt2 == 1) {
			result = gson.toJson("Fail");
		}else{
			result = gson.toJson("OK");
		}
		
		PrintWriter out = response.getWriter();
		out.println(result);
		response.flushBuffer();
		
		return null;  // Ajax로 호출한 Action객체의 반환값은 null로 한다.
	}

}
