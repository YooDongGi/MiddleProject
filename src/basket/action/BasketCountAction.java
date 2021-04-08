package basket.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BasketServiceImpl;
import service.IBasketService;
import vo.BasketVO;
import web.IAction;

public class BasketCountAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IBasketService service = BasketServiceImpl.getService();
		
		int lec_title = Integer.parseInt(request.getParameter("lec_title"));
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
//		int state = Integer.parseInt(request.getParameter("state"));
		
		BasketVO vo = new BasketVO();
		
		vo.setLec_title(lec_title);
		vo.setMem_no(mem_no);
//		vo.setState(state);
		
		int cnt = service.getBasketCount(vo);
		
		request.setAttribute("cnt", cnt);
		
		return "/basket/basketCount.jsp";
	}

}
