package basket.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BasketServiceImpl;
import service.IBasketService;
import vo.BasketVO;
import web.IAction;

public class BasketInsertAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int lec_title = Integer.parseInt(request.getParameter("lec_title"));
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		int state = Integer.parseInt(request.getParameter("state"));
		
		BasketVO vo = new BasketVO();
		
		vo.setLec_title(lec_title);
		vo.setMem_no(mem_no);
		vo.setState(state);
		
		IBasketService service = BasketServiceImpl.getService();
		
//		HttpSession session = request.getSession();
//		
//		MemberVo memVo (MemberVO)session.getAttribute("memVo");
		
		int cnt = service.insertBasket(vo);
		
		System.out.println("요놈"+cnt);
		return "/basket/basketList.do?state=" + state+ "&mem_no=" + mem_no;
	}

}
